package com.kotlin.order.presenter.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\n"}, d2 = {"Lcom/kotlin/order/presenter/view/ShipAddressView;", "Lcom/kotlin/base/presenter/view/BaseView;", "onDeleteResult", "", "result", "", "onGetShipAddressResult", "", "Lcom/kotlin/order/data/protocol/ShipAddress;", "onSetDefaultResult", "OrderCenter_debug"})
public abstract interface ShipAddressView extends com.kotlin.base.presenter.view.BaseView {
    
    public abstract void onGetShipAddressResult(@org.jetbrains.annotations.Nullable()
    java.util.List<com.kotlin.order.data.protocol.ShipAddress> result);
    
    public abstract void onSetDefaultResult(boolean result);
    
    public abstract void onDeleteResult(boolean result);
}