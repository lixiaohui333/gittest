package com.lxhmmc.baselibrary.ui.activity

import com.lxhmmc.baselibrary.presenter.BasePresenter
import com.lxhmmc.baselibrary.presenter.view.BaseView


abstract class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(), BaseView {

    lateinit var mPresenter: T

    override fun showLoading() {
    }

    override fun hideLoading() {
    }

    override fun onError() {
    }
}