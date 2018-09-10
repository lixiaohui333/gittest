package com.lxhmmc.usercenter.presenter.respository

import com.kotlin.user.data.protocol.EditUserReq
import com.kotlin.user.data.protocol.UserInfo
import com.lxhmmc.baselibrary.data.net.RetrofitFactory
import com.lxhmmc.baselibrary.data.protocol.BaseResp
import com.lxhmmc.usercenter.data.api.UserApi
import com.lxhmmc.usercenter.data.protocol.ForgetReq
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
    fun forget(mobile:String,verify:String): Observable<BaseResp<String>> {
        return RetrofitFactory.create(UserApi::class.java).forget(ForgetReq(mobile,verify))
    }

    fun resetPwd(mobile:String,pwd:String): Observable<BaseResp<String>> {
        return RetrofitFactory.create(UserApi::class.java).resetPwd(LoginReq(mobile,pwd,""))
    }

    fun editUser(name: String, icon: String, gender: String, sign: String): Observable<BaseResp<UserInfo>> {
        return RetrofitFactory.create(UserApi::class.java).editUser(EditUserReq(icon,name,gender,sign))
    }
}