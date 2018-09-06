package com.lxhmmc.baselibrary.injection.module

import android.app.Activity
import android.content.Context
import com.lxhmmc.baselibrary.common.BaseApplication
import com.lxhmmc.baselibrary.injection.ActivityScope
import com.trello.rxlifecycle2.LifecycleProvider
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class LifecycleProviderModule(private val lifecycleProvider: LifecycleProvider<*>) {

    @Provides
    fun providesLifecycleProvider(): LifecycleProvider<*> {
        return lifecycleProvider
    }

}