package com.lxhmmc.kotlinmall.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lxhmmc.baselibrary.ui.fragment.BaseFragment
import com.lxhmmc.kotlinmall.R

class HomeFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        super.onCreateView(inflater, container, savedInstanceState)

        return inflater.inflate(R.layout.fragment_home, null)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
        initBanner()
        initNews()
        initDiscount()
        initTopic()
    }

    private fun initTopic() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun initDiscount() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun initNews() {
    }

    private fun initBanner() {
    }

    private fun initView() {
    }


}