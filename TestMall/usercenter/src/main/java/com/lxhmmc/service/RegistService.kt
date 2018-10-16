package com.lxhmmc.service

import io.reactivex.Observable

/**
 * @author lxh 2018/10/5.
 * @desc
 */
interface RegistService {

    fun regist(name:String,pwd:String): Observable<Boolean>

}