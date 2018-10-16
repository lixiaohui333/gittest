package com.lxhmmc.baselibrary.app

import android.app.Application
import com.lxhmmc.baselibrary.injection.component.AppComponent
import com.lxhmmc.baselibrary.injection.component.DaggerAppComponent
import com.lxhmmc.baselibrary.injection.module.AppModule

/**
 * @author lxh 2018/10/6.
 * @desc
 */
class BaseApplication : Application() {

    lateinit var mAppComponent: AppComponent;

    override fun onCreate() {
        super.onCreate()
        initInjection()
    }

    private fun initInjection() {
        mAppComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }

}