package com.lxhmmc.baselibrary.injection.module

import android.content.Context
import com.lxhmmc.baselibrary.app.BaseApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * @author lxh 2018/10/6.
 * @desc
 */



@Module
class AppModule(private val context: BaseApplication) {

    @Provides
    @Singleton
    fun providesContext() :Context{
        return context
    }

}