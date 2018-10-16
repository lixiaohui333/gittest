package com.kotlin.goods.ui.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\rH\u0002J\b\u0010\u0011\u001a\u00020\rH\u0002J\b\u0010\u0012\u001a\u00020\rH\u0014J\b\u0010\u0013\u001a\u00020\rH\u0002J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\tH\u0002J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0017H\u0016J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\rH\u0016J\u0010\u0010!\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\tH\u0016J\u001a\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/kotlin/goods/ui/fragment/GoodsDetailTabOneFragment;", "Lcom/kotlin/base/ui/fragment/BaseMvpFragment;", "Lcom/kotlin/goods/presenter/GoodsDetailPresenter;", "Lcom/kotlin/goods/presenter/view/GoodsDetailView;", "()V", "mAnimationEnd", "Landroid/view/animation/Animation;", "mAnimationStart", "mCurGoods", "Lcom/kotlin/goods/data/protocol/Goods;", "mSkuPop", "Lcom/kotlin/goods/widget/GoodsSkuPopView;", "addCart", "", "initAnim", "initObserve", "initSkuPop", "initView", "injectComponent", "loadData", "loadPopData", "result", "onAddCartResult", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onGetGoodsDetailResult", "onViewCreated", "view", "GoodsCenter_debug"})
public final class GoodsDetailTabOneFragment extends com.kotlin.base.ui.fragment.BaseMvpFragment<com.kotlin.goods.presenter.GoodsDetailPresenter> implements com.kotlin.goods.presenter.view.GoodsDetailView {
    private com.kotlin.goods.widget.GoodsSkuPopView mSkuPop;
    private android.view.animation.Animation mAnimationStart;
    private android.view.animation.Animation mAnimationEnd;
    private com.kotlin.goods.data.protocol.Goods mCurGoods;
    private java.util.HashMap _$_findViewCache;
    
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
    
    private final void initAnim() {
    }
    
    private final void initSkuPop() {
    }
    
    private final void loadData() {
    }
    
    @java.lang.Override()
    protected void injectComponent() {
    }
    
    @java.lang.Override()
    public void onGetGoodsDetailResult(@org.jetbrains.annotations.NotNull()
    com.kotlin.goods.data.protocol.Goods result) {
    }
    
    private final void loadPopData(com.kotlin.goods.data.protocol.Goods result) {
    }
    
    private final void initObserve() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void addCart() {
    }
    
    @java.lang.Override()
    public void onAddCartResult(int result) {
    }
    
    public GoodsDetailTabOneFragment() {
        super();
    }
}