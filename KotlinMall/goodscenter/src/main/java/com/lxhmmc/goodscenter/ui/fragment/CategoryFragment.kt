package com.lxhmmc.goodscenter.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lxhmmc.baselibrary.ui.fragment.BaseMvpFragment
import com.lxhmmc.goodscenter.R
import com.lxhmmc.goodscenter.data.protocol.Category
import com.lxhmmc.goodscenter.injection.component.DaggerCategoryComponent
import com.lxhmmc.goodscenter.injection.module.CategoryModule
import com.lxhmmc.goodscenter.presenter.CategoryPresenter
import com.lxhmmc.goodscenter.presenter.view.CategoryView

class CategoryFragment : BaseMvpFragment<CategoryPresenter>(), CategoryView {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        return inflater.inflate(R.layout.fragment_category, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        loadData()
    }

    private fun loadData(parentId: Int = 0) {
        mPresenter.getCategory(parentId)
    }


    private fun initView() {
    }


    override fun injectComponent() {
        DaggerCategoryComponent.builder().activityComponent(mActivityComponent).categoryModule(CategoryModule()).build().inject(this)
        mPresenter.mView = this

    }

    override fun onGetCategoryResult(mutableList: MutableList<Category>?) {
    }

}