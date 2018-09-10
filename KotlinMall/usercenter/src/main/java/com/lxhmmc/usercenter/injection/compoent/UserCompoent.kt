package com.lxhmmc.usercenter.injection.compoent

import com.lxhmmc.baselibrary.injection.PerComponentScope
import com.lxhmmc.baselibrary.injection.component.ActivityComponent
import com.lxhmmc.usercenter.injection.module.UploadModule
import com.lxhmmc.usercenter.injection.module.UserModule
import com.lxhmmc.usercenter.ui.activity.*
import dagger.Component


@PerComponentScope
@Component(dependencies = arrayOf(ActivityComponent::class), modules = arrayOf(UserModule::class, UploadModule::class))
interface UserCompoent {

    fun inject(activity: RegistActivity)
    fun inject(activity: LoginActivity)
    fun inject(activity: ForgetActivity)
    fun inject(activity: ResetPwdActivity)
    fun inject(activity: UserInfoActivity)
}