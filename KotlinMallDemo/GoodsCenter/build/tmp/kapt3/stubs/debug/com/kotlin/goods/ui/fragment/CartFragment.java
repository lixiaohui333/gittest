package com.kotlin.goods.ui.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\nH\u0014J\b\u0010\r\u001a\u00020\nH\u0002J&\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\nH\u0016J\u0018\u0010\u001a\u001a\u00020\n2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bH\u0016J\b\u0010\u001d\u001a\u00020\nH\u0016J\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u001fH\u0016J\u001a\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\"\u001a\u00020\nH\u0002J\u000e\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u0018J\b\u0010%\u001a\u00020\nH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/kotlin/goods/ui/fragment/CartFragment;", "Lcom/kotlin/base/ui/fragment/BaseMvpFragment;", "Lcom/kotlin/goods/presenter/CartListPresenter;", "Lcom/kotlin/goods/presenter/view/CartListView;", "()V", "mAdapter", "Lcom/kotlin/goods/ui/adapter/CartGoodsAdapter;", "mTotalPrice", "", "initObserve", "", "initView", "injectComponent", "loadData", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDeleteCartListResult", "result", "", "onDestroy", "onGetCartListResult", "", "Lcom/kotlin/goods/data/protocol/CartGoods;", "onStart", "onSubmitCartListResult", "", "onViewCreated", "view", "refreshEditStatus", "setBackVisible", "isVisible", "updateTotalPrice", "GoodsCenter_debug"})
public final class CartFragment extends com.kotlin.base.ui.fragment.BaseMvpFragment<com.kotlin.goods.presenter.CartListPresenter> implements com.kotlin.goods.presenter.view.CartListView {
    private com.kotlin.goods.ui.adapter.CartGoodsAdapter mAdapter;
    private long mTotalPrice;
    private java.util.HashMap _$_findViewCache;
    
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
    
    @java.lang.Override()
    public void onStart() {
    }
    
    private final void initView() {
    }
    
    private final void refreshEditStatus() {
    }
    
    private final void loadData() {
    }
    
    @java.lang.Override()
    public void onGetCartListResult(@org.jetbrains.annotations.Nullable()
    java.util.List<com.kotlin.goods.data.protocol.CartGoods> result) {
    }
    
    private final void initObserve() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void updateTotalPrice() {
    }
    
    @java.lang.Override()
    public void onDeleteCartListResult(boolean result) {
    }
    
    @java.lang.Override()
    public void onSubmitCartListResult(int result) {
    }
    
    public final void setBackVisible(boolean isVisible) {
    }
    
    public CartFragment() {
        super();
    }
}