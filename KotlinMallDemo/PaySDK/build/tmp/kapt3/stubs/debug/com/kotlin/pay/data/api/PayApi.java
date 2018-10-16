package com.kotlin.pay.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lcom/kotlin/pay/data/api/PayApi;", "", "getPaySign", "Lrx/Observable;", "Lcom/kotlin/base/data/protocol/BaseResp;", "", "req", "Lcom/kotlin/pay/data/protocol/GetPaySignReq;", "payOrder", "Lcom/kotlin/pay/data/protocol/PayOrderReq;", "PaySDK_debug"})
public abstract interface PayApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "pay/getPaySign")
    public abstract rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.lang.String>> getPaySign(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.kotlin.pay.data.protocol.GetPaySignReq req);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "order/pay")
    public abstract rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.lang.String>> payOrder(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.kotlin.pay.data.protocol.PayOrderReq req);
}