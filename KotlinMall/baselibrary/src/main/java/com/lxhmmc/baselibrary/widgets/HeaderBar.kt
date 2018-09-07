package com.lxhmmc.baselibrary.widgets

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import com.lxhmmc.baselibrary.R
import com.lxhmmc.baselibrary.ext.onClick
import kotlinx.android.synthetic.main.layout_header_bar.view.*

class HeaderBar @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : FrameLayout(context, attrs, defStyleAttr) {

    private var isShowBack: Boolean
    private var titleText: String?
    private var rightText: String?

    init {

        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.HeaderBar)

        isShowBack = typedArray.getBoolean(R.styleable.HeaderBar_isShowBack, true)

        titleText = typedArray.getString(R.styleable.HeaderBar_titleText)
        rightText = typedArray.getString(R.styleable.HeaderBar_rightText)

        initView()
        typedArray.recycle()

    }

    fun getRightTextView(): TextView {
        return mRightTv
    }

    private fun initView() {
        View.inflate(context, R.layout.layout_header_bar, this)

        val mLeftIv = findViewById<ImageView>(R.id.mLeftIv)
        val mTitleTv = findViewById<TextView>(R.id.mTitleTv)
        val mRightTv = findViewById<TextView>(R.id.mRightTv)

        mLeftIv.visibility = when (isShowBack) {
            true -> View.VISIBLE
            false -> View.GONE
        }

        titleText?.let {
            mTitleTv.text = it
        }

        rightText?.let {
            mRightTv.text = it
            mRightTv.visibility = View.VISIBLE
        }

        mLeftIv.onClick {
            if (context is Activity) {
                (context as Activity).finish()
            }
        }

    }
}
