package com.kotlin.pay.ui.activity;

import java.lang.System;

@com.alibaba.android.arouter.facade.annotation.Route(path = "/paySDK/pay")
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0013H\u0014J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020 H\u0016J \u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020 H\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006%"}, d2 = {"Lcom/kotlin/pay/ui/activity/CashRegisterActivity;", "Lcom/kotlin/base/ui/activity/BaseMvpActivity;", "Lcom/kotlin/pay/presenter/PayPresenter;", "Lcom/kotlin/pay/presenter/view/PayView;", "Landroid/view/View$OnClickListener;", "()V", "mOrderId", "", "getMOrderId", "()I", "setMOrderId", "(I)V", "mTotalPrice", "", "getMTotalPrice", "()J", "setMTotalPrice", "(J)V", "initData", "", "initView", "injectComponent", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onGetSignResult", "result", "", "onPayOrderResult", "", "updatePayType", "isAliPay", "isWeixinPay", "isBankCardPay", "PaySDK_debug"})
public final class CashRegisterActivity extends com.kotlin.base.ui.activity.BaseMvpActivity<com.kotlin.pay.presenter.PayPresenter> implements com.kotlin.pay.presenter.view.PayView, android.view.View.OnClickListener {
    private int mOrderId;
    private long mTotalPrice;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void injectComponent() {
    }
    
    public final int getMOrderId() {
        return 0;
    }
    
    public final void setMOrderId(int p0) {
    }
    
    public final long getMTotalPrice() {
        return 0L;
    }
    
    public final void setMTotalPrice(long p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initData() {
    }
    
    private final void initView() {
    }
    
    @java.lang.Override()
    public void onGetSignResult(@org.jetbrains.annotations.NotNull()
    java.lang.String result) {
    }
    
    @java.lang.Override()
    public void onPayOrderResult(boolean result) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    private final void updatePayType(boolean isAliPay, boolean isWeixinPay, boolean isBankCardPay) {
    }
    
    public CashRegisterActivity() {
        super();
    }
}