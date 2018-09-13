package com.lxhmmc.kotlinmall.ui.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lxhmmc.baselibrary.ext.loadImage
import com.lxhmmc.baselibrary.ui.adapter.BaseRecyclerViewAdapter
import com.lxhmmc.kotlinmall.R
import kotlinx.android.synthetic.main.layout_home_discount_item.view.*

class HomeDiscountAdapter(val context: Context) : BaseRecyclerViewAdapter<String, HomeDiscountAdapter.MyViewHolder>(context) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context)
                .inflate(R.layout.layout_home_discount_item, parent,false)

        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        super.onBindViewHolder(holder, position)

        //加载图片
//        GlideUtils.loadUrlImage(mContext,dataList[position],holder.itemView.mGoodsIconIv)

        holder.itemView.mGoodsIconIv.loadImage(context, datalist[position])
        //静态假数据
        holder.itemView.mDiscountAfterTv.text = "￥123.00"
        holder.itemView.mDiscountBeforeTv.text = "$1000.00"
    }

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view)
}