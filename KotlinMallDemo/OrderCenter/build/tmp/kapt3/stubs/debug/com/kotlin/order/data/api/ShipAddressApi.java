package com.kotlin.order.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\tH\'J\u001e\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u000bH\'J\u001c\u0010\f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\u00040\u0003H\'\u00a8\u0006\u000f"}, d2 = {"Lcom/kotlin/order/data/api/ShipAddressApi;", "", "addShipAddress", "Lrx/Observable;", "Lcom/kotlin/base/data/protocol/BaseResp;", "", "req", "Lcom/kotlin/order/data/protocol/AddShipAddressReq;", "deleteShipAddress", "Lcom/kotlin/order/data/protocol/DeleteShipAddressReq;", "editShipAddress", "Lcom/kotlin/order/data/protocol/EditShipAddressReq;", "getShipAddressList", "", "Lcom/kotlin/order/data/protocol/ShipAddress;", "OrderCenter_debug"})
public abstract interface ShipAddressApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "shipAddress/add")
    public abstract rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.lang.String>> addShipAddress(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.kotlin.order.data.protocol.AddShipAddressReq req);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "shipAddress/delete")
    public abstract rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.lang.String>> deleteShipAddress(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.kotlin.order.data.protocol.DeleteShipAddressReq req);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "shipAddress/modify")
    public abstract rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.lang.String>> editShipAddress(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.kotlin.order.data.protocol.EditShipAddressReq req);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "shipAddress/getList")
    public abstract rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.util.List<com.kotlin.order.data.protocol.ShipAddress>>> getShipAddressList();
}