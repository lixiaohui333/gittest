package com.lxhmmc.kotlinmall.ui.fragment

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kotlin.base.utils.AppPrefsUtils
import com.kotlin.provider.common.ProviderConstant
import com.lxhmmc.baselibrary.ext.loadImage
import com.lxhmmc.baselibrary.ext.onClick
import com.lxhmmc.baselibrary.ui.fragment.BaseFragment
import com.lxhmmc.kotlinmall.R
import com.lxhmmc.kotlinmall.ui.activity.SettingsActivity
import com.lxhmmc.provider.common.afterLogin
import com.lxhmmc.provider.common.isLogined
import com.lxhmmc.usercenter.ui.activity.UserInfoActivity
import kotlinx.android.synthetic.main.fragment_me.*
import org.jetbrains.anko.startActivity

class MeFragment : BaseFragment(), View.OnClickListener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        super.onCreateView(inflater, container, savedInstanceState)

        return inflater.inflate(R.layout.fragment_me, null)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
    }

    override fun onStart() {
        super.onStart()
        loadUserData()
    }

    private fun loadUserData() {
        if (isLogined()) {

            val userIcon = AppPrefsUtils.getString(ProviderConstant.KEY_SP_USER_ICON)
            if (userIcon.isNotEmpty()) {
                mUserIconIv.loadImage(userIcon)
            }
            mUserNameTv.text = AppPrefsUtils.getString(ProviderConstant.KEY_SP_USER_NAME)
        } else {
            mUserIconIv.setImageResource(R.drawable.icon_default_user)
            mUserNameTv.text = getString(R.string.un_login_text)
        }

    }


    private fun initView() {
        mUserIconIv.onClick(this)
        mUserNameTv.onClick(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.mUserIconIv->{
                afterLogin {
                    activity?.startActivity<UserInfoActivity>()
                }
            }
            R.id.mUserNameTv -> {
                afterLogin {
                    activity?.startActivity<SettingsActivity>()
                }
            }
        }
    }


}