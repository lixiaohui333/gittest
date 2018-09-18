package com.lxhmmc.provider.common

import com.alibaba.android.arouter.launcher.ARouter
import com.kotlin.base.utils.AppPrefsUtils
import com.lxhmmc.baselibrary.common.Constant
import com.lxhmmc.provider.router.RouterPath

fun isLogined(): Boolean {
    return AppPrefsUtils.getString(Constant.KEY_SP_TOKEN).isNotEmpty()
}

fun afterLogin(method: () -> Unit) {

    if (isLogined()) {
        method()
    } else {
        ARouter.getInstance().build(RouterPath.UserCenter.PATH_LOGIN).navigation()
    }
}