package com.kotlin.goods.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J>\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0007H&J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010H&J\u0016\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00120\u0003H&J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0015\u001a\u00020\nH&\u00a8\u0006\u0016"}, d2 = {"Lcom/kotlin/goods/service/CartService;", "", "addCart", "Lrx/Observable;", "", "goodsId", "goodsDesc", "", "goodsIcon", "goodsPrice", "", "goodsCount", "goodsSku", "deleteCartList", "", "list", "", "getCartList", "", "Lcom/kotlin/goods/data/protocol/CartGoods;", "submitCart", "totalPrice", "GoodsCenter_debug"})
public abstract interface CartService {
    
    @org.jetbrains.annotations.NotNull()
    public abstract rx.Observable<java.lang.Integer> addCart(int goodsId, @org.jetbrains.annotations.NotNull()
    java.lang.String goodsDesc, @org.jetbrains.annotations.NotNull()
    java.lang.String goodsIcon, long goodsPrice, int goodsCount, @org.jetbrains.annotations.NotNull()
    java.lang.String goodsSku);
    
    @org.jetbrains.annotations.NotNull()
    public abstract rx.Observable<java.util.List<com.kotlin.goods.data.protocol.CartGoods>> getCartList();
    
    @org.jetbrains.annotations.NotNull()
    public abstract rx.Observable<java.lang.Boolean> deleteCartList(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> list);
    
    @org.jetbrains.annotations.NotNull()
    public abstract rx.Observable<java.lang.Integer> submitCart(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kotlin.goods.data.protocol.CartGoods> list, long totalPrice);
}