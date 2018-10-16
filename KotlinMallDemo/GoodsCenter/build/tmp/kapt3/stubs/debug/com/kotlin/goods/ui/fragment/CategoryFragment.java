package com.kotlin.goods.ui.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0014J\u0012\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0002J&\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020\u00122\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!H\u0016J\u001a\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006%"}, d2 = {"Lcom/kotlin/goods/ui/fragment/CategoryFragment;", "Lcom/kotlin/base/ui/fragment/BaseMvpFragment;", "Lcom/kotlin/goods/presenter/CategoryPresenter;", "Lcom/kotlin/goods/presenter/view/CategoryView;", "()V", "secondAdapter", "Lcom/kotlin/goods/ui/adapter/SecondCategoryAdapter;", "getSecondAdapter", "()Lcom/kotlin/goods/ui/adapter/SecondCategoryAdapter;", "setSecondAdapter", "(Lcom/kotlin/goods/ui/adapter/SecondCategoryAdapter;)V", "topAdapter", "Lcom/kotlin/goods/ui/adapter/TopCategoryAdapter;", "getTopAdapter", "()Lcom/kotlin/goods/ui/adapter/TopCategoryAdapter;", "setTopAdapter", "(Lcom/kotlin/goods/ui/adapter/TopCategoryAdapter;)V", "initView", "", "injectComponent", "loadData", "parentId", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onGetCategoryResult", "result", "", "Lcom/kotlin/goods/data/protocol/Category;", "onViewCreated", "view", "GoodsCenter_debug"})
public final class CategoryFragment extends com.kotlin.base.ui.fragment.BaseMvpFragment<com.kotlin.goods.presenter.CategoryPresenter> implements com.kotlin.goods.presenter.view.CategoryView {
    @org.jetbrains.annotations.NotNull()
    public com.kotlin.goods.ui.adapter.TopCategoryAdapter topAdapter;
    @org.jetbrains.annotations.NotNull()
    public com.kotlin.goods.ui.adapter.SecondCategoryAdapter secondAdapter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotlin.goods.ui.adapter.TopCategoryAdapter getTopAdapter() {
        return null;
    }
    
    public final void setTopAdapter(@org.jetbrains.annotations.NotNull()
    com.kotlin.goods.ui.adapter.TopCategoryAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotlin.goods.ui.adapter.SecondCategoryAdapter getSecondAdapter() {
        return null;
    }
    
    public final void setSecondAdapter(@org.jetbrains.annotations.NotNull()
    com.kotlin.goods.ui.adapter.SecondCategoryAdapter p0) {
    }
    
    @java.lang.Override()
    protected void injectComponent() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initView() {
    }
    
    private final void loadData(int parentId) {
    }
    
    @java.lang.Override()
    public void onGetCategoryResult(@org.jetbrains.annotations.Nullable()
    java.util.List<com.kotlin.goods.data.protocol.Category> result) {
    }
    
    public CategoryFragment() {
        super();
    }
}