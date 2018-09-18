package com.lxhmmc.goodscenter.ui.fragment

import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kennyc.view.MultiStateView
import com.lxhmmc.baselibrary.common.Constant
import com.lxhmmc.baselibrary.ext.setVisible
import com.lxhmmc.baselibrary.ui.adapter.BaseRecyclerViewAdapter
import com.lxhmmc.baselibrary.ui.adapter.BaseRecyclerViewAdapter.OnItemCLickListener
import com.lxhmmc.baselibrary.ui.fragment.BaseMvpFragment
import com.lxhmmc.goodscenter.R
import com.lxhmmc.goodscenter.data.protocol.Category
import com.lxhmmc.goodscenter.injection.component.DaggerCategoryComponent
import com.lxhmmc.goodscenter.injection.module.CategoryModule
import com.lxhmmc.goodscenter.presenter.CategoryPresenter
import com.lxhmmc.goodscenter.presenter.view.CategoryView
import com.lxhmmc.goodscenter.ui.activity.GoodsDetailActivity
import com.lxhmmc.goodscenter.ui.adapter.SecondCategoryAdapter
import com.lxhmmc.goodscenter.ui.adapter.TopCategoryAdapter
import kotlinx.android.synthetic.main.fragment_category.*
import org.jetbrains.anko.startActivity

class CategoryFragment : BaseMvpFragment<CategoryPresenter>(), CategoryView {

    //一级分类Adapter
    lateinit var topAdapter: TopCategoryAdapter
    //二级分类Adapter
    lateinit var secondAdapter: SecondCategoryAdapter


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

        mTopCategoryRv.layoutManager = LinearLayoutManager(context)
        topAdapter = TopCategoryAdapter(context!!)
        mTopCategoryRv.adapter = topAdapter

        topAdapter.mItemClickListener = object : OnItemCLickListener<Category> {
            override fun onItemClick(item: Category, position: Int) {
                for (category in topAdapter.datalist) {
                    category.isSelected = item.id == category.id
                }
                topAdapter.notifyDataSetChanged()
                loadData(item.id)

            }
        }

        mSecondCategoryRv.layoutManager  = GridLayoutManager(context,3)
        secondAdapter  = SecondCategoryAdapter(context!!)
        mSecondCategoryRv.adapter = secondAdapter

        secondAdapter.mItemClickListener=object :OnItemCLickListener<Category>{
            override fun onItemClick(item: Category, position: Int) {
                activity?.startActivity<GoodsDetailActivity>(Constant.EXTRA_STRING to item.id)
            }
        }

    }
    override fun onGetCategoryResult(result: MutableList<Category>?) {
        if (result != null && result.size > 0) {
            if(result[0].parentId==0){
                result[0].isSelected=true

                topAdapter.setData(result)
                mPresenter.getCategory(result[0].id)

            }else{
                secondAdapter.setData(result)

                mMultiStateView.viewState = MultiStateView.VIEW_STATE_CONTENT
            }
        }else{
            //没有数据
            mTopCategoryIv.setVisible(false)
            mCategoryTitleTv.setVisible(false)
            mMultiStateView.viewState = MultiStateView.VIEW_STATE_EMPTY
        }

    }


    override fun injectComponent() {
        DaggerCategoryComponent.builder().activityComponent(mActivityComponent).categoryModule(CategoryModule()).build().inject(this)
        mPresenter.mView = this

    }

}