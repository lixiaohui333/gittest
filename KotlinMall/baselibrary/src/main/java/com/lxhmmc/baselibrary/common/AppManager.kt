package com.lxhmmc.baselibrary.common

import android.app.Activity
import android.app.ActivityManager
import android.content.Context
import java.util.*

object AppManager {

    private val activityStack: Stack<Activity> = Stack()
    fun addActivity(activity: Activity) {
        activityStack.add(activity)
    }

    fun finishActivity(activity: Activity) {
        activity.finish()
        activityStack.remove(activity)
    }

    fun currentActivity(): Activity {
        return activityStack.lastElement();
    }

    fun finishAllAcitivty(){
        activityStack.forEach { it.finish() }
        activityStack.clear()
    }

    fun exitApp(context:Context){
        finishAllAcitivty()
        val activitymanager = context.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        activitymanager.killBackgroundProcesses(context.packageName)
        System.exit(0)
    }
}