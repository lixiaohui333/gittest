package com.lxhmmc.goodscenter.presenter

import com.lxhmmc.baselibrary.ext.convert
import com.lxhmmc.baselibrary.ext.executeDefulat
import com.lxhmmc.baselibrary.presenter.BasePresenter
import com.lxhmmc.goodscenter.data.protocol.Category
import com.lxhmmc.goodscenter.presenter.view.CategoryView
import com.lxhmmc.goodscenter.presenter.view.GoodsDetailView
import com.lxhmmc.goodscenter.service.CategoryService
import com.lxhmmc.goodscenter.service.GoodsService
import io.reactivex.functions.Consumer
import javax.inject.Inject

class GoodsDetailPresenter @Inject constructor() : BasePresenter<GoodsDetailView>() {

    @Inject
    lateinit var goodsService: GoodsService

    fun getGoodsDetail(goodsId: Int) {
        if (!checkNetWork()) {
            return
        }
        mView.showLoading()
        goodsService.getGoodsDetail(goodsId).executeDefulat(Consumer {
            mView.onGetGoodsResult(it)
        }, mView, lifecycleProvider)

    }

}