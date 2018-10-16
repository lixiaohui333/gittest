package com.kotlin.order.ui.activity;

import java.lang.System;

@com.alibaba.android.arouter.facade.annotation.Route(path = "/orderCenter/confirm")
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0014J\b\u0010\u000f\u001a\u00020\fH\u0002J\u0012\u0010\u0010\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\fH\u0014J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\bH\u0016J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\fH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/kotlin/order/ui/activity/OrderConfirmActivity;", "Lcom/kotlin/base/ui/activity/BaseMvpActivity;", "Lcom/kotlin/order/presenter/OrderConfirmPresenter;", "Lcom/kotlin/order/presenter/view/OrderConfirmView;", "()V", "mAdapter", "Lcom/kotlin/order/ui/adapter/OrderGoodsAdapter;", "mCurrentOrder", "Lcom/kotlin/order/data/protocol/Order;", "mOrderId", "", "initObserve", "", "initView", "injectComponent", "loadData", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onGetOrderByIdResult", "result", "onSubmitOrderResult", "", "updateAddressView", "OrderCenter_debug"})
public final class OrderConfirmActivity extends com.kotlin.base.ui.activity.BaseMvpActivity<com.kotlin.order.presenter.OrderConfirmPresenter> implements com.kotlin.order.presenter.view.OrderConfirmView {
    @com.alibaba.android.arouter.facade.annotation.Autowired(name = "order_id")
    public int mOrderId;
    private com.kotlin.order.ui.adapter.OrderGoodsAdapter mAdapter;
    private com.kotlin.order.data.protocol.Order mCurrentOrder;
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
    
    private final void initObserve() {
    }
    
    private final void loadData() {
    }
    
    @java.lang.Override()
    public void onGetOrderByIdResult(@org.jetbrains.annotations.NotNull()
    com.kotlin.order.data.protocol.Order result) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    private final void updateAddressView() {
    }
    
    @java.lang.Override()
    public void onSubmitOrderResult(boolean result) {
    }
    
    public OrderConfirmActivity() {
        super();
    }
}