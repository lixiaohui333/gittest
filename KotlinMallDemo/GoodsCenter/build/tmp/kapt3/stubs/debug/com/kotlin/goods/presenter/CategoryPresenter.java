package com.kotlin.goods.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lcom/kotlin/goods/presenter/CategoryPresenter;", "Lcom/kotlin/base/presenter/BasePresenter;", "Lcom/kotlin/goods/presenter/view/CategoryView;", "()V", "categoryService", "Lcom/kotlin/goods/service/CategoryService;", "getCategoryService", "()Lcom/kotlin/goods/service/CategoryService;", "setCategoryService", "(Lcom/kotlin/goods/service/CategoryService;)V", "getCategory", "", "parentId", "", "GoodsCenter_debug"})
public final class CategoryPresenter extends com.kotlin.base.presenter.BasePresenter<com.kotlin.goods.presenter.view.CategoryView> {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.kotlin.goods.service.CategoryService categoryService;
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotlin.goods.service.CategoryService getCategoryService() {
        return null;
    }
    
    public final void setCategoryService(@org.jetbrains.annotations.NotNull()
    com.kotlin.goods.service.CategoryService p0) {
    }
    
    public final void getCategory(int parentId) {
    }
    
    @javax.inject.Inject()
    public CategoryPresenter() {
        super();
    }
}