package com.kotlin.base.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004:\u0001\"B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u001d\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u0010\u001c\u001a\u00020\u0018H\u0016\u00a2\u0006\u0002\u0010\u001dJ\u0014\u0010\u001e\u001a\u00020\u001a2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\tJ\u0014\u0010 \u001a\u00020\u001a2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012R \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0007R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006#"}, d2 = {"Lcom/kotlin/base/ui/adapter/BaseRecyclerViewAdapter;", "T", "VH", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dataList", "", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "getMContext", "()Landroid/content/Context;", "setMContext", "mItemClickListener", "Lcom/kotlin/base/ui/adapter/BaseRecyclerViewAdapter$OnItemClickListener;", "getMItemClickListener", "()Lcom/kotlin/base/ui/adapter/BaseRecyclerViewAdapter$OnItemClickListener;", "setMItemClickListener", "(Lcom/kotlin/base/ui/adapter/BaseRecyclerViewAdapter$OnItemClickListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V", "setData", "sources", "setOnItemClickListener", "listener", "OnItemClickListener", "BaseLibrary_debug"})
public abstract class BaseRecyclerViewAdapter<T extends java.lang.Object, VH extends android.support.v7.widget.RecyclerView.ViewHolder> extends android.support.v7.widget.RecyclerView.Adapter<VH> {
    @org.jetbrains.annotations.Nullable()
    private com.kotlin.base.ui.adapter.BaseRecyclerViewAdapter.OnItemClickListener<? super T> mItemClickListener;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<T> dataList;
    @org.jetbrains.annotations.NotNull()
    private android.content.Context mContext;
    
    @org.jetbrains.annotations.Nullable()
    public final com.kotlin.base.ui.adapter.BaseRecyclerViewAdapter.OnItemClickListener<T> getMItemClickListener() {
        return null;
    }
    
    public final void setMItemClickListener(@org.jetbrains.annotations.Nullable()
    com.kotlin.base.ui.adapter.BaseRecyclerViewAdapter.OnItemClickListener<? super T> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> getDataList() {
        return null;
    }
    
    public final void setDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<T> p0) {
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<T> sources) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    VH holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull()
    com.kotlin.base.ui.adapter.BaseRecyclerViewAdapter.OnItemClickListener<? super T> listener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public final void setMContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    public BaseRecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u0000*\u0006\b\u0002\u0010\u0001 \u00002\u00020\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/kotlin/base/ui/adapter/BaseRecyclerViewAdapter$OnItemClickListener;", "T", "", "onItemClick", "", "item", "position", "", "(Ljava/lang/Object;I)V", "BaseLibrary_debug"})
    public static abstract interface OnItemClickListener<T extends java.lang.Object> {
        
        public abstract void onItemClick(T item, int position);
    }
}