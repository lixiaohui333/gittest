package com.lxhmmc.usercenter.presenter.view

import com.kotlin.user.data.protocol.UserInfo
import com.lxhmmc.baselibrary.presenter.view.BaseView

interface LoginView :BaseView {

    fun onLoginResult(success:UserInfo)
}