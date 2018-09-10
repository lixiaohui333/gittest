package com.lxhmmc.usercenter.presenter

import com.lxhmmc.baselibrary.ext.convert
import com.lxhmmc.baselibrary.ext.convertBoolean
import com.lxhmmc.baselibrary.ext.executeDefulat
import com.lxhmmc.baselibrary.presenter.BasePresenter
import com.lxhmmc.usercenter.presenter.view.ForgetView
import com.lxhmmc.usercenter.presenter.view.LoginView
import com.lxhmmc.usercenter.presenter.view.ResetPwdView
import com.lxhmmc.usercenter.service.impl.UserServiceImpl
import io.reactivex.functions.Consumer
import javax.inject.Inject


class ResetPwdPresenter @Inject constructor() : BasePresenter<ResetPwdView>() {

    @Inject
    lateinit var userService: UserServiceImpl

    fun resetPwd(mobile: String, pwd: String) {

        userService.resetPwd(mobile, pwd).convertBoolean().executeDefulat(Consumer { t ->
            mView.onResetPwdResult("修改成功")
        }, mView, lifecycleProvider)
    }
}