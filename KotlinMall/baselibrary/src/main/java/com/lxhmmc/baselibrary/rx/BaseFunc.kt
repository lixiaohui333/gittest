package com.lxhmmc.baselibrary.rx

import com.kotlin.base.rx.BaseException
import com.lxhmmc.baselibrary.data.protocol.BaseResp
import io.reactivex.Observable
import io.reactivex.functions.Function

/*
    通用数据类型转换封装
 */
class BaseFunc<T>:Function<BaseResp<T>,Observable<T>>{
    override fun apply(t: BaseResp<T>): Observable<T> {
        if (t.status != BaseResp.HTTP_OK) {
            return Observable.error(BaseException(t.status, t.message))
        }
        return Observable.just(t.data)
    }


//    override fun call(t: BaseResp<T>): Observable<T> {
//        if (t.status != BaseResp.HTTP_OK){
//            return Observable.error(BaseException(t.status,t.message))
//        }
//        return Observable.just(t.data)
//    }
}
