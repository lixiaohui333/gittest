package com.lxhmmc.baselibrary.injection.component

import android.content.Context
import com.lxhmmc.baselibrary.injection.module.AppModule
import dagger.Component
import javax.inject.Singleton

/**
 * @author lxh 2018/10/6.
 * @desc
 */

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent{

    fun context():Context
}