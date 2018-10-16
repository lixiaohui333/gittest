package com.kotlin.pay.service.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\f\u001a\u00020\rH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/kotlin/pay/service/impl/PayServiceImpl;", "Lcom/kotlin/pay/service/PayService;", "()V", "repository", "Lcom/kotlin/pay/data/repository/PayRepository;", "getRepository", "()Lcom/kotlin/pay/data/repository/PayRepository;", "setRepository", "(Lcom/kotlin/pay/data/repository/PayRepository;)V", "getPaySign", "Lrx/Observable;", "", "orderId", "", "totalPrice", "", "payOrder", "", "PaySDK_debug"})
public final class PayServiceImpl implements com.kotlin.pay.service.PayService {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.kotlin.pay.data.repository.PayRepository repository;
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotlin.pay.data.repository.PayRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.kotlin.pay.data.repository.PayRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public rx.Observable<java.lang.String> getPaySign(int orderId, long totalPrice) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public rx.Observable<java.lang.Boolean> payOrder(int orderId) {
        return null;
    }
    
    @javax.inject.Inject()
    public PayServiceImpl() {
        super();
    }
}