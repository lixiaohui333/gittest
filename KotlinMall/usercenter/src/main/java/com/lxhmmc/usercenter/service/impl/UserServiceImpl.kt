package com.lxhmmc.usercenter.service.impl

import com.kotlin.user.data.protocol.UserInfo
import com.lxhmmc.baselibrary.data.protocol.BaseResp
import com.lxhmmc.usercenter.presenter.respository.UserRepository
import com.lxhmmc.usercenter.service.UserService
import io.reactivex.Observable
import javax.inject.Inject

class UserServiceImpl @Inject constructor() : UserService {


    @Inject
    lateinit var userRepository: UserRepository

    override fun regist(mobile: String, verify: String, pwd: String): Observable<BaseResp<String>> {
        return userRepository.register(mobile, verify, pwd)
    }

    override fun login(mobile: String, pwd: String): Observable<BaseResp<UserInfo>> {
        return userRepository.login(mobile, pwd)
    }

    override fun forget(mobile: String, verify: String): Observable<BaseResp<String>> {
        return userRepository.forget(mobile, verify)
    }

    override fun resetPwd(mobile: String, pwd: String): Observable<BaseResp<String>> {
        return userRepository.resetPwd(mobile, pwd)
    }

    override fun editUser(name: String, icon: String, gender: String, sign: String): Observable<BaseResp<UserInfo>> {

        return userRepository.editUser(name,icon,gender,sign)
    }

}