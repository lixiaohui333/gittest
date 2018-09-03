package com.lxhmmc.usercenter.service.impl

import com.lxhmmc.baselibrary.data.protocol.BaseResp
import com.lxhmmc.baselibrary.data.protocol.UserRsp
import com.lxhmmc.usercenter.presenter.UserRepository
import com.lxhmmc.usercenter.service.UserService
import io.reactivex.Observable

class UserServiceImpl : UserService {
    override fun regist(mobile: String, verify: String, pwd: String): Observable<BaseResp<UserRsp>> {


        return UserRepository().register()
    }
}