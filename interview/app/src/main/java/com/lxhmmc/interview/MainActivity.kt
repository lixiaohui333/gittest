package com.lxhmmc.interview

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.support.v4.content.LocalBroadcastManager
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var receiver: MyBroadcast
    lateinit var local: LocalBroadcastManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        mStartBtn.setOnClickListener {
            val intent = Intent(MainActivity@ this, WebViewActivity::class.java)
            intent.putExtra("name", "lxh")
            startActivity(intent)

        }


        val filter = IntentFilter()
        filter.addAction("test")

        receiver = MyBroadcast()
        local = LocalBroadcastManager.getInstance(this)
        local.registerReceiver(receiver, filter)

    }

    class MyBroadcast : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            println("----------------"+intent?.action+"-------")
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        local.unregisterReceiver(receiver)
    }

}
