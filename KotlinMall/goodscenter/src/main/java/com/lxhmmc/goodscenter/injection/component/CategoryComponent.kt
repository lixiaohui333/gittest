package com.lxhmmc.goodscenter.injection.component

import com.lxhmmc.baselibrary.injection.PerComponentScope
import com.lxhmmc.baselibrary.injection.component.ActivityComponent
import com.lxhmmc.goodscenter.injection.module.CategoryModule
import com.lxhmmc.goodscenter.ui.fragment.CategoryFragment
import dagger.Component


@PerComponentScope
@Component(dependencies = [ActivityComponent::class],modules = [CategoryModule::class])
interface CategoryComponent {
    fun inject(fragment: CategoryFragment)

}