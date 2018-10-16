package com.lxhmmc.usercenter.ui.activity

import android.os.Bundle
import com.lxhmmc.baselibrary.common.onClick
import com.lxhmmc.baselibrary.ui.base.BaseMVPActivity
import com.lxhmmc.injection.component.DaggerUsercenterComponent
import com.lxhmmc.presenter.RegistPresent
import com.lxhmmc.presenter.view.RegistView
import com.lxhmmc.usercenter.R
import kotlinx.android.synthetic.main.activity_regist.*
import org.jetbrains.anko.toast


/**
 * @author lxh 2018/10/5.
 * @desc
 */
class RegistActivity :BaseMVPActivity<RegistPresent>(),RegistView {





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_regist)

        getWindowManager()
        mSubmitBtn.onClick { mPresenter.regist("lxh","123") }
    }

    override fun initInject() {
        DaggerUsercenterComponent.builder().activityComponent(mActivityComponent).build().injection(this)
        mPresenter.mView = this
    }

    override fun showLoading() {
    }

    override fun hideLoading() {
    }
    override fun onSuccess() {
        toast("注册成功  name:${mNameEt.text.toString()} pwd:${mPwdEt.text.toString()}  ${mActivityComponent.activity()::class.java.simpleName}")

    }
    override fun onError(msg: String) {
        toast(msg)
    }

}