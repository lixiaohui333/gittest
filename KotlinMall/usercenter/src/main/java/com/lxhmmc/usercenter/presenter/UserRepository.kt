package com.lxhmmc.usercenter.presenter

import com.lxhmmc.baselibrary.data.net.RetrofitFactory
import com.lxhmmc.baselibrary.data.protocol.BaseResp
import com.lxhmmc.baselibrary.data.protocol.UserRsp
import com.lxhmmc.usercenter.data.api.UserApi
import com.lxhmmc.usercenter.data.protocol.RegisteReq
import io.reactivex.Observable

/**
 * @author lxh 2018/9/3.
 * @desc
 */
class UserRepository {
    fun register(): Observable<BaseResp<UserRsp>> {
        return RetrofitFactory.create(UserApi::class.java).registe(RegisteReq(code = "1234", phone = "15828380434"))
    }
}