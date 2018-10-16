package com.kotlin.pay.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0011"}, d2 = {"Lcom/kotlin/pay/presenter/PayPresenter;", "Lcom/kotlin/base/presenter/BasePresenter;", "Lcom/kotlin/pay/presenter/view/PayView;", "()V", "service", "Lcom/kotlin/pay/service/PayService;", "getService", "()Lcom/kotlin/pay/service/PayService;", "setService", "(Lcom/kotlin/pay/service/PayService;)V", "getPaySign", "", "orderId", "", "totalPrice", "", "payOrder", "PaySDK_debug"})
public final class PayPresenter extends com.kotlin.base.presenter.BasePresenter<com.kotlin.pay.presenter.view.PayView> {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.kotlin.pay.service.PayService service;
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotlin.pay.service.PayService getService() {
        return null;
    }
    
    public final void setService(@org.jetbrains.annotations.NotNull()
    com.kotlin.pay.service.PayService p0) {
    }
    
    public final void getPaySign(int orderId, long totalPrice) {
    }
    
    public final void payOrder(int orderId) {
    }
    
    @javax.inject.Inject()
    public PayPresenter() {
        super();
    }
}