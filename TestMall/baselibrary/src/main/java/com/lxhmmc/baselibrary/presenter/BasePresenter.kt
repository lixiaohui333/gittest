package com.lxhmmc.baselibrary.presenter

import com.lxhmmc.baselibrary.presenter.view.BaseView

/**
 * @author lxh 2018/10/5.
 * @desc
 */
 open  class BasePresenter<T:BaseView> {

    lateinit var mView: T


}