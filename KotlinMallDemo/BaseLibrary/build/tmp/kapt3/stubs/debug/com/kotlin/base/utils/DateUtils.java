package com.kotlin.base.utils;

import java.lang.System;

/**
 * * 日期工具类 默认使用 "yyyy-MM-dd HH:mm:ss" 格式化日期
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b&\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u00020+2\u0006\u00109\u001a\u00020\u0004J\u000e\u0010:\u001a\u00020+2\u0006\u0010;\u001a\u00020<J\u0016\u0010=\u001a\u00020\u00042\u0006\u0010;\u001a\u00020<2\u0006\u0010>\u001a\u00020\u0004J\u001c\u00109\u001a\u00020\u00042\b\u0010;\u001a\u0004\u0018\u00010<2\b\b\u0002\u0010?\u001a\u00020\u0004H\u0007J\u000e\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020AJ\u000e\u0010C\u001a\u00020A2\u0006\u0010B\u001a\u00020AJ\u000e\u00106\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u0004J\u000e\u0010D\u001a\u00020\u00042\u0006\u0010E\u001a\u00020AJ\u0016\u0010F\u001a\u00020<2\u0006\u0010G\u001a\u00020+2\u0006\u0010>\u001a\u00020\u0004J\u0016\u0010H\u001a\u00020\u00042\u0006\u0010G\u001a\u00020+2\u0006\u0010>\u001a\u00020\u0004J\u001c\u0010I\u001a\u0004\u0018\u00010<2\u0006\u0010J\u001a\u00020\u00042\b\b\u0002\u0010?\u001a\u00020\u0004H\u0007J\u0016\u0010K\u001a\u00020<2\u0006\u0010L\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u0004J\u0016\u0010M\u001a\u00020+2\u0006\u0010L\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001a\u0010\'\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u0011\u0010*\u001a\u00020+8F\u00a2\u0006\u0006\u001a\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0006\"\u0004\b0\u0010\bR\u0011\u00101\u001a\u0002028F\u00a2\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u00105\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b6\u0010\u0006\u00a8\u0006N"}, d2 = {"Lcom/kotlin/base/utils/DateUtils;", "", "()V", "FORMAT_FULL", "", "getFORMAT_FULL", "()Ljava/lang/String;", "setFORMAT_FULL", "(Ljava/lang/String;)V", "FORMAT_FULL_CN", "getFORMAT_FULL_CN", "setFORMAT_FULL_CN", "FORMAT_LONG_CN", "getFORMAT_LONG_CN", "setFORMAT_LONG_CN", "FORMAT_LONG_NEW", "getFORMAT_LONG_NEW", "setFORMAT_LONG_NEW", "FORMAT_MONTH_DAY", "getFORMAT_MONTH_DAY", "setFORMAT_MONTH_DAY", "FORMAT_SHORT", "getFORMAT_SHORT", "setFORMAT_SHORT", "FORMAT_SHORT_CN", "getFORMAT_SHORT_CN", "setFORMAT_SHORT_CN", "FORMAT_SHORT_CN_MINI", "getFORMAT_SHORT_CN_MINI", "setFORMAT_SHORT_CN_MINI", "FORMAT_SHORT_SPE", "getFORMAT_SHORT_SPE", "setFORMAT_SHORT_SPE", "FORMAT_SHORT_SPE_", "getFORMAT_SHORT_SPE_", "setFORMAT_SHORT_SPE_", "FORMAT_SPEFULL_CN", "getFORMAT_SPEFULL_CN", "setFORMAT_SPEFULL_CN", "TIMEZONE", "getTIMEZONE", "setTIMEZONE", "curTime", "", "getCurTime", "()J", "datePattern", "getDatePattern", "setDatePattern", "defTimeZone", "Ljava/util/TimeZone;", "getDefTimeZone", "()Ljava/util/TimeZone;", "now", "getNow", "convertTimeToString", "time", "format", "dateToLong", "date", "Ljava/util/Date;", "dateToString", "formatType", "pattern", "getAfterDay", "Ljava/util/Calendar;", "cl", "getBeforeDay", "getWeek", "c", "longToDate", "currentTime", "longToString", "parse", "strDate", "stringToDate", "strTime", "stringToLong", "BaseLibrary_debug"})
public final class DateUtils {
    
    /**
     * * 英文简写（默认）如：12-01
     */
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String FORMAT_MONTH_DAY;
    
    /**
     * * 英文简写（默认）如：2010-12-01
     */
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String FORMAT_SHORT;
    
    /**
     * * 获得默认的 date pattern
     */
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String datePattern;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String FORMAT_LONG_NEW;
    
    /**
     * * 精确到毫秒的完整时间 如：yyyy-MM-dd HH:mm:ss.S
     */
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String FORMAT_FULL;
    
    /**
     * * 中文简写 如：2010年12月01日
     */
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String FORMAT_SHORT_CN_MINI;
    
    /**
     * * 中文简写 如：2010年12月01日
     */
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String FORMAT_SHORT_CN;
    
    /**
     * * 中文全称 如：2010年12月01日 23时15分06秒
     */
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String FORMAT_LONG_CN;
    
    /**
     * * 精确到毫秒的完整中文时间
     */
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String FORMAT_FULL_CN;
    
    /**
     * * 精确到毫秒的完整中文时间
     */
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String FORMAT_SPEFULL_CN;
    
    /**
     * * 英文简写（默认）如：2010-12-01
     */
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String FORMAT_SHORT_SPE;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String FORMAT_SHORT_SPE_;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String TIMEZONE;
    public static final com.kotlin.base.utils.DateUtils INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFORMAT_MONTH_DAY() {
        return null;
    }
    
    public final void setFORMAT_MONTH_DAY(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFORMAT_SHORT() {
        return null;
    }
    
    public final void setFORMAT_SHORT(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDatePattern() {
        return null;
    }
    
    public final void setDatePattern(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFORMAT_LONG_NEW() {
        return null;
    }
    
    public final void setFORMAT_LONG_NEW(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFORMAT_FULL() {
        return null;
    }
    
    public final void setFORMAT_FULL(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFORMAT_SHORT_CN_MINI() {
        return null;
    }
    
    public final void setFORMAT_SHORT_CN_MINI(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFORMAT_SHORT_CN() {
        return null;
    }
    
    public final void setFORMAT_SHORT_CN(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFORMAT_LONG_CN() {
        return null;
    }
    
    public final void setFORMAT_LONG_CN(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFORMAT_FULL_CN() {
        return null;
    }
    
    public final void setFORMAT_FULL_CN(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFORMAT_SPEFULL_CN() {
        return null;
    }
    
    public final void setFORMAT_SPEFULL_CN(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFORMAT_SHORT_SPE() {
        return null;
    }
    
    public final void setFORMAT_SHORT_SPE(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFORMAT_SHORT_SPE_() {
        return null;
    }
    
    public final void setFORMAT_SHORT_SPE_(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTIMEZONE() {
        return null;
    }
    
    public final void setTIMEZONE(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNow() {
        return null;
    }
    
    /**
     * * 根据用户格式返回当前日期
     *
     *     * @param format
     *     * *
     *     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNow(@org.jetbrains.annotations.NotNull()
    java.lang.String format) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.TimeZone getDefTimeZone() {
        return null;
    }
    
    /**
     * * 使用用户格式格式化日期
     *
     *     * @param date
     *     * *            日期
     *     * *
     *     * @param pattern
     *     * *            日期格式
     *     * *
     *     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String format(@org.jetbrains.annotations.Nullable()
    java.util.Date date, @org.jetbrains.annotations.NotNull()
    java.lang.String pattern) {
        return null;
    }
    
    /**
     * * 使用用户格式格式化日期
     *
     *     * @param date
     *     * *            日期
     *     * *
     *     * @param pattern
     *     * *            日期格式
     *     * *
     *     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String format(@org.jetbrains.annotations.Nullable()
    java.util.Date date) {
        return null;
    }
    
    /**
     * * 使用用户格式提取字符串日期
     *
     *     * @param strDate
     *     * *            日期字符串
     *     * *
     *     * @param pattern
     *     * *            日期格式
     *     * *
     *     * @return
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date parse(@org.jetbrains.annotations.NotNull()
    java.lang.String strDate, @org.jetbrains.annotations.NotNull()
    java.lang.String pattern) {
        return null;
    }
    
    /**
     * * 使用用户格式提取字符串日期
     *
     *     * @param strDate
     *     * *            日期字符串
     *     * *
     *     * @param pattern
     *     * *            日期格式
     *     * *
     *     * @return
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date parse(@org.jetbrains.annotations.NotNull()
    java.lang.String strDate) {
        return null;
    }
    
    /**
     * * 时间戳转date str
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String convertTimeToString(long time, @org.jetbrains.annotations.NotNull()
    java.lang.String format) {
        return null;
    }
    
    /**
     * * 获取当前时间的前一天时间
     *     * @param cl
     *     * *
     *     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Calendar getBeforeDay(@org.jetbrains.annotations.NotNull()
    java.util.Calendar cl) {
        return null;
    }
    
    /**
     * * 获取当前时间的后一天时间
     *     * @param cl
     *     * *
     *     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Calendar getAfterDay(@org.jetbrains.annotations.NotNull()
    java.util.Calendar cl) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWeek(@org.jetbrains.annotations.NotNull()
    java.util.Calendar c) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String dateToString(@org.jetbrains.annotations.NotNull()
    java.util.Date date, @org.jetbrains.annotations.NotNull()
    java.lang.String formatType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String longToString(long currentTime, @org.jetbrains.annotations.NotNull()
    java.lang.String formatType) throws java.text.ParseException {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date stringToDate(@org.jetbrains.annotations.NotNull()
    java.lang.String strTime, @org.jetbrains.annotations.NotNull()
    java.lang.String formatType) throws java.text.ParseException {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date longToDate(long currentTime, @org.jetbrains.annotations.NotNull()
    java.lang.String formatType) throws java.text.ParseException {
        return null;
    }
    
    public final long stringToLong(@org.jetbrains.annotations.NotNull()
    java.lang.String strTime, @org.jetbrains.annotations.NotNull()
    java.lang.String formatType) {
        return 0L;
    }
    
    public final long dateToLong(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return 0L;
    }
    
    public final long getCurTime() {
        return 0L;
    }
    
    private DateUtils() {
        super();
    }
}