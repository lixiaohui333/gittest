package com.kotlin.user.ui.activity;

import java.lang.System;

@com.alibaba.android.arouter.facade.annotation.Route(path = "/userCenter/login")
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\tH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/kotlin/user/ui/activity/LoginActivity;", "Lcom/kotlin/base/ui/activity/BaseMvpActivity;", "Lcom/kotlin/user/presenter/LoginPresenter;", "Lcom/kotlin/user/presenter/view/LoginView;", "Landroid/view/View$OnClickListener;", "()V", "mPushProvider", "Lcom/kotlin/provider/PushProvider;", "initView", "", "injectComponent", "isBtnEnable", "", "onClick", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onLoginResult", "result", "Lcom/kotlin/user/data/protocol/UserInfo;", "UserCenter_debug"})
public final class LoginActivity extends com.kotlin.base.ui.activity.BaseMvpActivity<com.kotlin.user.presenter.LoginPresenter> implements com.kotlin.user.presenter.view.LoginView, android.view.View.OnClickListener {
    @org.jetbrains.annotations.Nullable()
    @com.alibaba.android.arouter.facade.annotation.Autowired(name = "/messageCenter/push")
    public com.kotlin.provider.PushProvider mPushProvider;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initView() {
    }
    
    @java.lang.Override()
    protected void injectComponent() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final boolean isBtnEnable() {
        return false;
    }
    
    @java.lang.Override()
    public void onLoginResult(@org.jetbrains.annotations.NotNull()
    com.kotlin.user.data.protocol.UserInfo result) {
    }
    
    public LoginActivity() {
        super();
    }
}