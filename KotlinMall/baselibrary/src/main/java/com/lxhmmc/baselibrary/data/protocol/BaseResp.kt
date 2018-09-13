package com.lxhmmc.baselibrary.data.protocol

/**
 * @author lxh 2018/9/3.
 * @desc
 */
data class BaseResp<out T>(val status: Int, val message: String, val data: T) {

    companion object {
        const val HTTP_OK = 0
    }

}