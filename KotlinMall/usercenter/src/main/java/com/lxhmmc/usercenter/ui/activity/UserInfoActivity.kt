package com.lxhmmc.usercenter.ui.activity

import android.os.Bundle
import android.util.Log
import com.jph.takephoto.model.TResult
import com.kotlin.base.ui.activity.BaseTakePhotoActivity
import com.kotlin.base.utils.AppPrefsUtils
import com.kotlin.base.utils.GlideUtils
import com.kotlin.provider.common.ProviderConstant
import com.kotlin.user.data.protocol.UserInfo
import com.kotlin.user.utils.UserPrefsUtils
import com.lxhmmc.baselibrary.common.Constant
import com.lxhmmc.baselibrary.ext.loadImage
import com.lxhmmc.baselibrary.ext.onClick
import com.lxhmmc.usercenter.R
import com.lxhmmc.usercenter.injection.compoent.DaggerUserCompoent
import com.lxhmmc.usercenter.presenter.UserInfoPresenter
import com.lxhmmc.usercenter.presenter.view.UserInfoView
import com.qiniu.android.http.ResponseInfo
import com.qiniu.android.storage.UpCompletionHandler
import com.qiniu.android.storage.UploadManager
import kotlinx.android.synthetic.main.activity_user_info.*
import org.jetbrains.anko.toast
import org.json.JSONObject

class UserInfoActivity : BaseTakePhotoActivity<UserInfoPresenter>(), UserInfoView {
    override fun onGetTokenResult(success: String) {
        Log.i("UserInfoActivity", success)
        mUploadManager.put(mLocalFileUrl, null, success, object : UpCompletionHandler {
            override fun complete(key: String?, info: ResponseInfo?, response: JSONObject?) {
                mRemoteFileUrl = Constant.IMAGE_SERVER_ADDRESS + response?.get("hash")
                Log.i("test", mRemoteFileUrl)
                mUserIconIv.loadImage(this@UserInfoActivity, mRemoteFileUrl!!)

            }

        }, null)
    }

    private val mUploadManager: UploadManager by lazy { UploadManager() }

    private var mLocalFileUrl: String? = null
    private var mRemoteFileUrl: String? = null

    private var mUserIcon: String? = null
    private var mUserName: String? = null
    private var mUserMobile: String? = null
    private var mUserGender: String? = null
    private var mUserSign: String? = null;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_info)

        initView()
        initData()


    }

    private fun initData() {

        mUserIcon = AppPrefsUtils.getString(ProviderConstant.KEY_SP_USER_ICON)
        mUserName = AppPrefsUtils.getString(ProviderConstant.KEY_SP_USER_NAME)
        mUserMobile = AppPrefsUtils.getString(ProviderConstant.KEY_SP_USER_MOBILE)
        mUserGender = AppPrefsUtils.getString(ProviderConstant.KEY_SP_USER_GENDER)
        mUserSign = AppPrefsUtils.getString(ProviderConstant.KEY_SP_USER_SIGN)


        mUserNameEt.setText(mUserName)

        if (mUserGender == "0") {
            mGenderMaleRb.isChecked = true
        } else {
            mGenderFemaleRb.isChecked = true
        }
        mUserMobileTv.text = mUserMobile
        mUserSignEt.setText(mUserSign)

        if (!mUserIcon.isNullOrEmpty()) {
            mUserIconIv.loadImage(this, mUserIcon!!)
        }

    }


    private fun initView() {

        mUserIconView.onClick { showAlertView() }

        mHeaderBar.getRightTextView().onClick {
            mPresenter.edit(mUserNameEt.text?.toString() ?: ""
                    , mRemoteFileUrl!!, if (mGenderFemaleRb.isChecked) "1" else "0", mUserSignEt.text?.toString()
                    ?: ""
            )
        }

    }


    override fun onEditResult(success: UserInfo) {
        UserPrefsUtils.putUserInfo(success)

    }


    override fun injectComponent() {
        DaggerUserCompoent.builder().activityComponent(mActivityComponent)
                .build().inject(this)
        mPresenter.mView = this
    }

    override fun takeSuccess(result: TResult?) {
        mLocalFileUrl = result?.image?.compressPath
        mPresenter.uploadToken()
    }

    override fun takeCancel() {
    }

    override fun takeFail(result: TResult?, msg: String?) {
    }


}
