package com.kotlin.user.ui.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0014J\u0012\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0006H\u0016J\u0012\u0010\u001e\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001fH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/kotlin/user/ui/activity/UserInfoActivity;", "Lcom/kotlin/base/ui/activity/BaseTakePhotoActivity;", "Lcom/kotlin/user/presenter/UserInfoPresenter;", "Lcom/kotlin/user/presenter/view/UserInfoView;", "()V", "mLocalFileUrl", "", "mRemoteFileUrl", "mUploadManager", "Lcom/qiniu/android/storage/UploadManager;", "getMUploadManager", "()Lcom/qiniu/android/storage/UploadManager;", "mUploadManager$delegate", "Lkotlin/Lazy;", "mUserGender", "mUserIcon", "mUserMobile", "mUserName", "mUserSign", "initData", "", "initView", "injectComponent", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onEditUserResult", "result", "Lcom/kotlin/user/data/protocol/UserInfo;", "onGetUploadTokenResult", "takeSuccess", "Lcom/jph/takephoto/model/TResult;", "UserCenter_debug"})
public final class UserInfoActivity extends com.kotlin.base.ui.activity.BaseTakePhotoActivity<com.kotlin.user.presenter.UserInfoPresenter> implements com.kotlin.user.presenter.view.UserInfoView {
    private final kotlin.Lazy mUploadManager$delegate = null;
    private java.lang.String mLocalFileUrl;
    private java.lang.String mRemoteFileUrl;
    private java.lang.String mUserIcon;
    private java.lang.String mUserName;
    private java.lang.String mUserMobile;
    private java.lang.String mUserGender;
    private java.lang.String mUserSign;
    private java.util.HashMap _$_findViewCache;
    
    private final com.qiniu.android.storage.UploadManager getMUploadManager() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initView() {
    }
    
    private final void initData() {
    }
    
    @java.lang.Override()
    protected void injectComponent() {
    }
    
    @java.lang.Override()
    public void takeSuccess(@org.jetbrains.annotations.Nullable()
    com.jph.takephoto.model.TResult result) {
    }
    
    @java.lang.Override()
    public void onGetUploadTokenResult(@org.jetbrains.annotations.NotNull()
    java.lang.String result) {
    }
    
    @java.lang.Override()
    public void onEditUserResult(@org.jetbrains.annotations.NotNull()
    com.kotlin.user.data.protocol.UserInfo result) {
    }
    
    public UserInfoActivity() {
        super();
    }
}