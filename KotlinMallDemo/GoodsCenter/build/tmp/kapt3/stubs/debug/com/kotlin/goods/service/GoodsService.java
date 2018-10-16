package com.kotlin.goods.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J&\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b0\u00032\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H&J&\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b0\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0006H&\u00a8\u0006\u000e"}, d2 = {"Lcom/kotlin/goods/service/GoodsService;", "", "getGoodsDetail", "Lrx/Observable;", "Lcom/kotlin/goods/data/protocol/Goods;", "goodsId", "", "getGoodsList", "", "categoryId", "pageNo", "getGoodsListByKeyword", "keyword", "", "GoodsCenter_debug"})
public abstract interface GoodsService {
    
    @org.jetbrains.annotations.NotNull()
    public abstract rx.Observable<java.util.List<com.kotlin.goods.data.protocol.Goods>> getGoodsList(int categoryId, int pageNo);
    
    @org.jetbrains.annotations.NotNull()
    public abstract rx.Observable<java.util.List<com.kotlin.goods.data.protocol.Goods>> getGoodsListByKeyword(@org.jetbrains.annotations.NotNull()
    java.lang.String keyword, int pageNo);
    
    @org.jetbrains.annotations.NotNull()
    public abstract rx.Observable<com.kotlin.goods.data.protocol.Goods> getGoodsDetail(int goodsId);
}