package com.lxhmmc.goodscenter.injection.module

import com.lxhmmc.goodscenter.service.CategoryService
import com.lxhmmc.goodscenter.service.GoodsService
import com.lxhmmc.goodscenter.service.impl.CategoryServiceImpl
import com.lxhmmc.goodscenter.service.impl.GoodsServiceImpl
import dagger.Module
import dagger.Provides


@Module
class GoodsModule {

    @Provides
    fun provideGoodsService(goodsService: GoodsServiceImpl): GoodsService {
        return goodsService
    }

}