package com.kotlin.goods.service.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J>\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0017H\u0016J\u0016\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00190\nH\u0016J$\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001c\u001a\u00020\u0011H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u001d"}, d2 = {"Lcom/kotlin/goods/service/impl/CartServiceImpl;", "Lcom/kotlin/goods/service/CartService;", "()V", "repository", "Lcom/kotlin/goods/data/repository/CartRepository;", "getRepository", "()Lcom/kotlin/goods/data/repository/CartRepository;", "setRepository", "(Lcom/kotlin/goods/data/repository/CartRepository;)V", "addCart", "Lrx/Observable;", "", "goodsId", "goodsDesc", "", "goodsIcon", "goodsPrice", "", "goodsCount", "goodsSku", "deleteCartList", "", "list", "", "getCartList", "", "Lcom/kotlin/goods/data/protocol/CartGoods;", "submitCart", "totalPrice", "GoodsCenter_debug"})
public final class CartServiceImpl implements com.kotlin.goods.service.CartService {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.kotlin.goods.data.repository.CartRepository repository;
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotlin.goods.data.repository.CartRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.kotlin.goods.data.repository.CartRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public rx.Observable<java.lang.Integer> addCart(int goodsId, @org.jetbrains.annotations.NotNull()
    java.lang.String goodsDesc, @org.jetbrains.annotations.NotNull()
    java.lang.String goodsIcon, long goodsPrice, int goodsCount, @org.jetbrains.annotations.NotNull()
    java.lang.String goodsSku) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public rx.Observable<java.util.List<com.kotlin.goods.data.protocol.CartGoods>> getCartList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public rx.Observable<java.lang.Boolean> deleteCartList(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> list) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public rx.Observable<java.lang.Integer> submitCart(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kotlin.goods.data.protocol.CartGoods> list, long totalPrice) {
        return null;
    }
    
    @javax.inject.Inject()
    public CartServiceImpl() {
        super();
    }
}