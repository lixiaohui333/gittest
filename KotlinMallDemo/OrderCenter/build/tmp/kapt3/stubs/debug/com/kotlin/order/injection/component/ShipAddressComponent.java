package com.kotlin.order.injection.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/kotlin/order/injection/component/ShipAddressComponent;", "", "inject", "", "activity", "Lcom/kotlin/order/ui/activity/ShipAddressActivity;", "Lcom/kotlin/order/ui/activity/ShipAddressEditActivity;", "OrderCenter_debug"})
@dagger.Component(dependencies = {com.kotlin.base.injection.component.ActivityComponent.class}, modules = {com.kotlin.order.injection.module.ShipAddressModule.class})
@com.kotlin.base.injection.PerComponentScope()
public abstract interface ShipAddressComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.kotlin.order.ui.activity.ShipAddressEditActivity activity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.kotlin.order.ui.activity.ShipAddressActivity activity);
}