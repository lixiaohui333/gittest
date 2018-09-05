package com.lxhmmc.baselibrary.injection.module

import android.app.Activity
import android.content.Context
import com.lxhmmc.baselibrary.common.BaseApplication
import com.lxhmmc.baselibrary.injection.ActivityScope
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class ActivityModule(private val activity:Activity) {

    @ActivityScope
    @Provides
    fun provideActivity():Activity{
        return activity
    }

}