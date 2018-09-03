package com.lxhmmc.usercenter.presenter

import com.lxhmmc.baselibrary.ext.execute
import com.lxhmmc.baselibrary.presenter.BasePresenter
import com.lxhmmc.usercenter.presenter.view.RegistView
import com.lxhmmc.usercenter.service.impl.UserServiceImpl
import io.reactivex.functions.Consumer

class RegistPresenter : BasePresenter<RegistView>() {

    fun register(mobile: String, verifyCode: String, pwd: String) {

//        Observable.
        val userService = UserServiceImpl()
        userService.regist(mobile, verifyCode, pwd).execute(object :Consumer<Boolean>{
            override fun accept(t: Boolean) {
                mView.onRegistResult(t)


            }
        })
    }
}