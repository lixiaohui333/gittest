package com.kotlin.user.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0003J&\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013J\u0006\u0010\u0017\u001a\u00020\u0011R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0018"}, d2 = {"Lcom/kotlin/user/presenter/UserInfoPresenter;", "Lcom/kotlin/base/presenter/BasePresenter;", "Lcom/kotlin/user/presenter/view/UserInfoView;", "()V", "uploadService", "Lcom/kotlin/user/service/UploadService;", "getUploadService", "()Lcom/kotlin/user/service/UploadService;", "setUploadService", "(Lcom/kotlin/user/service/UploadService;)V", "userService", "Lcom/kotlin/user/service/UserService;", "getUserService", "()Lcom/kotlin/user/service/UserService;", "setUserService", "(Lcom/kotlin/user/service/UserService;)V", "editUser", "", "userIcon", "", "userName", "userGender", "userSign", "getUploadToken", "UserCenter_debug"})
public final class UserInfoPresenter extends com.kotlin.base.presenter.BasePresenter<com.kotlin.user.presenter.view.UserInfoView> {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.kotlin.user.service.UserService userService;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.kotlin.user.service.UploadService uploadService;
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotlin.user.service.UserService getUserService() {
        return null;
    }
    
    public final void setUserService(@org.jetbrains.annotations.NotNull()
    com.kotlin.user.service.UserService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotlin.user.service.UploadService getUploadService() {
        return null;
    }
    
    public final void setUploadService(@org.jetbrains.annotations.NotNull()
    com.kotlin.user.service.UploadService p0) {
    }
    
    public final void getUploadToken() {
    }
    
    public final void editUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userIcon, @org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String userGender, @org.jetbrains.annotations.NotNull()
    java.lang.String userSign) {
    }
    
    @javax.inject.Inject()
    public UserInfoPresenter() {
        super();
    }
}