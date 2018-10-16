package com.kotlin.user.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\nH\'J\u001e\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\fH\'J\u001e\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u000eH\'J\u001e\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0010H\'\u00a8\u0006\u0011"}, d2 = {"Lcom/kotlin/user/data/api/UserApi;", "", "editUser", "Lrx/Observable;", "Lcom/kotlin/base/data/protocol/BaseResp;", "Lcom/kotlin/user/data/protocol/UserInfo;", "req", "Lcom/kotlin/user/data/protocol/EditUserReq;", "forgetPwd", "", "Lcom/kotlin/user/data/protocol/ForgetPwdReq;", "login", "Lcom/kotlin/user/data/protocol/LoginReq;", "register", "Lcom/kotlin/user/data/protocol/RegisterReq;", "resetPwd", "Lcom/kotlin/user/data/protocol/ResetPwdReq;", "UserCenter_debug"})
public abstract interface UserApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "userCenter/register")
    public abstract rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.lang.String>> register(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.kotlin.user.data.protocol.RegisterReq req);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "userCenter/login")
    public abstract rx.Observable<com.kotlin.base.data.protocol.BaseResp<com.kotlin.user.data.protocol.UserInfo>> login(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.kotlin.user.data.protocol.LoginReq req);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "userCenter/forgetPwd")
    public abstract rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.lang.String>> forgetPwd(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.kotlin.user.data.protocol.ForgetPwdReq req);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "userCenter/resetPwd")
    public abstract rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.lang.String>> resetPwd(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.kotlin.user.data.protocol.ResetPwdReq req);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "userCenter/editUser")
    public abstract rx.Observable<com.kotlin.base.data.protocol.BaseResp<com.kotlin.user.data.protocol.UserInfo>> editUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.kotlin.user.data.protocol.EditUserReq req);
}