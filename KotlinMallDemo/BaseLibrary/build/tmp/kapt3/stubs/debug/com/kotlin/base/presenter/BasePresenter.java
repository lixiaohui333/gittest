package com.kotlin.base.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0017\u001a\u00020\u0018R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0019"}, d2 = {"Lcom/kotlin/base/presenter/BasePresenter;", "T", "Lcom/kotlin/base/presenter/view/BaseView;", "", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "lifecycleProvider", "Lcom/trello/rxlifecycle/LifecycleProvider;", "getLifecycleProvider", "()Lcom/trello/rxlifecycle/LifecycleProvider;", "setLifecycleProvider", "(Lcom/trello/rxlifecycle/LifecycleProvider;)V", "mView", "getMView", "()Lcom/kotlin/base/presenter/view/BaseView;", "setMView", "(Lcom/kotlin/base/presenter/view/BaseView;)V", "Lcom/kotlin/base/presenter/view/BaseView;", "checkNetWork", "", "BaseLibrary_debug"})
public class BasePresenter<T extends com.kotlin.base.presenter.view.BaseView> {
    @org.jetbrains.annotations.NotNull()
    public T mView;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.trello.rxlifecycle.LifecycleProvider<?> lifecycleProvider;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public android.content.Context context;
    
    @org.jetbrains.annotations.NotNull()
    public final T getMView() {
        return null;
    }
    
    public final void setMView(@org.jetbrains.annotations.NotNull()
    T p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.trello.rxlifecycle.LifecycleProvider<?> getLifecycleProvider() {
        return null;
    }
    
    public final void setLifecycleProvider(@org.jetbrains.annotations.NotNull()
    com.trello.rxlifecycle.LifecycleProvider<?> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    public final boolean checkNetWork() {
        return false;
    }
    
    public BasePresenter() {
        super();
    }
}