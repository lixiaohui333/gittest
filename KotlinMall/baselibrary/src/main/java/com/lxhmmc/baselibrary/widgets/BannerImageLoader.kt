package com.lxhmmc.baselibrary.widgets

import android.content.Context
import android.widget.ImageView
import com.lxhmmc.baselibrary.ext.loadImage
import com.youth.banner.loader.ImageLoader

class BannerImageLoader :ImageLoader() {
    override fun displayImage(context: Context, path: Any, imageView: ImageView) {
        imageView.loadImage(context,path as String)
    }
}