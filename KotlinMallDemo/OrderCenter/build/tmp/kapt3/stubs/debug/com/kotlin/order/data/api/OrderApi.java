package com.kotlin.order.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\tH\'J\u001e\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\fH\'J&\u0010\r\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000e0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u000fH\'J\u001e\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0011H\'\u00a8\u0006\u0012"}, d2 = {"Lcom/kotlin/order/data/api/OrderApi;", "", "cancelOrder", "Lrx/Observable;", "Lcom/kotlin/base/data/protocol/BaseResp;", "", "req", "Lcom/kotlin/order/data/protocol/CancelOrderReq;", "confirmOrder", "Lcom/kotlin/order/data/protocol/ConfirmOrderReq;", "getOrderById", "Lcom/kotlin/order/data/protocol/Order;", "Lcom/kotlin/order/data/protocol/GetOrderByIdReq;", "getOrderList", "", "Lcom/kotlin/order/data/protocol/GetOrderListReq;", "submitOrder", "Lcom/kotlin/order/data/protocol/SubmitOrderReq;", "OrderCenter_debug"})
public abstract interface OrderApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "order/cancel")
    public abstract rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.lang.String>> cancelOrder(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.kotlin.order.data.protocol.CancelOrderReq req);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "order/confirm")
    public abstract rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.lang.String>> confirmOrder(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.kotlin.order.data.protocol.ConfirmOrderReq req);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "order/getOrderById")
    public abstract rx.Observable<com.kotlin.base.data.protocol.BaseResp<com.kotlin.order.data.protocol.Order>> getOrderById(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.kotlin.order.data.protocol.GetOrderByIdReq req);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "order/getOrderList")
    public abstract rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.util.List<com.kotlin.order.data.protocol.Order>>> getOrderList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.kotlin.order.data.protocol.GetOrderListReq req);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "order/submitOrder")
    public abstract rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.lang.String>> submitOrder(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.kotlin.order.data.protocol.SubmitOrderReq req);
}