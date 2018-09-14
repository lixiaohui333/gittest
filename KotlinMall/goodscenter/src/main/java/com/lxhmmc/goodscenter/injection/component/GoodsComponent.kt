package com.lxhmmc.goodscenter.injection.component

import com.lxhmmc.baselibrary.injection.PerComponentScope
import com.lxhmmc.baselibrary.injection.component.ActivityComponent
import com.lxhmmc.goodscenter.injection.module.GoodsModule
import com.lxhmmc.goodscenter.ui.activity.GoodsDetailActivity
import com.lxhmmc.goodscenter.ui.fragment.GoodsDetailTabOneFragment
import dagger.Component


@PerComponentScope
@Component(dependencies = [ActivityComponent::class],modules = [GoodsModule::class])
interface GoodsComponent {

    fun inject(activity: GoodsDetailActivity)
    fun inject(fragment: GoodsDetailTabOneFragment)

}