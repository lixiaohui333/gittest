package com.kotlin.order.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006J\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ\u001a\u0010\u0010\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00110\u00050\u0004\u00a8\u0006\u0012"}, d2 = {"Lcom/kotlin/order/data/repository/ShipAddressRepository;", "", "()V", "addShipAddress", "Lrx/Observable;", "Lcom/kotlin/base/data/protocol/BaseResp;", "", "shipUserName", "shipUserMobile", "shipAddress", "deleteShipAddress", "id", "", "editShipAddress", "address", "Lcom/kotlin/order/data/protocol/ShipAddress;", "getShipAddressList", "", "OrderCenter_debug"})
public final class ShipAddressRepository {
    
    @org.jetbrains.annotations.NotNull()
    public final rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.lang.String>> addShipAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String shipUserName, @org.jetbrains.annotations.NotNull()
    java.lang.String shipUserMobile, @org.jetbrains.annotations.NotNull()
    java.lang.String shipAddress) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.lang.String>> deleteShipAddress(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.lang.String>> editShipAddress(@org.jetbrains.annotations.NotNull()
    com.kotlin.order.data.protocol.ShipAddress address) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.util.List<com.kotlin.order.data.protocol.ShipAddress>>> getShipAddressList() {
        return null;
    }
    
    @javax.inject.Inject()
    public ShipAddressRepository() {
        super();
    }
}