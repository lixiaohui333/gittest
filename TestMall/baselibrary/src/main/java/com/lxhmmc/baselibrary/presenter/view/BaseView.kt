package com.lxhmmc.baselibrary.presenter.view

/**
 * @author lxh 2018/10/5.
 * @desc
 */
 interface BaseView {

    fun showLoading()

    fun hideLoading()

    fun onError(msg: String)

}