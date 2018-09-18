package com.lxhmmc.kotlinmall.ui.activity

import android.os.Bundle
import android.support.v4.app.Fragment
import com.ashokvarma.bottomnavigation.BottomNavigationBar
import com.lxhmmc.baselibrary.ui.activity.BaseActivity
import com.lxhmmc.goodscenter.ui.fragment.CategoryFragment
import com.lxhmmc.kotlinmall.R
import com.lxhmmc.kotlinmall.ui.fragment.HomeFragment
import com.lxhmmc.kotlinmall.ui.fragment.MeFragment
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : BaseActivity() {

    private val mHomeFragment by lazy { HomeFragment() }
    private val mGoodsFragment by lazy { CategoryFragment() }
    private val mCartFragment by lazy { HomeFragment() }
    private val mMsgFragment by lazy { HomeFragment() }
    private val mMeFragment by lazy { MeFragment() }

    private val stacks = Stack<Fragment>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mBottomNavBar.checkMsgBadge(false)
        mBottomNavBar.checkCartBadge(0)

        initFragment()
        initBottomNavBar()

        selectFragment(0)
    }

    private fun initBottomNavBar() {

        mBottomNavBar.setTabSelectedListener(object : BottomNavigationBar.OnTabSelectedListener {
            override fun onTabReselected(position: Int) {}
            override fun onTabUnselected(position: Int) {}
            override fun onTabSelected(position: Int) {
                selectFragment(position)
            }
        })
    }

    fun selectFragment(position: Int) {
        val selectFragment = stacks[position]
        val manager = supportFragmentManager.beginTransaction();
        stacks.forEach { manager.hide(it) }
        manager.show(selectFragment)
        manager.commit()
    }

    private fun initFragment() {
        val manager = supportFragmentManager.beginTransaction()
        manager.add(R.id.mContentFl, mHomeFragment)
        manager.add(R.id.mContentFl, mGoodsFragment)
        manager.add(R.id.mContentFl, mCartFragment)
        manager.add(R.id.mContentFl, mMsgFragment)
        manager.add(R.id.mContentFl, mMeFragment)
        manager.commit()

        stacks.add(mHomeFragment)
        stacks.add(mGoodsFragment)
        stacks.add(mCartFragment)
        stacks.add(mMsgFragment)
        stacks.add(mMeFragment)


    }
}
