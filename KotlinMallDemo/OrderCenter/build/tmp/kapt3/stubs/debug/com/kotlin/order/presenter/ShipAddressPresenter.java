package com.kotlin.order.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0012"}, d2 = {"Lcom/kotlin/order/presenter/ShipAddressPresenter;", "Lcom/kotlin/base/presenter/BasePresenter;", "Lcom/kotlin/order/presenter/view/ShipAddressView;", "()V", "shipAddressService", "Lcom/kotlin/order/service/ShipAddressService;", "getShipAddressService", "()Lcom/kotlin/order/service/ShipAddressService;", "setShipAddressService", "(Lcom/kotlin/order/service/ShipAddressService;)V", "deleteShipAddress", "", "id", "", "getShipAddressList", "setDefaultShipAddress", "address", "Lcom/kotlin/order/data/protocol/ShipAddress;", "OrderCenter_debug"})
public final class ShipAddressPresenter extends com.kotlin.base.presenter.BasePresenter<com.kotlin.order.presenter.view.ShipAddressView> {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.kotlin.order.service.ShipAddressService shipAddressService;
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotlin.order.service.ShipAddressService getShipAddressService() {
        return null;
    }
    
    public final void setShipAddressService(@org.jetbrains.annotations.NotNull()
    com.kotlin.order.service.ShipAddressService p0) {
    }
    
    public final void getShipAddressList() {
    }
    
    public final void setDefaultShipAddress(@org.jetbrains.annotations.NotNull()
    com.kotlin.order.data.protocol.ShipAddress address) {
    }
    
    public final void deleteShipAddress(int id) {
    }
    
    @javax.inject.Inject()
    public ShipAddressPresenter() {
        super();
    }
}