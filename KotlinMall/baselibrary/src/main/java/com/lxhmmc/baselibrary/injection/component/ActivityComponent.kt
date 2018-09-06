package com.lxhmmc.baselibrary.injection.component

import android.app.Activity
import android.content.Context
import com.lxhmmc.baselibrary.injection.ActivityScope
import com.lxhmmc.baselibrary.injection.module.ActivityModule
import com.lxhmmc.baselibrary.injection.module.AppModule
import com.lxhmmc.baselibrary.injection.module.LifecycleProviderModule
import com.trello.rxlifecycle2.LifecycleProvider
import dagger.Component
import javax.inject.Singleton


@ActivityScope
@Component(dependencies = arrayOf(AppComponent::class),modules = arrayOf(ActivityModule::class,LifecycleProviderModule::class))
interface ActivityComponent{

    fun activity():Activity

    fun lifecycleProvider():LifecycleProvider<*>

    fun context():Context
}