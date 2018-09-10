package com.kotlin.base.ui.activity

import android.Manifest
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.util.Log
import android.view.View
import android.widget.AdapterView
import com.bigkoo.alertview.AlertView
import com.bigkoo.alertview.OnItemClickListener
import com.jph.takephoto.app.TakePhoto
import com.jph.takephoto.app.TakePhotoImpl
import com.jph.takephoto.compress.CompressConfig
import com.jph.takephoto.model.InvokeParam
import com.jph.takephoto.model.TResult
import com.jph.takephoto.permission.InvokeListener
import com.kotlin.base.utils.DateUtils
import com.kotlin.base.widgets.ProgressLoading
import com.lxhmmc.baselibrary.common.BaseApplication
import com.lxhmmc.baselibrary.injection.component.ActivityComponent
import com.lxhmmc.baselibrary.injection.component.DaggerActivityComponent
import com.lxhmmc.baselibrary.injection.module.ActivityModule
import com.lxhmmc.baselibrary.injection.module.LifecycleProviderModule
import com.lxhmmc.baselibrary.presenter.BasePresenter
import com.lxhmmc.baselibrary.presenter.view.BaseView
import com.lxhmmc.baselibrary.ui.activity.BaseActivity
import org.jetbrains.anko.toast
import java.io.File
import javax.inject.Inject
import com.jph.takephoto.permission.PermissionManager
import com.jph.takephoto.permission.PermissionManager.TPermissionType
import com.jph.takephoto.model.TContextWrap
import com.yanzhenjie.permission.AndPermission
import com.yanzhenjie.permission.PermissionListener


/*
    存在选择图片的Activity基础封装
 */
abstract open class BaseTakePhotoActivity<T : BasePresenter<*>> : BaseActivity(), BaseView, TakePhoto.TakeResultListener, InvokeListener {

    private lateinit var mTakePhoto: TakePhoto

    private lateinit var mTempFile: File

    @Inject
    lateinit var mPresenter: T


    private var invokeParam: InvokeParam? = null

    lateinit var mActivityComponent: ActivityComponent

    private lateinit var mLoadingDialog: ProgressLoading

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initActivityInjection()
        injectComponent()

        mTakePhoto = TakePhotoImpl(this, this)
        mTakePhoto.onCreate(savedInstanceState)

        mLoadingDialog = ProgressLoading.create(this)
//        ARouter.getInstance().inject(this)
    }

    /*
        Dagger注册
     */
    protected abstract fun injectComponent()

    /*
        初始化Activity Component
     */
    private fun initActivityInjection() {
        mActivityComponent = DaggerActivityComponent.builder().appComponent((application as BaseApplication).appComponent)
                .activityModule(ActivityModule(this))
                .lifecycleProviderModule(LifecycleProviderModule(this))
                .build()

    }

    /*
        显示加载框，默认实现
     */
    override fun showLoading() {
        mLoadingDialog.showLoading()
    }

    /*
        隐藏加载框，默认实现
     */
    override fun hideLoading() {
        mLoadingDialog.hideLoading()
    }

    /*
        错误信息提示，默认实现
     */
    override fun onError(text: String?) {
        text?.let { toast(it) }
    }

    /*
        弹出选择框，默认实现
        可根据实际情况，自行修改
     */
    protected fun showAlertView() {

        AlertView("选择图片", "", "取消", null, arrayOf("拍照", "相册"), this,
                AlertView.Style.ActionSheet, OnItemClickListener { o, position ->
            mTakePhoto.onEnableCompress(CompressConfig.ofDefaultConfig(), false)

            if (!AndPermission.hasPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.CAMERA)) {
                AndPermission.with(this).permission(Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.CAMERA).callback(object : PermissionListener{
                    override fun onSucceed(requestCode: Int, grantPermissions: MutableList<String>) {
                        takePhoto(position)
                    }
                    override fun onFailed(requestCode: Int, deniedPermissions: MutableList<String>) {
                    }
                }).start()
            } else {
                takePhoto(position)
            }
        }).show()

    }

    fun takePhoto(position: Int) {
        when (position) {
            0 -> {
                createTempFile()
                mTakePhoto.onPickFromCapture(Uri.fromFile(mTempFile))
            }
            1 -> mTakePhoto.onPickFromGallery()
        }
    }

    /*
        获取图片，成功回调
     */
    override fun takeSuccess(result: TResult?) {
        Log.d("TakePhoto", result?.image?.originalPath)
        Log.d("TakePhoto", result?.image?.compressPath)
    }

    /*
        获取图片，取消回调
     */
    override fun takeCancel() {
    }

    /*
        获取图片，失败回调
     */
    override fun takeFail(result: TResult?, msg: String?) {
        Log.e("takePhoto", msg)
    }

    /*
        TakePhoto默认实现
     */
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        mTakePhoto.onActivityResult(requestCode, resultCode, data)
    }

    /*
        新建临时文件
     */
    fun createTempFile() {
        val tempFileName = "${DateUtils.curTime}.png"
        if (Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())) {
            this.mTempFile = File(Environment.getExternalStorageDirectory(), tempFileName)
            return
        }

        this.mTempFile = File(filesDir, tempFileName)
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        //以下代码为处理Android6.0、7.0动态权限所需
        val type = PermissionManager.onRequestPermissionsResult(requestCode, permissions, grantResults)
        PermissionManager.handlePermissionsResult(this, type, invokeParam, this)
    }

    override fun invoke(invokeParam: InvokeParam?): TPermissionType {

        val type = PermissionManager.checkPermission(TContextWrap.of(this), invokeParam!!.method)
        if (TPermissionType.WAIT == type) {
            this.invokeParam = invokeParam
        }
        return type
    }
}
