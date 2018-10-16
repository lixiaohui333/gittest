package com.kotlin.order.injection.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/kotlin/order/injection/module/OrderModule;", "", "()V", "provideOrderservice", "Lcom/kotlin/order/service/OrderService;", "orderService", "Lcom/kotlin/order/service/impl/OrderServiceImpl;", "OrderCenter_debug"})
@dagger.Module()
public final class OrderModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.kotlin.order.service.OrderService provideOrderservice(@org.jetbrains.annotations.NotNull()
    com.kotlin.order.service.impl.OrderServiceImpl orderService) {
        return null;
    }
    
    public OrderModule() {
        super();
    }
}