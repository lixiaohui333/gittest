package com.kotlin.message.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\f"}, d2 = {"Lcom/kotlin/message/presenter/MessagePresenter;", "Lcom/kotlin/base/presenter/BasePresenter;", "Lcom/kotlin/message/presenter/view/MessageView;", "()V", "messageService", "Lcom/kotlin/message/service/MessageService;", "getMessageService", "()Lcom/kotlin/message/service/MessageService;", "setMessageService", "(Lcom/kotlin/message/service/MessageService;)V", "getMessageList", "", "MessageCenter_debug"})
public final class MessagePresenter extends com.kotlin.base.presenter.BasePresenter<com.kotlin.message.presenter.view.MessageView> {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.kotlin.message.service.MessageService messageService;
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotlin.message.service.MessageService getMessageService() {
        return null;
    }
    
    public final void setMessageService(@org.jetbrains.annotations.NotNull()
    com.kotlin.message.service.MessageService p0) {
    }
    
    public final void getMessageList() {
    }
    
    @javax.inject.Inject()
    public MessagePresenter() {
        super();
    }
}