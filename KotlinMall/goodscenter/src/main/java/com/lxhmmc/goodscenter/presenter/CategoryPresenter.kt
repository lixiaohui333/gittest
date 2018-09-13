package com.lxhmmc.goodscenter.presenter

import com.lxhmmc.baselibrary.ext.convert
import com.lxhmmc.baselibrary.ext.executeDefulat
import com.lxhmmc.baselibrary.presenter.BasePresenter
import com.lxhmmc.goodscenter.data.protocol.Category
import com.lxhmmc.goodscenter.presenter.view.CategoryView
import com.lxhmmc.goodscenter.service.CategoryService
import io.reactivex.functions.Consumer
import javax.inject.Inject

class CategoryPresenter @Inject constructor() : BasePresenter<CategoryView>() {


    @Inject
    lateinit var categoryService: CategoryService

    fun getCategory(parentId: Int) {

        if (!checkNetWork()) {
            return
        }

        mView.showLoading()
        categoryService.getCategory(parentId).convert().executeDefulat(Consumer {
            mView.onGetCategoryResult(it)
        }, mView, lifecycleProvider)

    }

}