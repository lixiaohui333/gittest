package com.lxhmmc.usercenter.presenter

import com.lxhmmc.baselibrary.data.protocol.BaseResp
import com.lxhmmc.baselibrary.data.protocol.UserRsp
import com.lxhmmc.baselibrary.ext.convert
import com.lxhmmc.baselibrary.ext.convertBoolean
import com.lxhmmc.baselibrary.ext.execute
import com.lxhmmc.baselibrary.ext.executeDefulat
import com.lxhmmc.baselibrary.presenter.BasePresenter
import com.lxhmmc.usercenter.presenter.view.RegistView
import com.lxhmmc.usercenter.service.impl.UserServiceImpl
import io.reactivex.functions.Consumer
import javax.inject.Inject


class RegistPresenter @Inject constructor() : BasePresenter<RegistView>() {

    @Inject
    lateinit var userService: UserServiceImpl

    fun register(mobile: String, verifyCode: String, pwd: String) {

        userService.regist(mobile, verifyCode, pwd).convert().executeDefulat(Consumer { t ->
            mView.onRegistResult(t)
        }, mView, lifecycleProvider)
    }
}