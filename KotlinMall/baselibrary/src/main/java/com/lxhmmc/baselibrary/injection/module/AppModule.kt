package com.lxhmmc.baselibrary.injection.module

import android.content.Context
import com.lxhmmc.baselibrary.common.BaseApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class AppModule(private val context:BaseApplication) {


    @Singleton
    @Provides
    fun provideContext():Context{
        return context
    }

}