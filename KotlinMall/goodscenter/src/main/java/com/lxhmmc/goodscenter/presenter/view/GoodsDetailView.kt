package com.lxhmmc.goodscenter.presenter.view

import com.lxhmmc.baselibrary.presenter.view.BaseView
import com.lxhmmc.goodscenter.data.protocol.Goods

interface GoodsDetailView :BaseView {

    fun onGetGoodsResult(result: Goods)

    fun onAddCartResult(result:Int)

}