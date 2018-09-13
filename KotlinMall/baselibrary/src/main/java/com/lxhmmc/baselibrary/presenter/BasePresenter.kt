package com.lxhmmc.baselibrary.presenter

import com.kotlin.base.utils.NetWorkUtils
import com.lxhmmc.baselibrary.common.BaseApplication.Companion.context
import com.lxhmmc.baselibrary.presenter.view.BaseView
import com.trello.rxlifecycle2.LifecycleProvider
import javax.inject.Inject

open class BasePresenter<T : BaseView> {
    lateinit var mView: T

    @Inject
    lateinit var lifecycleProvider: LifecycleProvider<*>

    /*
       检查网络是否可用
    */
    fun checkNetWork():Boolean{
        if(NetWorkUtils.isNetWorkAvailable(context)){
            return true
        }
        mView.onError("网络不可用")
        return false
    }
}