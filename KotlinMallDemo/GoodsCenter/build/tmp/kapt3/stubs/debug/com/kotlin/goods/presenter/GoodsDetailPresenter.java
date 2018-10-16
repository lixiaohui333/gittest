package com.kotlin.goods.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0003J6\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0015J\u000e\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001c"}, d2 = {"Lcom/kotlin/goods/presenter/GoodsDetailPresenter;", "Lcom/kotlin/base/presenter/BasePresenter;", "Lcom/kotlin/goods/presenter/view/GoodsDetailView;", "()V", "cartService", "Lcom/kotlin/goods/service/CartService;", "getCartService", "()Lcom/kotlin/goods/service/CartService;", "setCartService", "(Lcom/kotlin/goods/service/CartService;)V", "goodsService", "Lcom/kotlin/goods/service/GoodsService;", "getGoodsService", "()Lcom/kotlin/goods/service/GoodsService;", "setGoodsService", "(Lcom/kotlin/goods/service/GoodsService;)V", "addCart", "", "goodsId", "", "goodsDesc", "", "goodsIcon", "goodsPrice", "", "goodsCount", "goodsSku", "getGoodsDetailList", "GoodsCenter_debug"})
public final class GoodsDetailPresenter extends com.kotlin.base.presenter.BasePresenter<com.kotlin.goods.presenter.view.GoodsDetailView> {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.kotlin.goods.service.GoodsService goodsService;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.kotlin.goods.service.CartService cartService;
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotlin.goods.service.GoodsService getGoodsService() {
        return null;
    }
    
    public final void setGoodsService(@org.jetbrains.annotations.NotNull()
    com.kotlin.goods.service.GoodsService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotlin.goods.service.CartService getCartService() {
        return null;
    }
    
    public final void setCartService(@org.jetbrains.annotations.NotNull()
    com.kotlin.goods.service.CartService p0) {
    }
    
    public final void getGoodsDetailList(int goodsId) {
    }
    
    public final void addCart(int goodsId, @org.jetbrains.annotations.NotNull()
    java.lang.String goodsDesc, @org.jetbrains.annotations.NotNull()
    java.lang.String goodsIcon, long goodsPrice, int goodsCount, @org.jetbrains.annotations.NotNull()
    java.lang.String goodsSku) {
    }
    
    @javax.inject.Inject()
    public GoodsDetailPresenter() {
        super();
    }
}