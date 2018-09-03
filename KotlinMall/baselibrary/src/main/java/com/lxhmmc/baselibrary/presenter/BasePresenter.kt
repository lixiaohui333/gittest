package com.lxhmmc.baselibrary.presenter

import com.lxhmmc.baselibrary.presenter.view.BaseView

open class BasePresenter<T : BaseView> {
    lateinit var mView: T
}