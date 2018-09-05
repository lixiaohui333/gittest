package com.lxhmmc.baselibrary.injection.component

import android.content.Context
import com.lxhmmc.baselibrary.injection.ActivityScope
import com.lxhmmc.baselibrary.injection.module.ActivityModule
import com.lxhmmc.baselibrary.injection.module.AppModule
import dagger.Component
import javax.inject.Singleton


@ActivityScope
@Component(dependencies = arrayOf(AppComponent::class),modules = arrayOf(ActivityModule::class))
interface ActivityComponent{

    fun context():Context
}