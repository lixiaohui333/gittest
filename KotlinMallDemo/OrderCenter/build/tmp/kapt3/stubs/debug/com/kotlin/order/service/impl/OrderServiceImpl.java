package com.kotlin.order.service.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001e\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00120\n2\u0006\u0010\u0013\u001a\u00020\rH\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0015\u001a\u00020\u0010H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lcom/kotlin/order/service/impl/OrderServiceImpl;", "Lcom/kotlin/order/service/OrderService;", "()V", "repository", "Lcom/kotlin/order/data/repository/OrderRepository;", "getRepository", "()Lcom/kotlin/order/data/repository/OrderRepository;", "setRepository", "(Lcom/kotlin/order/data/repository/OrderRepository;)V", "cancelOrder", "Lrx/Observable;", "", "orderId", "", "confirmOrder", "getOrderById", "Lcom/kotlin/order/data/protocol/Order;", "getOrderList", "", "orderStatus", "submitOrder", "order", "OrderCenter_debug"})
public final class OrderServiceImpl implements com.kotlin.order.service.OrderService {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.kotlin.order.data.repository.OrderRepository repository;
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotlin.order.data.repository.OrderRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.kotlin.order.data.repository.OrderRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public rx.Observable<com.kotlin.order.data.protocol.Order> getOrderById(int orderId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public rx.Observable<java.lang.Boolean> submitOrder(@org.jetbrains.annotations.NotNull()
    com.kotlin.order.data.protocol.Order order) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public rx.Observable<java.util.List<com.kotlin.order.data.protocol.Order>> getOrderList(int orderStatus) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public rx.Observable<java.lang.Boolean> cancelOrder(int orderId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public rx.Observable<java.lang.Boolean> confirmOrder(int orderId) {
        return null;
    }
    
    @javax.inject.Inject()
    public OrderServiceImpl() {
        super();
    }
}