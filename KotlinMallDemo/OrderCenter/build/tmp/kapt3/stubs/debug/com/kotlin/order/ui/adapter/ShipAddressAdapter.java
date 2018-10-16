package com.kotlin.order.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0016\u0017B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0011H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/kotlin/order/ui/adapter/ShipAddressAdapter;", "Lcom/kotlin/base/ui/adapter/BaseRecyclerViewAdapter;", "Lcom/kotlin/order/data/protocol/ShipAddress;", "Lcom/kotlin/order/ui/adapter/ShipAddressAdapter$ViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mOptClickListener", "Lcom/kotlin/order/ui/adapter/ShipAddressAdapter$OnOptClickListener;", "getMOptClickListener", "()Lcom/kotlin/order/ui/adapter/ShipAddressAdapter$OnOptClickListener;", "setMOptClickListener", "(Lcom/kotlin/order/ui/adapter/ShipAddressAdapter$OnOptClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnOptClickListener", "ViewHolder", "OrderCenter_debug"})
public final class ShipAddressAdapter extends com.kotlin.base.ui.adapter.BaseRecyclerViewAdapter<com.kotlin.order.data.protocol.ShipAddress, com.kotlin.order.ui.adapter.ShipAddressAdapter.ViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private com.kotlin.order.ui.adapter.ShipAddressAdapter.OnOptClickListener mOptClickListener;
    
    @org.jetbrains.annotations.Nullable()
    public final com.kotlin.order.ui.adapter.ShipAddressAdapter.OnOptClickListener getMOptClickListener() {
        return null;
    }
    
    public final void setMOptClickListener(@org.jetbrains.annotations.Nullable()
    com.kotlin.order.ui.adapter.ShipAddressAdapter.OnOptClickListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.kotlin.order.ui.adapter.ShipAddressAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.kotlin.order.ui.adapter.ShipAddressAdapter.ViewHolder holder, int position) {
    }
    
    public ShipAddressAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/kotlin/order/ui/adapter/ShipAddressAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "OrderCenter_debug"})
    public static final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Lcom/kotlin/order/ui/adapter/ShipAddressAdapter$OnOptClickListener;", "", "onDelete", "", "address", "Lcom/kotlin/order/data/protocol/ShipAddress;", "onEdit", "onSetDefault", "OrderCenter_debug"})
    public static abstract interface OnOptClickListener {
        
        public abstract void onSetDefault(@org.jetbrains.annotations.NotNull()
        com.kotlin.order.data.protocol.ShipAddress address);
        
        public abstract void onEdit(@org.jetbrains.annotations.NotNull()
        com.kotlin.order.data.protocol.ShipAddress address);
        
        public abstract void onDelete(@org.jetbrains.annotations.NotNull()
        com.kotlin.order.data.protocol.ShipAddress address);
    }
}