package com.kotlin.order.service.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0016\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00170\nH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0018"}, d2 = {"Lcom/kotlin/order/service/impl/ShipAddressServiceImpl;", "Lcom/kotlin/order/service/ShipAddressService;", "()V", "repository", "Lcom/kotlin/order/data/repository/ShipAddressRepository;", "getRepository", "()Lcom/kotlin/order/data/repository/ShipAddressRepository;", "setRepository", "(Lcom/kotlin/order/data/repository/ShipAddressRepository;)V", "addShipAddress", "Lrx/Observable;", "", "shipUserName", "", "shipUserMobile", "shipAddress", "deleteShipAddress", "id", "", "editShipAddress", "address", "Lcom/kotlin/order/data/protocol/ShipAddress;", "getShipAddressList", "", "OrderCenter_debug"})
public final class ShipAddressServiceImpl implements com.kotlin.order.service.ShipAddressService {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.kotlin.order.data.repository.ShipAddressRepository repository;
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotlin.order.data.repository.ShipAddressRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.kotlin.order.data.repository.ShipAddressRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public rx.Observable<java.lang.Boolean> addShipAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String shipUserName, @org.jetbrains.annotations.NotNull()
    java.lang.String shipUserMobile, @org.jetbrains.annotations.NotNull()
    java.lang.String shipAddress) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public rx.Observable<java.util.List<com.kotlin.order.data.protocol.ShipAddress>> getShipAddressList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public rx.Observable<java.lang.Boolean> editShipAddress(@org.jetbrains.annotations.NotNull()
    com.kotlin.order.data.protocol.ShipAddress address) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public rx.Observable<java.lang.Boolean> deleteShipAddress(int id) {
        return null;
    }
    
    @javax.inject.Inject()
    public ShipAddressServiceImpl() {
        super();
    }
}