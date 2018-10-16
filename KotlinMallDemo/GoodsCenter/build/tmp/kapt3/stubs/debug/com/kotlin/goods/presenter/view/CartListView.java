package com.kotlin.goods.presenter.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/kotlin/goods/presenter/view/CartListView;", "Lcom/kotlin/base/presenter/view/BaseView;", "onDeleteCartListResult", "", "result", "", "onGetCartListResult", "", "Lcom/kotlin/goods/data/protocol/CartGoods;", "onSubmitCartListResult", "", "GoodsCenter_debug"})
public abstract interface CartListView extends com.kotlin.base.presenter.view.BaseView {
    
    public abstract void onGetCartListResult(@org.jetbrains.annotations.Nullable()
    java.util.List<com.kotlin.goods.data.protocol.CartGoods> result);
    
    public abstract void onDeleteCartListResult(boolean result);
    
    public abstract void onSubmitCartListResult(int result);
}