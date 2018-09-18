package com.lxhmmc.usercenter.presenter

import com.lxhmmc.baselibrary.ext.convertBoolean
import com.lxhmmc.baselibrary.ext.executeDefulat
import com.lxhmmc.baselibrary.presenter.BasePresenter
import com.lxhmmc.usercenter.presenter.view.ForgetView
import com.lxhmmc.usercenter.service.impl.UserServiceImpl
import io.reactivex.functions.Consumer
import javax.inject.Inject


class ForgetPresenter @Inject constructor() : BasePresenter<ForgetView>() {

    @Inject
    lateinit var userService: UserServiceImpl

    fun forget(mobile: String, verify: String) {

        userService.forget(mobile, verify).convertBoolean().executeDefulat(Consumer { t ->
            mView.onForgetResult("验证成功")
        }, mView, lifecycleProvider)
    }
}