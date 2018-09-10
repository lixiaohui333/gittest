package com.lxhmmc.usercenter.ui.activity

import android.os.Bundle
import com.lxhmmc.baselibrary.common.Constant.Companion.EXTRA_STRING
import com.lxhmmc.baselibrary.ext.enable
import com.lxhmmc.baselibrary.ext.onClick
import com.lxhmmc.baselibrary.ui.activity.BaseMvpActivity
import com.lxhmmc.usercenter.R
import com.lxhmmc.usercenter.injection.compoent.DaggerUserCompoent
import com.lxhmmc.usercenter.presenter.ResetPwdPresenter
import com.lxhmmc.usercenter.presenter.view.ResetPwdView
import kotlinx.android.synthetic.main.activity_reset_pwd.*
import org.jetbrains.anko.*

class ResetPwdActivity : BaseMvpActivity<ResetPwdPresenter>(), ResetPwdView {


    override fun onResetPwdResult(success: String) {
        toast(success)

        startActivity(intentFor<LoginActivity>().singleTop().clearTop())
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_pwd)

        mConfirmBtn.enable(mPwdEt) { isBtnEnable() }
        mConfirmBtn.enable(mPwdConfirmEt) { isBtnEnable() }

        mConfirmBtn.onClick {
            mPresenter.resetPwd(intent.getStringExtra(EXTRA_STRING),mPwdEt.text.toString())
        }


    }

    private fun isBtnEnable(): Boolean {
        return mPwdConfirmEt.text.toString().isNotEmpty() &&
                mPwdEt.text.toString().isNotEmpty()
    }

    override fun initComponentInject() {
        DaggerUserCompoent.builder().activityComponent(activityComponent)
                .build().inject(this)
        mPresenter.mView = this
    }


}
