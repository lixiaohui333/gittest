package com.lxhmmc.usercenter.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.lxhmmc.usercenter.R
import kotlinx.android.synthetic.main.activity_regist.*
import org.jetbrains.anko.*

class TestActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regist)


//        mRegistBtn.setOnClickListener {
//            startActivity<RegistActivity>()
//        }
//        mVerifyBtn.setOnClickListener { startActivity(intentFor<RegistActivity>().clearTop()) }


    }

}