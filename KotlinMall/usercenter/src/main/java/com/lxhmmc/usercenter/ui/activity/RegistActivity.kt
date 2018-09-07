package com.lxhmmc.usercenter.ui.activity

import android.os.Bundle
import android.os.SystemClock
import com.lxhmmc.baselibrary.common.AppManager
import com.lxhmmc.baselibrary.ext.enable
import com.lxhmmc.baselibrary.ext.onClick
import com.lxhmmc.baselibrary.ui.activity.BaseMvpActivity
import com.lxhmmc.usercenter.R
import com.lxhmmc.usercenter.injection.compoent.DaggerUserCompoent
import com.lxhmmc.usercenter.presenter.RegistPresenter
import com.lxhmmc.usercenter.presenter.view.RegistView
import kotlinx.android.synthetic.main.activity_regist.*
import org.jetbrains.anko.toast

class RegistActivity : BaseMvpActivity<RegistPresenter>(), RegistView {


    override fun onRegistResult(success: String) {
        toast(success)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regist)


        mRegisterBtn.enable(mMobileEt) { isBtnEnable() }
        mRegisterBtn.enable(mPwdConfirmEt) { isBtnEnable() }
        mRegisterBtn.enable(mPwdEt) { isBtnEnable() }
        mRegisterBtn.enable(mVerifyCodeEt) { isBtnEnable() }

        mRegisterBtn.onClick {
            //            mPresenter.register(mMobileEt.text.toString(), mVerifyCodeEt.text.toString(), mPwdEt.toString())
            mPresenter.register("15828380434", "123456", "123456")
        }
        mVerifyCodeBtn.onClick {
            mVerifyCodeBtn.requestSendVerifyNumber()
        }

    }

    private fun isBtnEnable(): Boolean {
        return mMobileEt.text.toString().isNotEmpty() &&
                mPwdEt.text.toString().isNotEmpty() &&
                mVerifyCodeEt.text.toString().isNotEmpty() &&
                mPwdConfirmEt.text.toString().isNotEmpty()
    }

    override fun initComponentInject() {
        DaggerUserCompoent.builder().activityComponent(activityComponent)
                .build().inject(this)
        mPresenter.mView = this
    }

// private var lastTime: Long = 0
//    override fun onBackPressed() {
//
//        var nowTime = SystemClock.elapsedRealtime()
//        if (nowTime - lastTime > 2000) {
//            lastTime = nowTime
//            toast("再按一次退出")
//        } else {
//            AppManager.exitApp(this)
//        }
//
//    }
}
