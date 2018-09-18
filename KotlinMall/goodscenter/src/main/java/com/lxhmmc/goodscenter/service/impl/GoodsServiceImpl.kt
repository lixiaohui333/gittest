package com.lxhmmc.goodscenter.service.impl

import com.lxhmmc.baselibrary.ext.convert
import com.lxhmmc.goodscenter.data.protocol.Goods
import com.lxhmmc.goodscenter.data.repository.GoodsRepository
import com.lxhmmc.goodscenter.service.GoodsService
import io.reactivex.Observable
import javax.inject.Inject

class GoodsServiceImpl @Inject constructor() : GoodsService {

    @Inject
    lateinit var goodsRepository: GoodsRepository

    override fun getGoodsDetail(goodsId: Int): Observable<Goods> {
        return goodsRepository.getGoodsDetail(goodsId).convert()
    }

}