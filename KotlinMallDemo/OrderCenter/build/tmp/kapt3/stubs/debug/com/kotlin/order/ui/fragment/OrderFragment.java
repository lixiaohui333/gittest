package com.kotlin.order.ui.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0014J\b\u0010\n\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0016J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016J\u001a\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u0019H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/kotlin/order/ui/fragment/OrderFragment;", "Lcom/kotlin/base/ui/fragment/BaseMvpFragment;", "Lcom/kotlin/order/presenter/OrderListPresenter;", "Lcom/kotlin/order/presenter/view/OrderListView;", "()V", "mAdapter", "Lcom/kotlin/order/ui/adapter/OrderAdapter;", "initView", "", "injectComponent", "loadData", "onCancelOrderResult", "result", "", "onConfirmOrderResult", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onGetOrderListResult", "", "Lcom/kotlin/order/data/protocol/Order;", "onStart", "onViewCreated", "view", "showCancelDialog", "order", "OrderCenter_debug"})
public final class OrderFragment extends com.kotlin.base.ui.fragment.BaseMvpFragment<com.kotlin.order.presenter.OrderListPresenter> implements com.kotlin.order.presenter.view.OrderListView {
    private com.kotlin.order.ui.adapter.OrderAdapter mAdapter;
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
    
    private final void showCancelDialog(com.kotlin.order.data.protocol.Order order) {
    }
    
    private final void loadData() {
    }
    
    @java.lang.Override()
    public void onGetOrderListResult(@org.jetbrains.annotations.Nullable()
    java.util.List<com.kotlin.order.data.protocol.Order> result) {
    }
    
    @java.lang.Override()
    public void onConfirmOrderResult(boolean result) {
    }
    
    @java.lang.Override()
    public void onCancelOrderResult(boolean result) {
    }
    
    public OrderFragment() {
        super();
    }
}