package com.lxhmmc.service.impl

import com.lxhmmc.service.RegistService
import io.reactivex.Observable
import javax.inject.Inject

/**
 * @author lxh 2018/10/5.
 * @desc
 */
class RegistServiceImpl @Inject constructor(): RegistService {


    override fun regist(name: String, pwd: String): Observable<Boolean> {


        return Observable.create {
            Thread.sleep(2000)
            it.onNext(true)
            it.onComplete()
        }

    }
}