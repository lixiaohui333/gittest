package com.lxhmmc.usercenter.presenter

import com.kotlin.user.data.protocol.UserInfo
import com.lxhmmc.baselibrary.data.net.RetrofitFactory
import com.lxhmmc.baselibrary.data.protocol.BaseResp
import com.lxhmmc.baselibrary.data.protocol.UserRsp
import com.lxhmmc.usercenter.data.api.UserApi
import com.lxhmmc.usercenter.data.protocol.LoginReq
import com.lxhmmc.usercenter.data.protocol.RegisteReq
import io.reactivex.Observable
import javax.inject.Inject

/**
 * @author lxh 2018/9/3.
 * @desc
 */
class UserRepository @Inject constructor(){
    fun register(mobile:String,verifyCode:String,pwd:String): Observable<BaseResp<String>> {
        return RetrofitFactory.create(UserApi::class.java).registe(RegisteReq(mobile,verifyCode,pwd))
    }

    fun login(mobile:String,pwd:String): Observable<BaseResp<UserInfo>> {
        return RetrofitFactory.create(UserApi::class.java).login(LoginReq(mobile,pwd,""))
    }
}