package com.lxhmmc.usercenter.ui.activity

import android.os.Bundle
import com.lxhmmc.baselibrary.common.Constant.Companion.EXTRA_STRING
import com.lxhmmc.baselibrary.ext.enable
import com.lxhmmc.baselibrary.ext.onClick
import com.lxhmmc.baselibrary.ui.activity.BaseMvpActivity
import com.lxhmmc.usercenter.R
import com.lxhmmc.usercenter.injection.compoent.DaggerUserCompoent
import com.lxhmmc.usercenter.presenter.ForgetPresenter
import com.lxhmmc.usercenter.presenter.view.ForgetView
import kotlinx.android.synthetic.main.activity_forget_pwd.*
import org.jetbrains.anko.startActivity

class ForgetActivity : BaseMvpActivity<ForgetPresenter>(), ForgetView {


    override fun onForgetResult(success: String) {
        startActivity<ResetPwdActivity>(EXTRA_STRING to mMobileEt.text.toString())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_pwd)


        mNextBtn.enable(mMobileEt) { isBtnEnable() }
        mNextBtn.enable(mVerifyCodeEt) { isBtnEnable() }

        mNextBtn.onClick {
            mPresenter.forget(mMobileEt.text.toString(),mVerifyCodeEt.text.toString())
        }


    }

    private fun isBtnEnable(): Boolean {
        return mMobileEt.text.toString().isNotEmpty() &&
                mVerifyCodeEt.text.toString().isNotEmpty()
    }

    override fun initComponentInject() {
        DaggerUserCompoent.builder().activityComponent(activityComponent)
                .build().inject(this)
        mPresenter.mView = this
    }


}
