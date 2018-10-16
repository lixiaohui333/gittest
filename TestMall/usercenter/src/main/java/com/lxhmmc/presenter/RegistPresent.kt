package com.lxhmmc.presenter

import com.lxhmmc.baselibrary.presenter.BaseBooleanObserver
import com.lxhmmc.baselibrary.presenter.BasePresenter
import com.lxhmmc.common.executeBoolean
import com.lxhmmc.presenter.view.RegistView
import com.lxhmmc.service.impl.RegistServiceImpl
import javax.inject.Inject

/**
 * @author lxh 2018/10/5.
 * @desc
 */
class RegistPresent @Inject constructor() :BasePresenter<RegistView>(){


    @Inject
    lateinit var mRegistService:RegistServiceImpl

    fun regist(name:String,pwd:String){



        mRegistService.regist(name,pwd).executeBoolean(object : BaseBooleanObserver(mView) {
            override fun success() {
                mView.onSuccess()
            }
        })

    }

}