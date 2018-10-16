package com.kotlin.goods.data.protocol;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0015J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0006H\u00c6\u0003J\t\u0010*\u001a\u00020\u0006H\u00c6\u0003J\t\u0010+\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0006H\u00c6\u0003J\t\u00100\u001a\u00020\u0006H\u00c6\u0003J\t\u00101\u001a\u00020\tH\u00c6\u0003J\t\u00102\u001a\u00020\u0006H\u00c6\u0003J\t\u00103\u001a\u00020\u0006H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\u009b\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0003H\u00c6\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010:\u001a\u00020\u0003H\u00d6\u0001J\t\u0010;\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\n\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0017\u00a8\u0006<"}, d2 = {"Lcom/kotlin/goods/data/protocol/Goods;", "", "id", "", "categoryId", "goodsDesc", "", "goodsDefaultIcon", "goodsDefaultPrice", "", "goodsDetailOne", "goodsDetailTwo", "goodsSalesCount", "goodsStockCount", "goodsCode", "goodsDefaultSku", "goodsBanner", "goodsSku", "", "Lcom/kotlin/goods/data/protocol/GoodsSku;", "maxPage", "(IILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V", "getCategoryId", "()I", "getGoodsBanner", "()Ljava/lang/String;", "getGoodsCode", "getGoodsDefaultIcon", "getGoodsDefaultPrice", "()J", "getGoodsDefaultSku", "getGoodsDesc", "getGoodsDetailOne", "getGoodsDetailTwo", "getGoodsSalesCount", "getGoodsSku", "()Ljava/util/List;", "getGoodsStockCount", "getId", "getMaxPage", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "GoodsCenter_debug"})
public final class Goods {
    private final int id = 0;
    private final int categoryId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String goodsDesc = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String goodsDefaultIcon = null;
    private final long goodsDefaultPrice = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String goodsDetailOne = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String goodsDetailTwo = null;
    private final int goodsSalesCount = 0;
    private final int goodsStockCount = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String goodsCode = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String goodsDefaultSku = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String goodsBanner = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.kotlin.goods.data.protocol.GoodsSku> goodsSku = null;
    private final int maxPage = 0;
    
    public final int getId() {
        return 0;
    }
    
    public final int getCategoryId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGoodsDesc() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGoodsDefaultIcon() {
        return null;
    }
    
    public final long getGoodsDefaultPrice() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGoodsDetailOne() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGoodsDetailTwo() {
        return null;
    }
    
    public final int getGoodsSalesCount() {
        return 0;
    }
    
    public final int getGoodsStockCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGoodsCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGoodsDefaultSku() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGoodsBanner() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.kotlin.goods.data.protocol.GoodsSku> getGoodsSku() {
        return null;
    }
    
    public final int getMaxPage() {
        return 0;
    }
    
    public Goods(int id, int categoryId, @org.jetbrains.annotations.NotNull()
    java.lang.String goodsDesc, @org.jetbrains.annotations.NotNull()
    java.lang.String goodsDefaultIcon, long goodsDefaultPrice, @org.jetbrains.annotations.NotNull()
    java.lang.String goodsDetailOne, @org.jetbrains.annotations.NotNull()
    java.lang.String goodsDetailTwo, int goodsSalesCount, int goodsStockCount, @org.jetbrains.annotations.NotNull()
    java.lang.String goodsCode, @org.jetbrains.annotations.NotNull()
    java.lang.String goodsDefaultSku, @org.jetbrains.annotations.NotNull()
    java.lang.String goodsBanner, @org.jetbrains.annotations.NotNull()
    java.util.List<com.kotlin.goods.data.protocol.GoodsSku> goodsSku, int maxPage) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    public final long component5() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int component9() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.kotlin.goods.data.protocol.GoodsSku> component13() {
        return null;
    }
    
    public final int component14() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kotlin.goods.data.protocol.Goods copy(int id, int categoryId, @org.jetbrains.annotations.NotNull()
    java.lang.String goodsDesc, @org.jetbrains.annotations.NotNull()
    java.lang.String goodsDefaultIcon, long goodsDefaultPrice, @org.jetbrains.annotations.NotNull()
    java.lang.String goodsDetailOne, @org.jetbrains.annotations.NotNull()
    java.lang.String goodsDetailTwo, int goodsSalesCount, int goodsStockCount, @org.jetbrains.annotations.NotNull()
    java.lang.String goodsCode, @org.jetbrains.annotations.NotNull()
    java.lang.String goodsDefaultSku, @org.jetbrains.annotations.NotNull()
    java.lang.String goodsBanner, @org.jetbrains.annotations.NotNull()
    java.util.List<com.kotlin.goods.data.protocol.GoodsSku> goodsSku, int maxPage) {
        return null;
    }
    
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(java.lang.Object p0) {
        return false;
    }
}