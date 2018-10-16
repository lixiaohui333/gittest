package com.kotlin.goods.presenter.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/kotlin/goods/presenter/view/GoodsDetailView;", "Lcom/kotlin/base/presenter/view/BaseView;", "onAddCartResult", "", "result", "", "onGetGoodsDetailResult", "Lcom/kotlin/goods/data/protocol/Goods;", "GoodsCenter_debug"})
public abstract interface GoodsDetailView extends com.kotlin.base.presenter.view.BaseView {
    
    public abstract void onGetGoodsDetailResult(@org.jetbrains.annotations.NotNull()
    com.kotlin.goods.data.protocol.Goods result);
    
    public abstract void onAddCartResult(int result);
}