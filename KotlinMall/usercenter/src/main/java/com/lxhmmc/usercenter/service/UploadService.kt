package com.lxhmmc.usercenter.service

import com.kotlin.user.data.protocol.UserInfo
import com.lxhmmc.baselibrary.data.protocol.BaseResp
import com.lxhmmc.baselibrary.data.protocol.UserRsp
import io.reactivex.Observable

interface UploadService {

    fun getUploadToken(): Observable<BaseResp<String>>

}