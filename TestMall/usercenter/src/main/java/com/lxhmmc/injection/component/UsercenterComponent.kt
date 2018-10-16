package com.lxhmmc.injection.component

import com.lxhmmc.baselibrary.injection.PerComponentScope
import com.lxhmmc.baselibrary.injection.component.ActivityComponent
import com.lxhmmc.injection.module.UsercenterModule
import com.lxhmmc.usercenter.ui.activity.RegistActivity
import dagger.Component

/**
 * @author lxh 2018/10/6.
 * @desc
 */

@PerComponentScope
@Component(modules = arrayOf(UsercenterModule::class),dependencies = arrayOf(ActivityComponent::class))
//@Component()
interface UsercenterComponent {

    fun injection(activity:RegistActivity)

}