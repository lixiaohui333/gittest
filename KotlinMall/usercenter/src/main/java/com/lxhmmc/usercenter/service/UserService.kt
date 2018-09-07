package com.lxhmmc.usercenter.service

import com.kotlin.user.data.protocol.UserInfo
import com.lxhmmc.baselibrary.data.protocol.BaseResp
import com.lxhmmc.baselibrary.data.protocol.UserRsp
import io.reactivex.Observable

interface UserService {

    fun regist(mobile: String, verify: String, pwd: String): Observable<BaseResp<String>>

    fun login(mobile: String, pwd: String): Observable<BaseResp<UserInfo>>
}