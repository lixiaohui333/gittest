package com.lxhmmc.baselibrary.common

import android.view.View

/**
 * @author lxh 2018/10/5.
 * @desc
 */

fun View.onClick(method:() -> Unit)  {
    this.setOnClickListener { method() }
}