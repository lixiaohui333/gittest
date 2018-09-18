package com.lxhmmc.kotlinmall.ui.activity

import android.os.Bundle
import android.support.v4.app.Fragment
import com.ashokvarma.bottomnavigation.BottomNavigationBar
import com.kotlin.user.utils.UserPrefsUtils
import com.lxhmmc.baselibrary.ext.onClick
import com.lxhmmc.baselibrary.ui.activity.BaseActivity
import com.lxhmmc.kotlinmall.R
import com.lxhmmc.kotlinmall.ui.fragment.HomeFragment
import com.lxhmmc.kotlinmall.ui.fragment.MeFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_setting.*
import java.util.*

class SettingsActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)


        mLogoutBtn.onClick {
            UserPrefsUtils.putUserInfo(null)
            finish()
        }

    }


}
