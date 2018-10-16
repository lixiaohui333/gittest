package com.kotlin.goods.ui.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0014J\b\u0010\u000f\u001a\u00020\fH\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u0015\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u0018\u0010\u0018\u001a\u00020\f2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/kotlin/goods/ui/activity/GoodsActivity;", "Lcom/kotlin/base/ui/activity/BaseMvpActivity;", "Lcom/kotlin/goods/presenter/GoodsListPresenter;", "Lcom/kotlin/goods/presenter/view/GoodsListView;", "Lcn/bingoogolapple/refreshlayout/BGARefreshLayout$BGARefreshLayoutDelegate;", "()V", "mCurrentPage", "", "mGoodsAdapter", "Lcom/kotlin/goods/ui/adapter/GoodsAdapter;", "mMaxPage", "initRefreshLayout", "", "initView", "injectComponent", "loadData", "onBGARefreshLayoutBeginLoadingMore", "", "refreshLayout", "Lcn/bingoogolapple/refreshlayout/BGARefreshLayout;", "onBGARefreshLayoutBeginRefreshing", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onGetGoodsListResult", "result", "", "Lcom/kotlin/goods/data/protocol/Goods;", "GoodsCenter_debug"})
public final class GoodsActivity extends com.kotlin.base.ui.activity.BaseMvpActivity<com.kotlin.goods.presenter.GoodsListPresenter> implements com.kotlin.goods.presenter.view.GoodsListView, cn.bingoogolapple.refreshlayout.BGARefreshLayout.BGARefreshLayoutDelegate {
    private com.kotlin.goods.ui.adapter.GoodsAdapter mGoodsAdapter;
    private int mCurrentPage;
    private int mMaxPage;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initView() {
    }
    
    private final void initRefreshLayout() {
    }
    
    private final void loadData() {
    }
    
    @java.lang.Override()
    protected void injectComponent() {
    }
    
    @java.lang.Override()
    public void onGetGoodsListResult(@org.jetbrains.annotations.Nullable()
    java.util.List<com.kotlin.goods.data.protocol.Goods> result) {
    }
    
    @java.lang.Override()
    public boolean onBGARefreshLayoutBeginLoadingMore(@org.jetbrains.annotations.Nullable()
    cn.bingoogolapple.refreshlayout.BGARefreshLayout refreshLayout) {
        return false;
    }
    
    @java.lang.Override()
    public void onBGARefreshLayoutBeginRefreshing(@org.jetbrains.annotations.Nullable()
    cn.bingoogolapple.refreshlayout.BGARefreshLayout refreshLayout) {
    }
    
    public GoodsActivity() {
        super();
    }
}