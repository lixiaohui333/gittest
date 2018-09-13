package com.lxhmmc.usercenter.ui.activity

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.kotlin.user.data.protocol.UserInfo
import com.kotlin.user.utils.UserPrefsUtils
import com.lxhmmc.baselibrary.ext.enable
import com.lxhmmc.baselibrary.ext.onClick
import com.lxhmmc.baselibrary.ui.activity.BaseMvpActivity
import com.lxhmmc.provider.router.RouterPath
import com.lxhmmc.usercenter.R
import com.lxhmmc.usercenter.injection.compoent.DaggerUserCompoent
import com.lxhmmc.usercenter.presenter.LoginPresenter
import com.lxhmmc.usercenter.presenter.view.LoginView
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast


@Route(path = RouterPath.UserCenter.PATH_LOGIN)
class LoginActivity : BaseMvpActivity<LoginPresenter>(), LoginView {

    override fun onLoginResult(userinfo: UserInfo) {
        UserPrefsUtils.putUserInfo(userinfo)
        finish()
//        startActivity<UserInfoActivity>()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        mLoginBtn.enable(mMobileEt) { isBtnEnable() }
        mLoginBtn.enable(mPwdEt) { isBtnEnable() }

        mLoginBtn.onClick {
            mPresenter.login(mMobileEt.text.toString(), mPwdEt.text.toString())
        }

        mHeaderBar.getRightTextView().onClick {
            startActivity<RegistActivity>()
        }

        mForgetPwdTv.onClick { startActivity<ForgetActivity>() }

    }

    private fun isBtnEnable(): Boolean {
        return mMobileEt.text.toString().isNotEmpty() &&
                mPwdEt.text.toString().isNotEmpty()
    }

    override fun initComponentInject() {
        DaggerUserCompoent.builder().activityComponent(activityComponent)
                .build().inject(this)
        mPresenter.mView = this
    }


}
