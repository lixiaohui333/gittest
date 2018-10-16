package com.kotlin.base.widgets;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\b\u0018\u00002\u00020\u0001:\u0001\u001aB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011J\u001f\u0010\u0013\u001a\u00020\u00112\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015\"\u00020\u0016\u00a2\u0006\u0002\u0010\u0017J\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u000fR\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/kotlin/base/widgets/VerifyButton;", "Landroid/widget/Button;", "mContext", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "countDown", "com/kotlin/base/widgets/VerifyButton$countDown$1", "Lcom/kotlin/base/widgets/VerifyButton$countDown$1;", "mCount", "", "mHandler", "Landroid/os/Handler;", "mOnVerifyBtnClick", "Lcom/kotlin/base/widgets/VerifyButton$OnVerifyBtnClick;", "removeRunable", "", "requestSendVerifyNumber", "resetCounter", "text", "", "", "([Ljava/lang/String;)V", "setOnVerifyBtnClick", "onVerifyBtnClick", "OnVerifyBtnClick", "BaseLibrary_debug"})
public final class VerifyButton extends android.widget.Button {
    private final android.os.Handler mHandler = null;
    private int mCount;
    private com.kotlin.base.widgets.VerifyButton.OnVerifyBtnClick mOnVerifyBtnClick;
    private final java.lang.Runnable countDown = null;
    private java.util.HashMap _$_findViewCache;
    
    public final void requestSendVerifyNumber() {
    }
    
    public final void removeRunable() {
    }
    
    public final void resetCounter(@org.jetbrains.annotations.NotNull()
    java.lang.String... text) {
    }
    
    public final void setOnVerifyBtnClick(@org.jetbrains.annotations.NotNull()
    com.kotlin.base.widgets.VerifyButton.OnVerifyBtnClick onVerifyBtnClick) {
    }
    
    public VerifyButton(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/kotlin/base/widgets/VerifyButton$OnVerifyBtnClick;", "", "onClick", "", "BaseLibrary_debug"})
    public static abstract interface OnVerifyBtnClick {
        
        public abstract void onClick();
    }
}