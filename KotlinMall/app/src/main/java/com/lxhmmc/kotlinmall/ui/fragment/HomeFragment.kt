package com.lxhmmc.kotlinmall.ui.fragment

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kotlin.mall.common.*
import com.lxhmmc.baselibrary.ui.fragment.BaseFragment
import com.lxhmmc.baselibrary.widgets.BannerImageLoader
import com.lxhmmc.kotlinmall.R
import com.lxhmmc.kotlinmall.ui.adapter.HomeDiscountAdapter
import com.youth.banner.BannerConfig
import com.youth.banner.Transformer
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        super.onCreateView(inflater, container, savedInstanceState)

        return inflater.inflate(R.layout.fragment_home, null)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
        initBanner()
        initNews()
        initDiscount()
        initTopic()
    }

    private fun initTopic() {
    }

    var mHomediscountAdapter: HomeDiscountAdapter? = null

    private fun initDiscount() {

        val manager = LinearLayoutManager(context)
        manager.orientation = LinearLayoutManager.HORIZONTAL
        mHomeDiscountRv.layoutManager = manager

        mHomediscountAdapter = HomeDiscountAdapter(activity!!)
        mHomeDiscountRv.adapter = mHomediscountAdapter

        mHomediscountAdapter?.setData(mutableListOf(HOME_DISCOUNT_ONE, HOME_DISCOUNT_TWO, HOME_DISCOUNT_THREE, HOME_DISCOUNT_FOUR, HOME_DISCOUNT_FIVE))


    }

    private fun initNews() {
        mNewsFlipperView.setData(arrayOf("夏日炎炎，第一波福利还有30秒到达战场", "新用户立领1000元优惠券"))
    }

    private fun initBanner() {
        mHomeBanner.setImageLoader(BannerImageLoader())
        mHomeBanner.setImages(listOf(HOME_BANNER_ONE, HOME_BANNER_TWO, HOME_BANNER_THREE, HOME_BANNER_THREE, HOME_BANNER_FOUR))
        mHomeBanner.setBannerTitles(listOf("标题1", "标题2", "标题3", "标题4", "标题5"))
        mHomeBanner.setBannerAnimation(Transformer.Default)

        mHomeBanner.setDelayTime(2000)
        mHomeBanner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE)
        mHomeBanner.setIndicatorGravity(BannerConfig.CENTER)
        mHomeBanner.start()
    }

    private fun initView() {
    }


}