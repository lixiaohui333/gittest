package com.lxhmmc.baselibrary.ui.base

import android.os.Bundle
import com.lxhmmc.baselibrary.presenter.BasePresenter
import com.lxhmmc.baselibrary.presenter.view.BaseView
import javax.inject.Inject

/**
 * @author lxh 2018/10/5.
 * @desc
 */
open abstract class BaseMVPActivity<T : BasePresenter<*>> : BaseActivity(),BaseView {

    @Inject
    lateinit var mPresenter: T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initInject()
    }

    abstract fun initInject()

}