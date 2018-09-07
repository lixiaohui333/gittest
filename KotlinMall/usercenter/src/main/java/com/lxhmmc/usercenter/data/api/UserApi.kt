package com.lxhmmc.usercenter.data.api

import com.kotlin.user.data.protocol.UserInfo
import com.lxhmmc.baselibrary.data.protocol.BaseResp
import com.lxhmmc.baselibrary.data.protocol.UserRsp
import com.lxhmmc.usercenter.data.protocol.ForgetReq
import com.lxhmmc.usercenter.data.protocol.LoginReq
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

    @POST("userCenter/login")
    fun login(@Body req: LoginReq):Observable<BaseResp<UserInfo>>

    @POST("userCenter/forgetPwd")
    fun forget(@Body req: ForgetReq):Observable<BaseResp<String>>

}