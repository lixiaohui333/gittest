package com.lxhmmc.baselibrary.rx

import com.kotlin.base.rx.BaseException
import com.lxhmmc.baselibrary.data.protocol.BaseResp
import io.reactivex.Observable
import io.reactivex.functions.Function

/*
    通用数据类型转换封装
 */
class BaseFuncBoolean<T>:Function<BaseResp<T>,Observable<Boolean>>{
    override fun apply(t: BaseResp<T>): Observable<Boolean> {
        if (t.status != BaseResp.HTTP_OK) {
            return Observable.error(BaseException(t.status, t.message))
        }
        return Observable.just(true)
    }

}
