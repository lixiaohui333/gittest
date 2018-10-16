package com.lxhmmc.baselibrary.ui.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.lxhmmc.baselibrary.app.BaseApplication
import com.lxhmmc.baselibrary.injection.component.ActivityComponent
import com.lxhmmc.baselibrary.injection.component.DaggerActivityComponent
import com.lxhmmc.baselibrary.injection.module.ActivityModule

/**
 * @author lxh 2018/10/5.
 * @desc
 */
open class BaseActivity : AppCompatActivity() {

    lateinit var mActivityComponent: ActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initActivityInjection()
    }

    private fun initActivityInjection() {

        mActivityComponent = DaggerActivityComponent.builder().appComponent((application as BaseApplication).mAppComponent).activityModule(ActivityModule(this)).build()

    }

}