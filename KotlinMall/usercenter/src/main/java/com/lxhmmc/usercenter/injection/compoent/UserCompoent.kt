package com.lxhmmc.usercenter.injection.compoent

import com.lxhmmc.usercenter.injection.module.UserModule
import com.lxhmmc.usercenter.ui.activity.RegistActivity
import dagger.Component


@Component(modules = arrayOf(UserModule::class))
interface UserCompoent {

    fun inject(activity: RegistActivity)
}