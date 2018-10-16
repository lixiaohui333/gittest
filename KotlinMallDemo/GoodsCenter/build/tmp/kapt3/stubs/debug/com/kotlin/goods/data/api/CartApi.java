package com.kotlin.goods.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\nH\'J\u001c\u0010\u000b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\u00040\u0003H\'J\u001e\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u000fH\'\u00a8\u0006\u0010"}, d2 = {"Lcom/kotlin/goods/data/api/CartApi;", "", "addCart", "Lrx/Observable;", "Lcom/kotlin/base/data/protocol/BaseResp;", "", "req", "Lcom/kotlin/goods/data/protocol/AddCartReq;", "deleteCartList", "", "Lcom/kotlin/goods/data/protocol/DeleteCartReq;", "getCartList", "", "Lcom/kotlin/goods/data/protocol/CartGoods;", "submitCart", "Lcom/kotlin/goods/data/protocol/SubmitCartReq;", "GoodsCenter_debug"})
public abstract interface CartApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "cart/getList")
    public abstract rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.util.List<com.kotlin.goods.data.protocol.CartGoods>>> getCartList();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "cart/add")
    public abstract rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.lang.Integer>> addCart(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.kotlin.goods.data.protocol.AddCartReq req);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "cart/delete")
    public abstract rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.lang.String>> deleteCartList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.kotlin.goods.data.protocol.DeleteCartReq req);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "cart/submit")
    public abstract rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.lang.Integer>> submitCart(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.kotlin.goods.data.protocol.SubmitCartReq req);
}