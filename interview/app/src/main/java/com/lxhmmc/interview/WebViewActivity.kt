package com.lxhmmc.interview

import android.content.Intent
import android.os.Bundle
import android.support.v4.content.LocalBroadcastManager
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_web.*

class WebViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        println(intent.getStringExtra("name"))


        mWebView.loadUrl("https://www.baidu.com/")

        mTexttv.setOnClickListener {
            finish()
            System.exit(0)
        }

        mSendBtn.setOnClickListener {
//            val local = WebViewActivity@this.getBr

            val intent  = Intent("test")

            LocalBroadcastManager.getInstance(WebViewActivity@this).sendBroadcast(intent)

        }

    }

}
