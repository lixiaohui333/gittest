package com.lxhmmc.usercenter.presenter

import com.lxhmmc.baselibrary.ext.convert
import com.lxhmmc.baselibrary.ext.executeDefulat
import com.lxhmmc.baselibrary.presenter.BasePresenter
import com.lxhmmc.usercenter.presenter.view.LoginView
import com.lxhmmc.usercenter.service.impl.UserServiceImpl
import io.reactivex.functions.Consumer
import javax.inject.Inject


class LoginPresenter @Inject constructor() : BasePresenter<LoginView>() {

    @Inject
    lateinit var userService: UserServiceImpl

    fun login(mobile: String, pwd: String) {

        userService.login(mobile, pwd).convert().executeDefulat(Consumer { t ->
            mView.onLoginResult(t)
        }, mView, lifecycleProvider)
    }
}