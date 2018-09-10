package com.lxhmmc.usercenter.presenter

import com.lxhmmc.baselibrary.ext.convert
import com.lxhmmc.baselibrary.ext.executeDefulat
import com.lxhmmc.baselibrary.presenter.BasePresenter
import com.lxhmmc.usercenter.presenter.view.UserInfoView
import com.lxhmmc.usercenter.service.impl.UploadServiceImpl
import com.lxhmmc.usercenter.service.impl.UserServiceImpl
import io.reactivex.functions.Consumer
import javax.inject.Inject


class UserInfoPresenter @Inject constructor() : BasePresenter<UserInfoView>() {

    @Inject
    lateinit var userService: UserServiceImpl


    @Inject
    lateinit var uploadService: UploadServiceImpl

    fun edit(name: String, icon: String, gender: String, sign: String) {
        userService.editUser(name, icon, gender, sign).convert().executeDefulat(Consumer { t ->
            mView.onEditResult(t)
        }, mView, lifecycleProvider)
    }

    fun uploadToken() {
        uploadService.getUploadToken().convert().executeDefulat(Consumer { t ->
            mView.onGetTokenResult(t)
        }, mView, lifecycleProvider)

    }
}