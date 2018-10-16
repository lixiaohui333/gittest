package com.kotlin.order.ui.activity;

import java.lang.System;

@com.alibaba.android.arouter.facade.annotation.Route(path = "/messageCenter/order")
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0014J\b\u0010\n\u001a\u00020\bH\u0002J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/kotlin/order/ui/activity/OrderDetailActivity;", "Lcom/kotlin/base/ui/activity/BaseMvpActivity;", "Lcom/kotlin/order/presenter/OrderDetailPresenter;", "Lcom/kotlin/order/presenter/view/OrderDetailView;", "()V", "mAdapter", "Lcom/kotlin/order/ui/adapter/OrderGoodsAdapter;", "initView", "", "injectComponent", "loadData", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onGetOrderByIdResult", "result", "Lcom/kotlin/order/data/protocol/Order;", "OrderCenter_debug"})
public final class OrderDetailActivity extends com.kotlin.base.ui.activity.BaseMvpActivity<com.kotlin.order.presenter.OrderDetailPresenter> implements com.kotlin.order.presenter.view.OrderDetailView {
    private com.kotlin.order.ui.adapter.OrderGoodsAdapter mAdapter;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void injectComponent() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initView() {
    }
    
    private final void loadData() {
    }
    
    @java.lang.Override()
    public void onGetOrderByIdResult(@org.jetbrains.annotations.NotNull()
    com.kotlin.order.data.protocol.Order result) {
    }
    
    public OrderDetailActivity() {
        super();
    }
}