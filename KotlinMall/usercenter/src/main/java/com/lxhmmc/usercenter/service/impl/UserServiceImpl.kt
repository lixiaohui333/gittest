package com.lxhmmc.usercenter.service.impl

import com.lxhmmc.baselibrary.data.protocol.BaseResp
import com.lxhmmc.usercenter.presenter.UserRepository
import com.lxhmmc.usercenter.service.UserService
import io.reactivex.Observable
import javax.inject.Inject

class UserServiceImpl @Inject constructor(): UserService {

    @Inject
    lateinit var userRepository: UserRepository

    override fun regist(mobile: String, verify: String, pwd: String): Observable<BaseResp<String>> {
        return userRepository.register(mobile,verify,pwd)
    }
}