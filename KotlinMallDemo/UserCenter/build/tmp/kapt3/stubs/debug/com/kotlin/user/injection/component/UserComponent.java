package com.kotlin.user.injection.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/kotlin/user/injection/component/UserComponent;", "", "inject", "", "activity", "Lcom/kotlin/user/ui/activity/ForgetPwdActivity;", "Lcom/kotlin/user/ui/activity/LoginActivity;", "Lcom/kotlin/user/ui/activity/RegisterActivity;", "Lcom/kotlin/user/ui/activity/ResetPwdActivity;", "Lcom/kotlin/user/ui/activity/UserInfoActivity;", "UserCenter_debug"})
@dagger.Component(dependencies = {com.kotlin.base.injection.component.ActivityComponent.class}, modules = {com.kotlin.user.injection.module.UserModule.class, com.kotlin.user.injection.module.UploadModule.class})
@com.kotlin.base.injection.PerComponentScope()
public abstract interface UserComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.kotlin.user.ui.activity.RegisterActivity activity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.kotlin.user.ui.activity.LoginActivity activity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.kotlin.user.ui.activity.ForgetPwdActivity activity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.kotlin.user.ui.activity.ResetPwdActivity activity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.kotlin.user.ui.activity.UserInfoActivity activity);
}