package com.lxhmmc.usercenter.service

import com.kotlin.user.data.protocol.UserInfo
import com.lxhmmc.baselibrary.data.protocol.BaseResp
import com.lxhmmc.baselibrary.data.protocol.UserRsp
import io.reactivex.Observable

interface UserService {

    fun regist(mobile: String, verify: String, pwd: String): Observable<BaseResp<String>>

    fun login(mobile: String, pwd: String): Observable<BaseResp<UserInfo>>

    fun forget(mobile: String, verify: String): Observable<BaseResp<String>>

    fun resetPwd(mobile: String, pwd: String): Observable<BaseResp<String>>


    fun editUser(name: String, icon: String, gender: String, sign: String): Observable<BaseResp<UserInfo>>


}