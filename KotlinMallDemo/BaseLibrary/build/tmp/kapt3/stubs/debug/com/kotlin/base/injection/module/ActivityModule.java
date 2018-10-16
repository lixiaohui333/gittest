package com.kotlin.base.injection.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/kotlin/base/injection/module/ActivityModule;", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "provideActivity", "BaseLibrary_debug"})
@dagger.Module()
public final class ActivityModule {
    private final android.app.Activity activity = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @com.kotlin.base.injection.ActivityScope()
    public final android.app.Activity provideActivity() {
        return null;
    }
    
    public ActivityModule(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        super();
    }
}