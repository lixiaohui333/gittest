package com.kotlin.goods.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/kotlin/goods/data/api/CategoryApi;", "", "getCategory", "Lrx/Observable;", "Lcom/kotlin/base/data/protocol/BaseResp;", "", "Lcom/kotlin/goods/data/protocol/Category;", "req", "Lcom/kotlin/goods/data/protocol/GetCategoryReq;", "GoodsCenter_debug"})
public abstract interface CategoryApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "category/getCategory")
    public abstract rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.util.List<com.kotlin.goods.data.protocol.Category>>> getCategory(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.kotlin.goods.data.protocol.GetCategoryReq req);
}