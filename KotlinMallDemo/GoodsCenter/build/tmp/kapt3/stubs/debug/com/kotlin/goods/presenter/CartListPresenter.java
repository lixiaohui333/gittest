package com.kotlin.goods.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0003J\u0014\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0006\u0010\u000f\u001a\u00020\u000bJ\u001c\u0010\u0010\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0015"}, d2 = {"Lcom/kotlin/goods/presenter/CartListPresenter;", "Lcom/kotlin/base/presenter/BasePresenter;", "Lcom/kotlin/goods/presenter/view/CartListView;", "()V", "cartService", "Lcom/kotlin/goods/service/CartService;", "getCartService", "()Lcom/kotlin/goods/service/CartService;", "setCartService", "(Lcom/kotlin/goods/service/CartService;)V", "deleteCartList", "", "list", "", "", "getCartList", "submitCart", "", "Lcom/kotlin/goods/data/protocol/CartGoods;", "totalPrice", "", "GoodsCenter_debug"})
public final class CartListPresenter extends com.kotlin.base.presenter.BasePresenter<com.kotlin.goods.presenter.view.CartListView> {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.kotlin.goods.service.CartService cartService;
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotlin.goods.service.CartService getCartService() {
        return null;
    }
    
    public final void setCartService(@org.jetbrains.annotations.NotNull()
    com.kotlin.goods.service.CartService p0) {
    }
    
    public final void getCartList() {
    }
    
    public final void deleteCartList(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> list) {
    }
    
    public final void submitCart(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kotlin.goods.data.protocol.CartGoods> list, long totalPrice) {
    }
    
    @javax.inject.Inject()
    public CartListPresenter() {
        super();
    }
}