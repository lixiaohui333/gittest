package com.lxhmmc.usercenter.presenter.respository

import com.kotlin.user.data.protocol.EditUserReq
import com.kotlin.user.data.protocol.UserInfo
import com.lxhmmc.baselibrary.data.net.RetrofitFactory
import com.lxhmmc.baselibrary.data.protocol.BaseResp
import com.lxhmmc.usercenter.data.api.UploadApi
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
class UploadRepository @Inject constructor() {

    fun uploadToken(): Observable<BaseResp<String>> {
        return RetrofitFactory.create(UploadApi::class.java).uploadToken()
    }
}