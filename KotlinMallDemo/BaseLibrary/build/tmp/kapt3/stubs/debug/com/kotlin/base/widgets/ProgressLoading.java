package com.kotlin.base.widgets;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\b\u00a8\u0006\u000b"}, d2 = {"Lcom/kotlin/base/widgets/ProgressLoading;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "theme", "", "(Landroid/content/Context;I)V", "hideLoading", "", "showLoading", "Companion", "BaseLibrary_debug"})
public final class ProgressLoading extends android.app.Dialog {
    private static com.kotlin.base.widgets.ProgressLoading mDialog;
    private static android.graphics.drawable.AnimationDrawable animDrawable;
    public static final com.kotlin.base.widgets.ProgressLoading.Companion Companion = null;
    
    public final void showLoading() {
    }
    
    public final void hideLoading() {
    }
    
    private ProgressLoading(android.content.Context context, int theme) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/kotlin/base/widgets/ProgressLoading$Companion;", "", "()V", "animDrawable", "Landroid/graphics/drawable/AnimationDrawable;", "mDialog", "Lcom/kotlin/base/widgets/ProgressLoading;", "create", "context", "Landroid/content/Context;", "BaseLibrary_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.kotlin.base.widgets.ProgressLoading create(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}