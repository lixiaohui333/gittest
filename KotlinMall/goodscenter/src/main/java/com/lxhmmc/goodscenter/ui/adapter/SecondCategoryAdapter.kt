package com.lxhmmc.goodscenter.ui.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.lxhmmc.baselibrary.ext.loadImage
import com.lxhmmc.baselibrary.ui.adapter.BaseRecyclerViewAdapter
import com.lxhmmc.goodscenter.R
import com.lxhmmc.goodscenter.data.protocol.Category
import kotlinx.android.synthetic.main.layout_second_category_item.view.*
import kotlinx.android.synthetic.main.layout_top_category_item.view.*

class SecondCategoryAdapter(private val context: Context) : BaseRecyclerViewAdapter<Category, SecondCategoryAdapter.ViewHolder>(context) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(View.inflate(context, R.layout.layout_second_category_item, null))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        super.onBindViewHolder(holder, position)

        val category = datalist[position]
        holder.itemView.mSecondCategoryNameTv.text = category.categoryName
        holder.itemView.mCategoryIconIv.loadImage(category.categoryIcon)

    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
}