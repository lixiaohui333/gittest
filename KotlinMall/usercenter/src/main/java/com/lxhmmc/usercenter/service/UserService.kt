package com.lxhmmc.usercenter.service

import com.lxhmmc.baselibrary.data.protocol.BaseResp
import com.lxhmmc.baselibrary.data.protocol.UserRsp
import io.reactivex.Observable

interface UserService {

    fun regist(mobile:String,verify:String,pwd:String):Observable<BaseResp<String>>
}