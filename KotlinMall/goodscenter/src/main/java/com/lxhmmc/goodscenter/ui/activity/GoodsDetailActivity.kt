package com.lxhmmc.goodscenter.ui.activity

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.view.Gravity
import com.eightbitlab.rxbus.Bus
import com.kotlin.base.utils.AppPrefsUtils
import com.lxhmmc.baselibrary.ext.onClick
import com.lxhmmc.baselibrary.ui.activity.BaseActivity
import com.lxhmmc.goodscenter.R
import com.lxhmmc.goodscenter.common.GoodsConstant
import com.lxhmmc.goodscenter.event.AddCartEvent
import com.lxhmmc.goodscenter.ui.adapter.GoodsDetailVpAdapter
import com.lxhmmc.provider.common.afterLogin
import kotlinx.android.synthetic.main.activity_goods_detail.*
import q.rorbin.badgeview.QBadgeView

class GoodsDetailActivity : BaseActivity() {

    lateinit var mCartBdage: QBadgeView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_goods_detail)

        initView()
        loadCartSize()
    }

    private fun loadCartSize() {
        setCartBadge()
    }

    private fun setCartBadge() {
        mCartBdage.badgeGravity = Gravity.END or Gravity.TOP
        mCartBdage.setGravityOffset(22f, -2f, true)
        mCartBdage.setBadgeTextSize(6f, true)
        mCartBdage.bindTarget(mEnterCartTv).badgeNumber = AppPrefsUtils.getInt(GoodsConstant.SP_CART_SIZE)
    }

    private fun initView() {
        mGoodsDetailTab.tabMode = TabLayout.MODE_FIXED

        mGoodsDetailVp.adapter = GoodsDetailVpAdapter(supportFragmentManager, this)

        mGoodsDetailTab.setupWithViewPager(mGoodsDetailVp)

        mAddCartBtn.onClick {
            afterLogin {
                Bus.send(AddCartEvent())
            }
        }

        mLeftIv.onClick {
            finish()
        }

        mCartBdage = QBadgeView(this)
    }


}