package com.lxhmmc.baselibrary.ui.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView

abstract class BaseRecyclerViewAdapter<T, VH : RecyclerView.ViewHolder>(context:Context) : RecyclerView.Adapter<VH>() {

    var datalist: MutableList<T> = mutableListOf()

    var mItemClickListener: OnItemCLickListener<T>? = null

    fun setData(datalist: MutableList<T>) {
        this.datalist = datalist
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return datalist.size
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.itemView.setOnClickListener {
            mItemClickListener?.onItemClick(datalist[position], position)
        }
    }

    interface OnItemCLickListener<in T> {
        fun onItemClick(item: T, position: Int)
    }


}