package com.lxhmmc.usercenter.presenter.view

import com.kotlin.user.data.protocol.UserInfo
import com.lxhmmc.baselibrary.presenter.view.BaseView

interface UserInfoView :BaseView {

    fun onEditResult(success:UserInfo)
    fun onGetTokenResult(success:String)
}