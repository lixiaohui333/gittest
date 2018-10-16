package com.lxhmmc.baselibrary.injection.component

import android.app.Activity
import com.lxhmmc.baselibrary.injection.ActivityScope
import com.lxhmmc.baselibrary.injection.module.ActivityModule
import dagger.Component

/**
 * @author lxh 2018/10/6.
 * @desc
 */

@ActivityScope
@Component(dependencies = arrayOf(AppComponent::class),modules = arrayOf(ActivityModule::class))
interface ActivityComponent {

    fun activity():Activity

}