package com.lxhmmc.goodscenter.service

import com.lxhmmc.baselibrary.data.protocol.BaseResp
import com.lxhmmc.goodscenter.data.protocol.Category
import com.lxhmmc.goodscenter.data.protocol.Goods
import io.reactivex.Observable

interface GoodsService {

    fun getGoodsDetail(goodsId:Int): Observable<Goods>
}