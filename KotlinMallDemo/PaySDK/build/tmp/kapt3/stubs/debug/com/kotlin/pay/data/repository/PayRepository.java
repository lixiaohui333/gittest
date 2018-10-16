package com.kotlin.pay.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\f"}, d2 = {"Lcom/kotlin/pay/data/repository/PayRepository;", "", "()V", "getPaySign", "Lrx/Observable;", "Lcom/kotlin/base/data/protocol/BaseResp;", "", "orderId", "", "totalPrice", "", "payOrder", "PaySDK_debug"})
public final class PayRepository {
    
    @org.jetbrains.annotations.NotNull()
    public final rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.lang.String>> getPaySign(int orderId, long totalPrice) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.lang.String>> payOrder(int orderId) {
        return null;
    }
    
    @javax.inject.Inject()
    public PayRepository() {
        super();
    }
}