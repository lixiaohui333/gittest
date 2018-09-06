package com.lxhmmc.usercenter.ui.activity

import android.os.Bundle
import com.lxhmmc.baselibrary.ext.onClick
import com.lxhmmc.baselibrary.ui.activity.BaseMvpActivity
import com.lxhmmc.usercenter.R
import com.lxhmmc.usercenter.injection.compoent.DaggerUserCompoent
import com.lxhmmc.usercenter.injection.module.UserModule
import com.lxhmmc.usercenter.presenter.RegistPresenter
import com.lxhmmc.usercenter.presenter.view.RegistView
import kotlinx.android.synthetic.main.activity_regist.*
import org.jetbrains.anko.toast

class RegistActivity : BaseMvpActivity<RegistPresenter>(),RegistView {



    override fun onRegistResult(success: String) {
            toast(success)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regist)

        mRegistBtn.onClick{
            mPresenter.register("15828380434","123456","123456")
        }
    }

    override fun initComponentInject() {
        DaggerUserCompoent.builder().activityComponent(activityComponent)
                .build().inject(this)
        mPresenter.mView=this
    }
}
