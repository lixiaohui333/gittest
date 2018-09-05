package com.lxhmmc.baselibrary.common

import android.app.Application
import com.lxhmmc.baselibrary.injection.component.DaggerAppComponent
import com.lxhmmc.baselibrary.injection.module.AppModule

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        initAppComponent()
    }

    private fun initAppComponent() {
        DaggerAppComponent.builder().appModule(AppModule(this)).build()

    }
}