package com.kotlin.pay.presenter.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/kotlin/pay/presenter/view/PayView;", "Lcom/kotlin/base/presenter/view/BaseView;", "onGetSignResult", "", "result", "", "onPayOrderResult", "", "PaySDK_debug"})
public abstract interface PayView extends com.kotlin.base.presenter.view.BaseView {
    
    public abstract void onGetSignResult(@org.jetbrains.annotations.NotNull()
    java.lang.String result);
    
    public abstract void onPayOrderResult(boolean result);
}