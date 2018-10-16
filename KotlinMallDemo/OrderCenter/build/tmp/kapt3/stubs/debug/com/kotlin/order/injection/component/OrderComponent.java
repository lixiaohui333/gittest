package com.kotlin.order.injection.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/kotlin/order/injection/component/OrderComponent;", "", "inject", "", "activity", "Lcom/kotlin/order/ui/activity/OrderConfirmActivity;", "Lcom/kotlin/order/ui/activity/OrderDetailActivity;", "fragment", "Lcom/kotlin/order/ui/fragment/OrderFragment;", "OrderCenter_debug"})
@dagger.Component(dependencies = {com.kotlin.base.injection.component.ActivityComponent.class}, modules = {com.kotlin.order.injection.module.OrderModule.class})
@com.kotlin.base.injection.PerComponentScope()
public abstract interface OrderComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.kotlin.order.ui.activity.OrderConfirmActivity activity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.kotlin.order.ui.fragment.OrderFragment fragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.kotlin.order.ui.activity.OrderDetailActivity activity);
}