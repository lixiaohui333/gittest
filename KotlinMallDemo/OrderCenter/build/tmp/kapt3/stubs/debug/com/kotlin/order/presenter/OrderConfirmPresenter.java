package com.kotlin.order.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0011"}, d2 = {"Lcom/kotlin/order/presenter/OrderConfirmPresenter;", "Lcom/kotlin/base/presenter/BasePresenter;", "Lcom/kotlin/order/presenter/view/OrderConfirmView;", "()V", "orderService", "Lcom/kotlin/order/service/OrderService;", "getOrderService", "()Lcom/kotlin/order/service/OrderService;", "setOrderService", "(Lcom/kotlin/order/service/OrderService;)V", "getOrderById", "", "orderId", "", "submitOrder", "order", "Lcom/kotlin/order/data/protocol/Order;", "OrderCenter_debug"})
public final class OrderConfirmPresenter extends com.kotlin.base.presenter.BasePresenter<com.kotlin.order.presenter.view.OrderConfirmView> {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.kotlin.order.service.OrderService orderService;
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotlin.order.service.OrderService getOrderService() {
        return null;
    }
    
    public final void setOrderService(@org.jetbrains.annotations.NotNull()
    com.kotlin.order.service.OrderService p0) {
    }
    
    public final void getOrderById(int orderId) {
    }
    
    public final void submitOrder(@org.jetbrains.annotations.NotNull()
    com.kotlin.order.data.protocol.Order order) {
    }
    
    @javax.inject.Inject()
    public OrderConfirmPresenter() {
        super();
    }
}