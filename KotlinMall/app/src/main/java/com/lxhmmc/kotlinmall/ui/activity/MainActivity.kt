package com.lxhmmc.kotlinmall.ui.activity

import android.os.Bundle
import com.lxhmmc.baselibrary.ui.activity.BaseActivity
import com.lxhmmc.kotlinmall.R
import com.lxhmmc.kotlinmall.ui.fragment.HomeFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    private val mHomeFragment by lazy { HomeFragment() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mBottomNavBar.checkMsgBadge(false)
        mBottomNavBar.checkCartBadge(0)

        initFragment()

    }

    private fun initFragment() {
        val manager = supportFragmentManager.beginTransaction()
        manager.add(R.id.mContentFl,mHomeFragment)
        manager.commit()
        manager.show(mHomeFragment)

    }
}
