package com.kotlin.order.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/kotlin/order/common/OrderConstant;", "", "()V", "Companion", "OrderCenter_debug"})
public final class OrderConstant {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_ORDER_STATUS = "order_status";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_SHIP_ADDRESS = "ship_address";
    public static final int REQ_SELECT_ADDRESS = 1001;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_IS_SELECT_ADDRESS = "is_select_address";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_ADDRESS_IS_EDIT = "address_is_edit";
    public static final int OPT_ORDER_PAY = 1;
    public static final int OPT_ORDER_CONFIRM = 2;
    public static final int OPT_ORDER_CANCEL = 3;
    public static final com.kotlin.order.common.OrderConstant.Companion Companion = null;
    
    public OrderConstant() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/kotlin/order/common/OrderConstant$Companion;", "", "()V", "KEY_ADDRESS_IS_EDIT", "", "KEY_IS_SELECT_ADDRESS", "KEY_ORDER_STATUS", "KEY_SHIP_ADDRESS", "OPT_ORDER_CANCEL", "", "OPT_ORDER_CONFIRM", "OPT_ORDER_PAY", "REQ_SELECT_ADDRESS", "OrderCenter_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}