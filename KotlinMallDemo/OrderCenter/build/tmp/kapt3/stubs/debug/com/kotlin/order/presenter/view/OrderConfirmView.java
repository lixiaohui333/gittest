package com.kotlin.order.presenter.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/kotlin/order/presenter/view/OrderConfirmView;", "Lcom/kotlin/base/presenter/view/BaseView;", "onGetOrderByIdResult", "", "result", "Lcom/kotlin/order/data/protocol/Order;", "onSubmitOrderResult", "", "OrderCenter_debug"})
public abstract interface OrderConfirmView extends com.kotlin.base.presenter.view.BaseView {
    
    public abstract void onGetOrderByIdResult(@org.jetbrains.annotations.NotNull()
    com.kotlin.order.data.protocol.Order result);
    
    public abstract void onSubmitOrderResult(boolean result);
}