package com.kotlin.base.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/kotlin/base/common/BaseApplication;", "Landroid/app/Application;", "()V", "appComponent", "Lcom/kotlin/base/injection/component/AppComponent;", "getAppComponent", "()Lcom/kotlin/base/injection/component/AppComponent;", "setAppComponent", "(Lcom/kotlin/base/injection/component/AppComponent;)V", "initAppInjection", "", "onCreate", "Companion", "BaseLibrary_debug"})
public class BaseApplication extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    public com.kotlin.base.injection.component.AppComponent appComponent;
    @org.jetbrains.annotations.NotNull()
    public static android.content.Context context;
    public static final com.kotlin.base.common.BaseApplication.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotlin.base.injection.component.AppComponent getAppComponent() {
        return null;
    }
    
    public final void setAppComponent(@org.jetbrains.annotations.NotNull()
    com.kotlin.base.injection.component.AppComponent p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final void initAppInjection() {
    }
    
    public BaseApplication() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/kotlin/base/common/BaseApplication$Companion;", "", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "BaseLibrary_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        public final void setContext(@org.jetbrains.annotations.NotNull()
        android.content.Context p0) {
        }
        
        private Companion() {
            super();
        }
    }
}