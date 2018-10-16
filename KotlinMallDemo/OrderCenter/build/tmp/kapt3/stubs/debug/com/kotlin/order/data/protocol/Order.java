package com.kotlin.order.data.protocol;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\u0002\u0010\rJ\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\bH\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u00c6\u0003JM\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u00c6\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\'\u001a\u00020(H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006)"}, d2 = {"Lcom/kotlin/order/data/protocol/Order;", "", "id", "", "payType", "shipAddress", "Lcom/kotlin/order/data/protocol/ShipAddress;", "totalPrice", "", "orderStatus", "orderGoodsList", "", "Lcom/kotlin/order/data/protocol/OrderGoods;", "(IILcom/kotlin/order/data/protocol/ShipAddress;JILjava/util/List;)V", "getId", "()I", "getOrderGoodsList", "()Ljava/util/List;", "getOrderStatus", "setOrderStatus", "(I)V", "getPayType", "getShipAddress", "()Lcom/kotlin/order/data/protocol/ShipAddress;", "setShipAddress", "(Lcom/kotlin/order/data/protocol/ShipAddress;)V", "getTotalPrice", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "OrderCenter_debug"})
public final class Order {
    private final int id = 0;
    private final int payType = 0;
    @org.jetbrains.annotations.Nullable()
    private com.kotlin.order.data.protocol.ShipAddress shipAddress;
    private final long totalPrice = 0L;
    private int orderStatus;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.kotlin.order.data.protocol.OrderGoods> orderGoodsList = null;
    
    public final int getId() {
        return 0;
    }
    
    public final int getPayType() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.kotlin.order.data.protocol.ShipAddress getShipAddress() {
        return null;
    }
    
    public final void setShipAddress(@org.jetbrains.annotations.Nullable()
    com.kotlin.order.data.protocol.ShipAddress p0) {
    }
    
    public final long getTotalPrice() {
        return 0L;
    }
    
    public final int getOrderStatus() {
        return 0;
    }
    
    public final void setOrderStatus(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.kotlin.order.data.protocol.OrderGoods> getOrderGoodsList() {
        return null;
    }
    
    public Order(int id, int payType, @org.jetbrains.annotations.Nullable()
    com.kotlin.order.data.protocol.ShipAddress shipAddress, long totalPrice, int orderStatus, @org.jetbrains.annotations.NotNull()
    java.util.List<com.kotlin.order.data.protocol.OrderGoods> orderGoodsList) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.kotlin.order.data.protocol.ShipAddress component3() {
        return null;
    }
    
    public final long component4() {
        return 0L;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.kotlin.order.data.protocol.OrderGoods> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotlin.order.data.protocol.Order copy(int id, int payType, @org.jetbrains.annotations.Nullable()
    com.kotlin.order.data.protocol.ShipAddress shipAddress, long totalPrice, int orderStatus, @org.jetbrains.annotations.NotNull()
    java.util.List<com.kotlin.order.data.protocol.OrderGoods> orderGoodsList) {
        return null;
    }
    
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(java.lang.Object p0) {
        return false;
    }
}