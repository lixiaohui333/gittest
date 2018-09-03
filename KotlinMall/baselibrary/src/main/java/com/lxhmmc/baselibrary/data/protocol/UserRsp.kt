package com.lxhmmc.baselibrary.data.protocol

/**
 * @author lxh 2018/9/3.
 * @desc
 */
data class UserRsp(
        val customer_id: String,
        val customer_group_id: String,
        val name: String,
        val telephone: String,
        val image: String,
        val order_count: String,
        val collect_count: String,
        val comment_count: String,
        val message_count: Int,
        val token: String,
        val registration_id: Any
)