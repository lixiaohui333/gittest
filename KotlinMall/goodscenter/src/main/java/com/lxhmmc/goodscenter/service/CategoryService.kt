package com.lxhmmc.goodscenter.service

import com.lxhmmc.baselibrary.data.protocol.BaseResp
import com.lxhmmc.goodscenter.data.protocol.Category
import io.reactivex.Observable

interface CategoryService {
    fun getCategory(parentId:Int): Observable<MutableList<Category>?>
}