package com.kotlin.message.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00040\u0003H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/kotlin/message/data/api/MessageApi;", "", "getMessageList", "Lrx/Observable;", "Lcom/kotlin/base/data/protocol/BaseResp;", "", "Lcom/kotlin/message/data/protocol/Message;", "MessageCenter_debug"})
public abstract interface MessageApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "msg/getList")
    public abstract rx.Observable<com.kotlin.base.data.protocol.BaseResp<java.util.List<com.kotlin.message.data.protocol.Message>>> getMessageList();
}