package com.lxhmmc.usercenter.service.impl

import com.lxhmmc.baselibrary.data.protocol.BaseResp
import com.lxhmmc.usercenter.presenter.respository.UploadRepository
import com.lxhmmc.usercenter.service.UploadService
import io.reactivex.Observable
import javax.inject.Inject

class UploadServiceImpl @Inject constructor() : UploadService {



    @Inject
    lateinit var uploadRepository: UploadRepository

    override fun getUploadToken(): Observable<BaseResp<String>> {

        return uploadRepository.uploadToken()
    }


}