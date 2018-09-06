package com.lxhmmc.baselibrary.ui.activity

import android.os.Bundle
import com.lxhmmc.baselibrary.common.BaseApplication
import com.lxhmmc.baselibrary.injection.component.ActivityComponent
import com.lxhmmc.baselibrary.injection.component.DaggerActivityComponent
import com.lxhmmc.baselibrary.injection.module.ActivityModule
import com.lxhmmc.baselibrary.injection.module.LifecycleProviderModule
import com.lxhmmc.baselibrary.presenter.BasePresenter
import com.lxhmmc.baselibrary.presenter.view.BaseView
import org.jetbrains.anko.toast
import javax.inject.Inject


abstract class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(), BaseView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initAcitivtyInject()
        initComponentInject()
    }

    abstract fun initComponentInject()


    lateinit var activityComponent: ActivityComponent

    private fun initAcitivtyInject() {

        activityComponent = DaggerActivityComponent.builder().appComponent((application as BaseApplication).appComponent).activityModule(ActivityModule(this)).lifecycleProviderModule(LifecycleProviderModule(this)).build()

    }

    @Inject
    lateinit var mPresenter: T

    override fun showLoading() {
    }

    override fun hideLoading() {
    }

    override fun onError(msg: String) {
        toast(msg)
    }
}