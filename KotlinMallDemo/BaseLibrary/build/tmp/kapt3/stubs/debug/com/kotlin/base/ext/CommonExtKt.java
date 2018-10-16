package com.kotlin.base.ext;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00030\u0001\u001a\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00030\u0001\u001a \u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u001a0\u0010\r\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0011\u001a\u0012\u0010\u0012\u001a\u00020\u0007*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015\u001a\u0018\u0010\u0016\u001a\u00020\u0017*\u00020\u00172\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f\u001a\u0012\u0010\u0016\u001a\u00020\u0017*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019\u001a\u0012\u0010\u001a\u001a\u00020\u0007*\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0005\u001a\n\u0010\u001c\u001a\u00020\u0007*\u00020\u001d\u00a8\u0006\u001e"}, d2 = {"convert", "Lrx/Observable;", "T", "Lcom/kotlin/base/data/protocol/BaseResp;", "convertBoolean", "", "enable", "", "Landroid/widget/Button;", "et", "Landroid/widget/EditText;", "method", "Lkotlin/Function0;", "excute", "subscriber", "Lcom/kotlin/base/rx/BaseSubscriber;", "lifecycleProvider", "Lcom/trello/rxlifecycle/LifecycleProvider;", "loadUrl", "Landroid/widget/ImageView;", "url", "", "onClick", "Landroid/view/View;", "listener", "Landroid/view/View$OnClickListener;", "setVisible", "visible", "startLoading", "Lcom/kennyc/view/MultiStateView;", "BaseLibrary_debug"})
public final class CommonExtKt {
    
    public static final <T extends java.lang.Object>void excute(@org.jetbrains.annotations.NotNull()
    rx.Observable<T> $receiver, @org.jetbrains.annotations.NotNull()
    com.kotlin.base.rx.BaseSubscriber<T> subscriber, @org.jetbrains.annotations.NotNull()
    com.trello.rxlifecycle.LifecycleProvider<?> lifecycleProvider) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>rx.Observable<T> convert(@org.jetbrains.annotations.NotNull()
    rx.Observable<com.kotlin.base.data.protocol.BaseResp<T>> $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>rx.Observable<java.lang.Boolean> convertBoolean(@org.jetbrains.annotations.NotNull()
    rx.Observable<com.kotlin.base.data.protocol.BaseResp<T>> $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.view.View onClick(@org.jetbrains.annotations.NotNull()
    android.view.View $receiver, @org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener listener) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.view.View onClick(@org.jetbrains.annotations.NotNull()
    android.view.View $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> method) {
        return null;
    }
    
    public static final void enable(@org.jetbrains.annotations.NotNull()
    android.widget.Button $receiver, @org.jetbrains.annotations.NotNull()
    android.widget.EditText et, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.Boolean> method) {
    }
    
    public static final void loadUrl(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    public static final void startLoading(@org.jetbrains.annotations.NotNull()
    com.kennyc.view.MultiStateView $receiver) {
    }
    
    public static final void setVisible(@org.jetbrains.annotations.NotNull()
    android.view.View $receiver, boolean visible) {
    }
}