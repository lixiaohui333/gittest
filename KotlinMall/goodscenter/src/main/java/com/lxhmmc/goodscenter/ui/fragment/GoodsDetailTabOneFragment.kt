package com.lxhmmc.goodscenter.ui.fragment

import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.eightbitlab.rxbus.Bus
import com.kennyc.view.MultiStateView
import com.lxhmmc.baselibrary.common.Constant
import com.lxhmmc.baselibrary.ext.setVisible
import com.lxhmmc.baselibrary.ui.adapter.BaseRecyclerViewAdapter
import com.lxhmmc.baselibrary.ui.adapter.BaseRecyclerViewAdapter.OnItemCLickListener
import com.lxhmmc.baselibrary.ui.fragment.BaseMvpFragment
import com.lxhmmc.baselibrary.utils.YuanFenConverter
import com.lxhmmc.goodscenter.R
import com.lxhmmc.goodscenter.data.protocol.Category
import com.lxhmmc.goodscenter.data.protocol.Goods
import com.lxhmmc.goodscenter.event.GoodsDetailImageEvent
import com.lxhmmc.goodscenter.injection.component.DaggerCategoryComponent
import com.lxhmmc.goodscenter.injection.component.DaggerGoodsComponent
import com.lxhmmc.goodscenter.injection.module.CategoryModule
import com.lxhmmc.goodscenter.injection.module.GoodsModule
import com.lxhmmc.goodscenter.presenter.CategoryPresenter
import com.lxhmmc.goodscenter.presenter.GoodsDetailPresenter
import com.lxhmmc.goodscenter.presenter.view.CategoryView
import com.lxhmmc.goodscenter.presenter.view.GoodsDetailView
import com.lxhmmc.goodscenter.ui.adapter.SecondCategoryAdapter
import com.lxhmmc.goodscenter.ui.adapter.TopCategoryAdapter
import kotlinx.android.synthetic.main.fragment_category.*
import kotlinx.android.synthetic.main.fragment_goods_detail_tab_one.*

class GoodsDetailTabOneFragment : BaseMvpFragment<GoodsDetailPresenter>(), GoodsDetailView {

    private var mCurGoods: Goods? = null

//    private lateinit var mSkuPop: GoodsSkuPopView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment_goods_detail_tab_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        loadData()
    }

    private fun loadData() {

        mPresenter.getGoodsDetail(activity?.intent?.getIntExtra(Constant.EXTRA_STRING, 0)
                ?: 0)
    }

    private fun initView() {


//        mSkuPop = GoodsSkuPopView(activity)
//        mSkuPop.setOnDismissListener{
//            (activity as BaseActivity).contentView.startAnimation(mAnimationEnd)
//        }

    }

    override fun injectComponent() {
        DaggerGoodsComponent.builder().activityComponent(mActivityComponent).goodsModule(GoodsModule()).build().inject(this)
        mPresenter.mView = this
    }

    override fun onAddCartResult(result: Int) {
    }

    override fun onGetGoodsResult(result: Goods) {
        mCurGoods = result

        mGoodsDetailBanner.setImages(result.goodsBanner.split(","))
        mGoodsDetailBanner.start()
        
        mGoodsDescTv.text=result.goodsDesc
        mGoodsPriceTv.text  = YuanFenConverter.changeF2YWithUnit(result.goodsDefaultPrice)

        mSkuSelectedTv.text = result.goodsDefaultSku

        Bus.send(GoodsDetailImageEvent(result.goodsDetailOne, result.goodsDetailTwo))

        loadPopData(result)
        
    }

    private fun loadPopData(result: Goods) {
        mSkuPop.setGoodsIcon(result.goodsDefaultIcon)
        mSkuPop.setGoodsCode(result.goodsCode)
        mSkuPop.setGoodsPrice(result.goodsDefaultPrice)

        mSkuPop.setSkuData(result.goodsSku)
    }

}