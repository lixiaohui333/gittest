package com.kotlin.goods.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002JB\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\tJ \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011J\u001a\u0010\u0012\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00130\u00050\u0004J(\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0016\u001a\u00020\f\u00a8\u0006\u0017"}, d2 = {"Lcom/kotlin/goods/data/repository/CartRepository;", "", "()V", "addCart", "Lrx/Observable;", "Lcom/kotlin/base/data/protocol/BaseResp;", "", "goodsId", "goodsDesc", "", "goodsIcon", "goodsPrice", "", "goodsCount", "goodsSku", "deleteCartList", "list", "", "getCartList", "", "Lcom/kotlin/goods/data/protocol/CartGoods;", "submitCart", "totalPrice", "GoodsCenter_debug"})
public final class CartRepository {
    
    @org.jetbrains.annotations.NotNull()
    public final rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.util.List<com.kotlin.goods.data.protocol.CartGoods>>> getCartList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.lang.Integer>> addCart(int goodsId, @org.jetbrains.annotations.NotNull()
    java.lang.String goodsDesc, @org.jetbrains.annotations.NotNull()
    java.lang.String goodsIcon, long goodsPrice, int goodsCount, @org.jetbrains.annotations.NotNull()
    java.lang.String goodsSku) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.lang.String>> deleteCartList(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> list) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.lang.Integer>> submitCart(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kotlin.goods.data.protocol.CartGoods> list, long totalPrice) {
        return null;
    }
    
    @javax.inject.Inject()
    public CartRepository() {
        super();
    }
}