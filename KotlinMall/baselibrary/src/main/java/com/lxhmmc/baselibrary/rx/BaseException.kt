package com.kotlin.base.rx

/*
    定义通用异常
 */
data class BaseException(val status:Int,val msg:String) :Throwable()
