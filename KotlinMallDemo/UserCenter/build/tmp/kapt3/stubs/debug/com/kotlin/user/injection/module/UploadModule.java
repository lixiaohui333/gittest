package com.kotlin.user.injection.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/kotlin/user/injection/module/UploadModule;", "", "()V", "provideUploadService", "Lcom/kotlin/user/service/UploadService;", "uploadService", "Lcom/kotlin/user/service/impl/UploadServiceImpl;", "UserCenter_debug"})
@dagger.Module()
public final class UploadModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.kotlin.user.service.UploadService provideUploadService(@org.jetbrains.annotations.NotNull()
    com.kotlin.user.service.impl.UploadServiceImpl uploadService) {
        return null;
    }
    
    public UploadModule() {
        super();
    }
}