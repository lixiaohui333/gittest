package com.kotlin.order.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001e\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b0\u00032\u0006\u0010\f\u001a\u00020\u0006H&J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000e\u001a\u00020\tH&\u00a8\u0006\u000f"}, d2 = {"Lcom/kotlin/order/service/OrderService;", "", "cancelOrder", "Lrx/Observable;", "", "orderId", "", "confirmOrder", "getOrderById", "Lcom/kotlin/order/data/protocol/Order;", "getOrderList", "", "orderStatus", "submitOrder", "order", "OrderCenter_debug"})
public abstract interface OrderService {
    
    @org.jetbrains.annotations.NotNull()
    public abstract rx.Observable<com.kotlin.order.data.protocol.Order> getOrderById(int orderId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract rx.Observable<java.lang.Boolean> submitOrder(@org.jetbrains.annotations.NotNull()
    com.kotlin.order.data.protocol.Order order);
    
    @org.jetbrains.annotations.NotNull()
    public abstract rx.Observable<java.util.List<com.kotlin.order.data.protocol.Order>> getOrderList(int orderStatus);
    
    @org.jetbrains.annotations.NotNull()
    public abstract rx.Observable<java.lang.Boolean> cancelOrder(int orderId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract rx.Observable<java.lang.Boolean> confirmOrder(int orderId);
}