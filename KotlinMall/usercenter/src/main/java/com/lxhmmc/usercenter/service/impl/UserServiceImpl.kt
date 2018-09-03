package com.lxhmmc.usercenter.service.impl

import com.lxhmmc.usercenter.service.UserService
import io.reactivex.Flowable
import io.reactivex.Observable

class UserServiceImpl : UserService {
    override fun regist(mobile: String, verify: String, pwd: String): Observable<Boolean> {


        return Observable.just(true).map {
            Thread.sleep(2000)
            it
        }
    }
}