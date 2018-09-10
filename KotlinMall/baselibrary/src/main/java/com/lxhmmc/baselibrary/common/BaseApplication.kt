package com.lxhmmc.baselibrary.common

import android.app.Application
import android.content.Context
import com.lxhmmc.baselibrary.injection.component.AppComponent
import com.lxhmmc.baselibrary.injection.component.DaggerAppComponent
import com.lxhmmc.baselibrary.injection.module.AppModule

class BaseApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        initAppComponent()

        context = this
    }

    private fun initAppComponent() {
        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }

    /*
       全局伴生对象
    */
    companion object {
        lateinit var context: Context
    }
}