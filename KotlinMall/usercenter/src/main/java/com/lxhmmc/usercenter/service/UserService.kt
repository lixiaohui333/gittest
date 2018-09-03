package com.lxhmmc.usercenter.service

import io.reactivex.Observable

interface UserService {

    fun regist(mobile:String,verify:String,pwd:String):Observable<Boolean>
}