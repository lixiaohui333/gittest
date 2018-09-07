package com.lxhmmc.baselibrary.ui.activity

import android.os.Bundle
import com.lxhmmc.baselibrary.common.AppManager
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity

open class BaseActivity : RxAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        AppManager.addActivity(this)
    }

    override fun onStop() {
        super.onStop()
        if (isFinishing) {
            AppManager.finishActivity(this)
        }
    }

}