package com.lxhmmc.usercenter.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.lxhmmc.usercenter.R
import kotlinx.android.synthetic.main.activity_regist.*

class RegistActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regist)

        mRegistBtn.setOnClickListener{
            Toast.makeText(this,"注册",Toast.LENGTH_SHORT).show()
        }
    }
}
