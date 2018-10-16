package com.kotlin.message.provider;

import java.lang.System;

@com.alibaba.android.arouter.facade.annotation.Route(path = "/messageCenter/push")
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/kotlin/message/provider/PushProviderImpl;", "Lcom/kotlin/provider/PushProvider;", "()V", "mContext", "Landroid/content/Context;", "getPushId", "", "init", "", "context", "MessageCenter_debug"})
public final class PushProviderImpl implements com.kotlin.provider.PushProvider {
    private android.content.Context mContext;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getPushId() {
        return null;
    }
    
    @java.lang.Override()
    public void init(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
    }
    
    public PushProviderImpl() {
        super();
    }
}