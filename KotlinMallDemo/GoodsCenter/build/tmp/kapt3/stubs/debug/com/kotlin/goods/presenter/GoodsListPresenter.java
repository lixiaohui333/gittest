package com.kotlin.goods.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ\u0016\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0012"}, d2 = {"Lcom/kotlin/goods/presenter/GoodsListPresenter;", "Lcom/kotlin/base/presenter/BasePresenter;", "Lcom/kotlin/goods/presenter/view/GoodsListView;", "()V", "goodsService", "Lcom/kotlin/goods/service/GoodsService;", "getGoodsService", "()Lcom/kotlin/goods/service/GoodsService;", "setGoodsService", "(Lcom/kotlin/goods/service/GoodsService;)V", "getGoodsList", "", "categoryId", "", "pageNo", "getGoodsListByKeyword", "keyword", "", "GoodsCenter_debug"})
public final class GoodsListPresenter extends com.kotlin.base.presenter.BasePresenter<com.kotlin.goods.presenter.view.GoodsListView> {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.kotlin.goods.service.GoodsService goodsService;
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotlin.goods.service.GoodsService getGoodsService() {
        return null;
    }
    
    public final void setGoodsService(@org.jetbrains.annotations.NotNull()
    com.kotlin.goods.service.GoodsService p0) {
    }
    
    public final void getGoodsList(int categoryId, int pageNo) {
    }
    
    public final void getGoodsListByKeyword(@org.jetbrains.annotations.NotNull()
    java.lang.String keyword, int pageNo) {
    }
    
    @javax.inject.Inject()
    public GoodsListPresenter() {
        super();
    }
}