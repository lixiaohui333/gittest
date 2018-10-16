package com.kotlin.goods.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J&\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\nH\'J&\u0010\u000b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\fH\'\u00a8\u0006\r"}, d2 = {"Lcom/kotlin/goods/data/api/GoodsApi;", "", "getGoodsDetail", "Lrx/Observable;", "Lcom/kotlin/base/data/protocol/BaseResp;", "Lcom/kotlin/goods/data/protocol/Goods;", "req", "Lcom/kotlin/goods/data/protocol/GetGoodsDetailReq;", "getGoodsList", "", "Lcom/kotlin/goods/data/protocol/GetGoodsListReq;", "getGoodsListByKeyword", "Lcom/kotlin/goods/data/protocol/GetGoodsListByKeywordReq;", "GoodsCenter_debug"})
public abstract interface GoodsApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "goods/getGoodsList")
    public abstract rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.util.List<com.kotlin.goods.data.protocol.Goods>>> getGoodsList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.kotlin.goods.data.protocol.GetGoodsListReq req);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "goods/getGoodsListByKeyword")
    public abstract rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.util.List<com.kotlin.goods.data.protocol.Goods>>> getGoodsListByKeyword(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.kotlin.goods.data.protocol.GetGoodsListByKeywordReq req);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "goods/getGoodsDetail")
    public abstract rx.Observable<com.kotlin.base.data.protocol.BaseResp<com.kotlin.goods.data.protocol.Goods>> getGoodsDetail(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.kotlin.goods.data.protocol.GetGoodsDetailReq req);
}