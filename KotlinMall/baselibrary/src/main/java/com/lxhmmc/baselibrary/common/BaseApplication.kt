package com.lxhmmc.baselibrary.common

import android.app.Application
import android.content.Context
import com.alibaba.android.arouter.launcher.ARouter
import com.lxhmmc.baselibrary.injection.component.AppComponent
import com.lxhmmc.baselibrary.injection.component.DaggerAppComponent
import com.lxhmmc.baselibrary.injection.module.AppModule

open class BaseApplication : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        initAppComponent()

        context = this

        //ARouter初始化
        ARouter.openLog()    // 打印日志
        ARouter.openDebug()
        ARouter.init(this)
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