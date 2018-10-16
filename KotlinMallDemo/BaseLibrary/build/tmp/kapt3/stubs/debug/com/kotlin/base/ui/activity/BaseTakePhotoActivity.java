package com.kotlin.base.ui.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u001aH\u0002J\b\u0010\u001d\u001a\u00020\u001aH$J\"\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\u0012\u0010$\u001a\u00020\u001a2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\u0010\u0010\'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u001aH\u0004J\b\u0010+\u001a\u00020\u001aH\u0016J\b\u0010,\u001a\u00020\u001aH\u0016J\u001c\u0010-\u001a\u00020\u001a2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u00010)H\u0016J\u0012\u00101\u001a\u00020\u001a2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u000f\u001a\u00028\u00008\u0006@\u0006X\u0087.\u00a2\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/kotlin/base/ui/activity/BaseTakePhotoActivity;", "T", "Lcom/kotlin/base/presenter/BasePresenter;", "Lcom/kotlin/base/ui/activity/BaseActivity;", "Lcom/kotlin/base/presenter/view/BaseView;", "Lcom/jph/takephoto/app/TakePhoto$TakeResultListener;", "()V", "mActivityComponent", "Lcom/kotlin/base/injection/component/ActivityComponent;", "getMActivityComponent", "()Lcom/kotlin/base/injection/component/ActivityComponent;", "setMActivityComponent", "(Lcom/kotlin/base/injection/component/ActivityComponent;)V", "mLoadingDialog", "Lcom/kotlin/base/widgets/ProgressLoading;", "mPresenter", "getMPresenter", "()Lcom/kotlin/base/presenter/BasePresenter;", "setMPresenter", "(Lcom/kotlin/base/presenter/BasePresenter;)V", "Lcom/kotlin/base/presenter/BasePresenter;", "mTakePhoto", "Lcom/jph/takephoto/app/TakePhoto;", "mTempFile", "Ljava/io/File;", "createTempFile", "", "hideLoading", "initActivityInjection", "injectComponent", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onError", "text", "", "showAlertView", "showLoading", "takeCancel", "takeFail", "result", "Lcom/jph/takephoto/model/TResult;", "msg", "takeSuccess", "BaseLibrary_debug"})
public abstract class BaseTakePhotoActivity<T extends com.kotlin.base.presenter.BasePresenter<?>> extends com.kotlin.base.ui.activity.BaseActivity implements com.kotlin.base.presenter.view.BaseView, com.jph.takephoto.app.TakePhoto.TakeResultListener {
    private com.jph.takephoto.app.TakePhoto mTakePhoto;
    private java.io.File mTempFile;
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
    
    protected final void showAlertView() {
    }
    
    @java.lang.Override()
    public void takeSuccess(@org.jetbrains.annotations.Nullable()
    com.jph.takephoto.model.TResult result) {
    }
    
    @java.lang.Override()
    public void takeCancel() {
    }
    
    @java.lang.Override()
    public void takeFail(@org.jetbrains.annotations.Nullable()
    com.jph.takephoto.model.TResult result, @org.jetbrains.annotations.Nullable()
    java.lang.String msg) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public final void createTempFile() {
    }
    
    public BaseTakePhotoActivity() {
        super();
    }
}