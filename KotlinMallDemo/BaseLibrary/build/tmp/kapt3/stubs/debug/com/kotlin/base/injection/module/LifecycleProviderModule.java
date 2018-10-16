package com.kotlin.base.injection.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0007R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/kotlin/base/injection/module/LifecycleProviderModule;", "", "lifecycleProvider", "Lcom/trello/rxlifecycle/LifecycleProvider;", "(Lcom/trello/rxlifecycle/LifecycleProvider;)V", "provideLifecycleProvider", "BaseLibrary_debug"})
@dagger.Module()
public final class LifecycleProviderModule {
    private final com.trello.rxlifecycle.LifecycleProvider<?> lifecycleProvider = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.trello.rxlifecycle.LifecycleProvider<?> provideLifecycleProvider() {
        return null;
    }
    
    public LifecycleProviderModule(@org.jetbrains.annotations.NotNull()
    com.trello.rxlifecycle.LifecycleProvider<?> lifecycleProvider) {
        super();
    }
}