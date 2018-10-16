package com.kotlin.base.rx;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u000fR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/kotlin/base/rx/BaseSubscriber;", "T", "Lrx/Subscriber;", "baseView", "Lcom/kotlin/base/presenter/view/BaseView;", "(Lcom/kotlin/base/presenter/view/BaseView;)V", "getBaseView", "()Lcom/kotlin/base/presenter/view/BaseView;", "onCompleted", "", "onError", "e", "", "onNext", "t", "(Ljava/lang/Object;)V", "BaseLibrary_debug"})
public class BaseSubscriber<T extends java.lang.Object> extends rx.Subscriber<T> {
    @org.jetbrains.annotations.NotNull()
    private final com.kotlin.base.presenter.view.BaseView baseView = null;
    
    @java.lang.Override()
    public void onCompleted() {
    }
    
    @java.lang.Override()
    public void onNext(T t) {
    }
    
    @java.lang.Override()
    public void onError(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable e) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotlin.base.presenter.view.BaseView getBaseView() {
        return null;
    }
    
    public BaseSubscriber(@org.jetbrains.annotations.NotNull()
    com.kotlin.base.presenter.view.BaseView baseView) {
        super();
    }
}