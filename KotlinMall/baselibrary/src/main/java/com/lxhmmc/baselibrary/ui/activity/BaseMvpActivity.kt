package com.lxhmmc.baselibrary.ui.activity

import com.lxhmmc.baselibrary.presenter.BasePresenter
import com.lxhmmc.baselibrary.presenter.view.BaseView
import org.jetbrains.anko.toast
import javax.inject.Inject


abstract class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(), BaseView {


    @Inject
    lateinit var mPresenter: T

    override fun showLoading() {
    }

    override fun hideLoading() {
    }

    override fun onError(msg:String) {
        toast(msg)
    }
}