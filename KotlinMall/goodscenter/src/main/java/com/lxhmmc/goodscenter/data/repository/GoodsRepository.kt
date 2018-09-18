package com.lxhmmc.goodscenter.data.repository

import com.lxhmmc.baselibrary.data.net.RetrofitFactory
import com.lxhmmc.baselibrary.data.protocol.BaseResp
import com.lxhmmc.goodscenter.data.api.CategoryApi
import com.lxhmmc.goodscenter.data.api.GoodsApi
import com.lxhmmc.goodscenter.data.protocol.Category
import com.lxhmmc.goodscenter.data.protocol.GetCategoryReq
import com.lxhmmc.goodscenter.data.protocol.GetGoodsDetailReq
import com.lxhmmc.goodscenter.data.protocol.Goods
import io.reactivex.Observable
import javax.inject.Inject

class GoodsRepository @Inject constructor(){

    fun getGoodsDetail(goodsId:Int): Observable<BaseResp<Goods>> {
        return RetrofitFactory.create(GoodsApi::class.java).getGoods(GetGoodsDetailReq(goodsId))
    }
}