package com.lxhmmc.baselibrary.data.protocol

/**
 * @author lxh 2018/9/3.
 * @desc
 */
data class BaseResp<out T>(val success: Int, val timestamp: Long, val message: String, val data: T) {

    companion object {
        open val HTTP_OK = 1
    }

}