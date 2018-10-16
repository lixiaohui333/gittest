package com.kotlin.pay.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u000b"}, d2 = {"Lcom/kotlin/pay/service/PayService;", "", "getPaySign", "Lrx/Observable;", "", "orderId", "", "totalPrice", "", "payOrder", "", "PaySDK_debug"})
public abstract interface PayService {
    
    @org.jetbrains.annotations.NotNull()
    public abstract rx.Observable<java.lang.String> getPaySign(int orderId, long totalPrice);
    
    @org.jetbrains.annotations.NotNull()
    public abstract rx.Observable<java.lang.Boolean> payOrder(int orderId);
}