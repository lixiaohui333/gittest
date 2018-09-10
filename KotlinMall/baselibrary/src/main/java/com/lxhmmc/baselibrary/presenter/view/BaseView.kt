package com.lxhmmc.baselibrary.presenter.view

interface BaseView {

    fun showLoading()
    fun hideLoading()
    fun onError(msg:String?)
}