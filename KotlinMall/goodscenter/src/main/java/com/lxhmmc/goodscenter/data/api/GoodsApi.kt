package com.lxhmmc.goodscenter.data.api

import com.lxhmmc.baselibrary.data.protocol.BaseResp
import com.lxhmmc.goodscenter.data.protocol.GetGoodsDetailReq
import com.lxhmmc.goodscenter.data.protocol.Goods
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.POST

interface GoodsApi {

    /*
        获取商品详情
     */
    @POST("goods/getGoodsDetail")
    fun getGoods(@Body req: GetGoodsDetailReq): Observable<BaseResp<Goods>>

}