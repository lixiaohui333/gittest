package com.lxhmmc.baselibrary.injection.module

import android.app.Activity
import com.lxhmmc.baselibrary.injection.ActivityScope
import dagger.Module
import dagger.Provides

/**
 * @author lxh 2018/10/6.
 * @desc
 */



@Module
class ActivityModule(private val activity: Activity) {

    @ActivityScope
    @Provides
    fun providesActivity() :Activity{
        return activity
    }

}