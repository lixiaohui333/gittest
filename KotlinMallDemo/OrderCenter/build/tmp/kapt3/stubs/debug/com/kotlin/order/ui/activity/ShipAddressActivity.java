package com.kotlin.order.ui.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0014J\b\u0010\n\u001a\u00020\bH\u0002J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0016J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\bH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/kotlin/order/ui/activity/ShipAddressActivity;", "Lcom/kotlin/base/ui/activity/BaseMvpActivity;", "Lcom/kotlin/order/presenter/ShipAddressPresenter;", "Lcom/kotlin/order/presenter/view/ShipAddressView;", "()V", "mAdapter", "Lcom/kotlin/order/ui/adapter/ShipAddressAdapter;", "initView", "", "injectComponent", "loadData", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDeleteResult", "result", "", "onGetShipAddressResult", "", "Lcom/kotlin/order/data/protocol/ShipAddress;", "onSetDefaultResult", "onStart", "OrderCenter_debug"})
public final class ShipAddressActivity extends com.kotlin.base.ui.activity.BaseMvpActivity<com.kotlin.order.presenter.ShipAddressPresenter> implements com.kotlin.order.presenter.view.ShipAddressView {
    private com.kotlin.order.ui.adapter.ShipAddressAdapter mAdapter;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void injectComponent() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    private final void initView() {
    }
    
    private final void loadData() {
    }
    
    @java.lang.Override()
    public void onGetShipAddressResult(@org.jetbrains.annotations.Nullable()
    java.util.List<com.kotlin.order.data.protocol.ShipAddress> result) {
    }
    
    @java.lang.Override()
    public void onSetDefaultResult(boolean result) {
    }
    
    @java.lang.Override()
    public void onDeleteResult(boolean result) {
    }
    
    public ShipAddressActivity() {
        super();
    }
}