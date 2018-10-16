package com.kotlin.goods.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bJ*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n0\u00050\u00042\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bJ*\u0010\r\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n0\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\b\u00a8\u0006\u0010"}, d2 = {"Lcom/kotlin/goods/data/repository/GoodsRepository;", "", "()V", "getGoodsDetail", "Lrx/Observable;", "Lcom/kotlin/base/data/protocol/BaseResp;", "Lcom/kotlin/goods/data/protocol/Goods;", "goodsId", "", "getGoodsList", "", "categoryId", "pageNo", "getGoodsListByKeyword", "keyword", "", "GoodsCenter_debug"})
public final class GoodsRepository {
    
    @org.jetbrains.annotations.NotNull()
    public final rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.util.List<com.kotlin.goods.data.protocol.Goods>>> getGoodsList(int categoryId, int pageNo) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.util.List<com.kotlin.goods.data.protocol.Goods>>> getGoodsListByKeyword(@org.jetbrains.annotations.NotNull()
    java.lang.String keyword, int pageNo) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final rx.Observable<com.kotlin.base.data.protocol.BaseResp<com.kotlin.goods.data.protocol.Goods>> getGoodsDetail(int goodsId) {
        return null;
    }
    
    @javax.inject.Inject()
    public GoodsRepository() {
        super();
    }
}