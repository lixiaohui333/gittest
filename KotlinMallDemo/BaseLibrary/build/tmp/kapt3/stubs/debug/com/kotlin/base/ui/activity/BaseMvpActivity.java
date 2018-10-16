package com.kotlin.base.ui.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0015H$J\u0012\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0015H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u000e\u001a\u00028\u00008\u0006@\u0006X\u0087.\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001f"}, d2 = {"Lcom/kotlin/base/ui/activity/BaseMvpActivity;", "T", "Lcom/kotlin/base/presenter/BasePresenter;", "Lcom/kotlin/base/ui/activity/BaseActivity;", "Lcom/kotlin/base/presenter/view/BaseView;", "()V", "mActivityComponent", "Lcom/kotlin/base/injection/component/ActivityComponent;", "getMActivityComponent", "()Lcom/kotlin/base/injection/component/ActivityComponent;", "setMActivityComponent", "(Lcom/kotlin/base/injection/component/ActivityComponent;)V", "mLoadingDialog", "Lcom/kotlin/base/widgets/ProgressLoading;", "mPresenter", "getMPresenter", "()Lcom/kotlin/base/presenter/BasePresenter;", "setMPresenter", "(Lcom/kotlin/base/presenter/BasePresenter;)V", "Lcom/kotlin/base/presenter/BasePresenter;", "hideLoading", "", "initActivityInjection", "injectComponent", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onError", "text", "", "showLoading", "BaseLibrary_debug"})
public abstract class BaseMvpActivity<T extends com.kotlin.base.presenter.BasePresenter<?>> extends com.kotlin.base.ui.activity.BaseActivity implements com.kotlin.base.presenter.view.BaseView {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public T mPresenter;
    @org.jetbrains.annotations.NotNull()
    public com.kotlin.base.injection.component.ActivityComponent mActivityComponent;
    private com.kotlin.base.widgets.ProgressLoading mLoadingDialog;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final T getMPresenter() {
        return null;
    }
    
    public final void setMPresenter(@org.jetbrains.annotations.NotNull()
    T p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotlin.base.injection.component.ActivityComponent getMActivityComponent() {
        return null;
    }
    
    public final void setMActivityComponent(@org.jetbrains.annotations.NotNull()
    com.kotlin.base.injection.component.ActivityComponent p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    protected abstract void injectComponent();
    
    private final void initActivityInjection() {
    }
    
    @java.lang.Override()
    public void showLoading() {
    }
    
    @java.lang.Override()
    public void hideLoading() {
    }
    
    @java.lang.Override()
    public void onError(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public BaseMvpActivity() {
        super();
    }
}