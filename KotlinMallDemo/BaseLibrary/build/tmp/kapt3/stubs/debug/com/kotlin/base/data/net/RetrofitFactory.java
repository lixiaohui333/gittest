package com.kotlin.base.data.net;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/kotlin/base/data/net/RetrofitFactory;", "", "()V", "interceptor", "Lokhttp3/Interceptor;", "retrofit", "Lretrofit2/Retrofit;", "create", "T", "service", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "initClient", "Lokhttp3/OkHttpClient;", "initLogInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "Companion", "BaseLibrary_debug"})
public final class RetrofitFactory {
    private final okhttp3.Interceptor interceptor = null;
    private final retrofit2.Retrofit retrofit = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy instance$delegate = null;
    public static final com.kotlin.base.data.net.RetrofitFactory.Companion Companion = null;
    
    private final okhttp3.OkHttpClient initClient() {
        return null;
    }
    
    private final okhttp3.logging.HttpLoggingInterceptor initLogInterceptor() {
        return null;
    }
    
    public final <T extends java.lang.Object>T create(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> service) {
        return null;
    }
    
    private RetrofitFactory() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/kotlin/base/data/net/RetrofitFactory$Companion;", "", "()V", "instance", "Lcom/kotlin/base/data/net/RetrofitFactory;", "getInstance", "()Lcom/kotlin/base/data/net/RetrofitFactory;", "instance$delegate", "Lkotlin/Lazy;", "BaseLibrary_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.kotlin.base.data.net.RetrofitFactory getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}