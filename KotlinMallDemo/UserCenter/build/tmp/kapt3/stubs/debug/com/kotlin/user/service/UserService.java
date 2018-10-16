package com.kotlin.user.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H&J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H&J&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H&J&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H&J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H&\u00a8\u0006\u0013"}, d2 = {"Lcom/kotlin/user/service/UserService;", "", "editUser", "Lrx/Observable;", "Lcom/kotlin/user/data/protocol/UserInfo;", "userIcon", "", "userName", "userGender", "userSign", "forgetPwd", "", "mobile", "verifyCode", "login", "pwd", "pushId", "register", "resetPwd", "UserCenter_debug"})
public abstract interface UserService {
    
    @org.jetbrains.annotations.NotNull()
    public abstract rx.Observable<java.lang.Boolean> register(@org.jetbrains.annotations.NotNull()
    java.lang.String mobile, @org.jetbrains.annotations.NotNull()
    java.lang.String pwd, @org.jetbrains.annotations.NotNull()
    java.lang.String verifyCode);
    
    @org.jetbrains.annotations.NotNull()
    public abstract rx.Observable<com.kotlin.user.data.protocol.UserInfo> login(@org.jetbrains.annotations.NotNull()
    java.lang.String mobile, @org.jetbrains.annotations.NotNull()
    java.lang.String pwd, @org.jetbrains.annotations.NotNull()
    java.lang.String pushId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract rx.Observable<java.lang.Boolean> forgetPwd(@org.jetbrains.annotations.NotNull()
    java.lang.String mobile, @org.jetbrains.annotations.NotNull()
    java.lang.String verifyCode);
    
    @org.jetbrains.annotations.NotNull()
    public abstract rx.Observable<java.lang.Boolean> resetPwd(@org.jetbrains.annotations.NotNull()
    java.lang.String mobile, @org.jetbrains.annotations.NotNull()
    java.lang.String pwd);
    
    @org.jetbrains.annotations.NotNull()
    public abstract rx.Observable<com.kotlin.user.data.protocol.UserInfo> editUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userIcon, @org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String userGender, @org.jetbrains.annotations.NotNull()
    java.lang.String userSign);
}