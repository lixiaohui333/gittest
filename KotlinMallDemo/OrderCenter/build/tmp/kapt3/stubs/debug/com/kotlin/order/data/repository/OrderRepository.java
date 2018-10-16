package com.kotlin.order.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bJ\"\u0010\f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r0\u00050\u00042\u0006\u0010\u000e\u001a\u00020\bJ\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u000b\u00a8\u0006\u0011"}, d2 = {"Lcom/kotlin/order/data/repository/OrderRepository;", "", "()V", "cancelOrder", "Lrx/Observable;", "Lcom/kotlin/base/data/protocol/BaseResp;", "", "orderId", "", "confirmOrder", "getOrderById", "Lcom/kotlin/order/data/protocol/Order;", "getOrderList", "", "orderStatus", "submitOrder", "order", "OrderCenter_debug"})
public final class OrderRepository {
    
    @org.jetbrains.annotations.NotNull()
    public final rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.lang.String>> cancelOrder(int orderId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.lang.String>> confirmOrder(int orderId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final rx.Observable<com.kotlin.base.data.protocol.BaseResp<com.kotlin.order.data.protocol.Order>> getOrderById(int orderId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.util.List<com.kotlin.order.data.protocol.Order>>> getOrderList(int orderStatus) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.lang.String>> submitOrder(@org.jetbrains.annotations.NotNull()
    com.kotlin.order.data.protocol.Order order) {
        return null;
    }
    
    @javax.inject.Inject()
    public OrderRepository() {
        super();
    }
}