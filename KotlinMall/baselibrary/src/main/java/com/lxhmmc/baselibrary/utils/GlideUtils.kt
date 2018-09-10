package com.kotlin.base.utils

import android.content.Context
import android.widget.ImageView
import com.lxhmmc.baselibrary.utils.GlideApp
import de.hdodenhof.circleimageview.CircleImageView

/*
    Glide工具类
 */
object GlideUtils {
    fun loadImage(context: Context, url: String, imageView: ImageView) {
        GlideApp.with(context).load(url).centerCrop().into(imageView)
    }
    /*
        当fragment或者activity失去焦点或者destroyed的时候，Glide会自动停止加载相关资源，确保资源不会被浪费
     */
//    fun loadUrlImage(context: Context, url: String, imageView: ImageView){
//        Glide.with(context).load(url).placeholder(R.drawable.icon_back).error(R.drawable.icon_back).centerCrop().into(
//                object : SimpleTarget<GlideDrawable>() {
//                    override fun onResourceReady(resource: GlideDrawable,
//                                                 glideAnimation: GlideAnimation<in GlideDrawable>) {
//                        imageView.setImageDrawable(resource)
//                    }
//                })
//    }
}
