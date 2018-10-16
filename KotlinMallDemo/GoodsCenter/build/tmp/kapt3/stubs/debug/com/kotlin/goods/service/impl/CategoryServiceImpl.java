package com.kotlin.goods.service.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lcom/kotlin/goods/service/impl/CategoryServiceImpl;", "Lcom/kotlin/goods/service/CategoryService;", "()V", "repository", "Lcom/kotlin/goods/data/repository/CategoryRepository;", "getRepository", "()Lcom/kotlin/goods/data/repository/CategoryRepository;", "setRepository", "(Lcom/kotlin/goods/data/repository/CategoryRepository;)V", "getCategory", "Lrx/Observable;", "", "Lcom/kotlin/goods/data/protocol/Category;", "parentId", "", "GoodsCenter_debug"})
public final class CategoryServiceImpl implements com.kotlin.goods.service.CategoryService {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.kotlin.goods.data.repository.CategoryRepository repository;
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotlin.goods.data.repository.CategoryRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.kotlin.goods.data.repository.CategoryRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public rx.Observable<java.util.List<com.kotlin.goods.data.protocol.Category>> getCategory(int parentId) {
        return null;
    }
    
    @javax.inject.Inject()
    public CategoryServiceImpl() {
        super();
    }
}