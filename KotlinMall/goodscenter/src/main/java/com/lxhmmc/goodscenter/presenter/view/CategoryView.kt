package com.lxhmmc.goodscenter.presenter.view

import com.lxhmmc.baselibrary.presenter.view.BaseView
import com.lxhmmc.goodscenter.data.protocol.Category

interface CategoryView :BaseView {

    fun onGetCategoryResult(mutableList: MutableList<Category>?)

}