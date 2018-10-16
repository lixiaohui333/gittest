package com.kotlin.user.data.respository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bJ\"\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bJ*\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bJ*\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bJ\"\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b\u00a8\u0006\u0014"}, d2 = {"Lcom/kotlin/user/data/respository/UserRepository;", "", "()V", "editUser", "Lrx/Observable;", "Lcom/kotlin/base/data/protocol/BaseResp;", "Lcom/kotlin/user/data/protocol/UserInfo;", "userIcon", "", "userName", "userGender", "userSign", "forgetPwd", "mobile", "verifyCode", "login", "pwd", "pushId", "register", "resetPwd", "UserCenter_debug"})
public final class UserRepository {
    
    @org.jetbrains.annotations.NotNull()
    public final rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.lang.String>> register(@org.jetbrains.annotations.NotNull()
    java.lang.String mobile, @org.jetbrains.annotations.NotNull()
    java.lang.String pwd, @org.jetbrains.annotations.NotNull()
    java.lang.String verifyCode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final rx.Observable<com.kotlin.base.data.protocol.BaseResp<com.kotlin.user.data.protocol.UserInfo>> login(@org.jetbrains.annotations.NotNull()
    java.lang.String mobile, @org.jetbrains.annotations.NotNull()
    java.lang.String pwd, @org.jetbrains.annotations.NotNull()
    java.lang.String pushId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.lang.String>> forgetPwd(@org.jetbrains.annotations.NotNull()
    java.lang.String mobile, @org.jetbrains.annotations.NotNull()
    java.lang.String verifyCode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.lang.String>> resetPwd(@org.jetbrains.annotations.NotNull()
    java.lang.String mobile, @org.jetbrains.annotations.NotNull()
    java.lang.String pwd) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final rx.Observable<com.kotlin.base.data.protocol.BaseResp<com.kotlin.user.data.protocol.UserInfo>> editUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userIcon, @org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String userGender, @org.jetbrains.annotations.NotNull()
    java.lang.String userSign) {
        return null;
    }
    
    @javax.inject.Inject()
    public UserRepository() {
        super();
    }
}