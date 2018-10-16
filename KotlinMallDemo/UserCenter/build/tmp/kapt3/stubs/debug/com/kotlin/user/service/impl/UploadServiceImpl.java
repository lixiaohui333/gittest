package com.kotlin.user.service.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/kotlin/user/service/impl/UploadServiceImpl;", "Lcom/kotlin/user/service/UploadService;", "()V", "repository", "Lcom/kotlin/user/data/respository/UploadRepository;", "getRepository", "()Lcom/kotlin/user/data/respository/UploadRepository;", "setRepository", "(Lcom/kotlin/user/data/respository/UploadRepository;)V", "getUploadToken", "Lrx/Observable;", "", "UserCenter_debug"})
public final class UploadServiceImpl implements com.kotlin.user.service.UploadService {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.kotlin.user.data.respository.UploadRepository repository;
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotlin.user.data.respository.UploadRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.kotlin.user.data.respository.UploadRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public rx.Observable<java.lang.String> getUploadToken() {
        return null;
    }
    
    @javax.inject.Inject()
    public UploadServiceImpl() {
        super();
    }
}