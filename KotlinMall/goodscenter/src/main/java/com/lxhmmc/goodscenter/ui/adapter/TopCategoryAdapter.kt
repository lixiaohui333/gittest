package com.lxhmmc.goodscenter.ui.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.lxhmmc.baselibrary.ui.adapter.BaseRecyclerViewAdapter
import com.lxhmmc.goodscenter.R
import com.lxhmmc.goodscenter.data.protocol.Category
import kotlinx.android.synthetic.main.layout_top_category_item.view.*

class TopCategoryAdapter(private val context: Context) : BaseRecyclerViewAdapter<Category, TopCategoryAdapter.ViewHolder>(context) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(View.inflate(context, R.layout.layout_top_category_item, null))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        super.onBindViewHolder(holder, position)

        val category = datalist[position]
        holder.itemView.mTopCategoryNameTv.text = category.categoryName

        holder.itemView.mTopCategoryNameTv.isSelected = category.isSelected
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
}