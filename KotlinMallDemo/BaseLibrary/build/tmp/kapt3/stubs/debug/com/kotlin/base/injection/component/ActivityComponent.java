package com.kotlin.base.injection.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\f\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/kotlin/base/injection/component/ActivityComponent;", "", "activity", "Landroid/app/Activity;", "context", "Landroid/content/Context;", "lifecycleProvider", "Lcom/trello/rxlifecycle/LifecycleProvider;", "BaseLibrary_debug"})
@dagger.Component(dependencies = {com.kotlin.base.injection.component.AppComponent.class}, modules = {com.kotlin.base.injection.module.ActivityModule.class, com.kotlin.base.injection.module.LifecycleProviderModule.class})
@com.kotlin.base.injection.ActivityScope()
public abstract interface ActivityComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.app.Activity activity();
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context context();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.trello.rxlifecycle.LifecycleProvider<?> lifecycleProvider();
}