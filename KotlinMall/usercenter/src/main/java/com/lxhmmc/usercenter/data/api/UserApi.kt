package com.lxhmmc.usercenter.data.api

import com.lxhmmc.baselibrary.data.protocol.BaseResp
import com.lxhmmc.baselibrary.data.protocol.UserRsp
import com.lxhmmc.usercenter.data.protocol.RegisteReq
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.POST

/**
 * @author lxh 2018/9/3.
 * @desc
 */
interface UserApi {


    @POST("userCenter/register")
    fun registe(@Body req:RegisteReq):Observable<BaseResp<String>>

}