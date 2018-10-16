package com.kotlin.message.service.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\nH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/kotlin/message/service/impl/MessageServiceImpl;", "Lcom/kotlin/message/service/MessageService;", "()V", "repository", "Lcom/kotlin/message/data/repository/MessageRepository;", "getRepository", "()Lcom/kotlin/message/data/repository/MessageRepository;", "setRepository", "(Lcom/kotlin/message/data/repository/MessageRepository;)V", "getMessageList", "Lrx/Observable;", "", "Lcom/kotlin/message/data/protocol/Message;", "MessageCenter_debug"})
public final class MessageServiceImpl implements com.kotlin.message.service.MessageService {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.kotlin.message.data.repository.MessageRepository repository;
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotlin.message.data.repository.MessageRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.kotlin.message.data.repository.MessageRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public rx.Observable<java.util.List<com.kotlin.message.data.protocol.Message>> getMessageList() {
        return null;
    }
    
    @javax.inject.Inject()
    public MessageServiceImpl() {
        super();
    }
}