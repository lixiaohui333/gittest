package com.lxhmmc.goodscenter.data.repository

import com.lxhmmc.baselibrary.data.net.RetrofitFactory
import com.lxhmmc.baselibrary.data.protocol.BaseResp
import com.lxhmmc.goodscenter.data.api.CategoryApi
import com.lxhmmc.goodscenter.data.protocol.Category
import com.lxhmmc.goodscenter.data.protocol.GetCategoryReq
import io.reactivex.Observable
import javax.inject.Inject

class CategoryRepository @Inject constructor(){

    fun getCategory(parentId:Int): Observable<BaseResp<MutableList<Category>?>> {
        return RetrofitFactory.create(CategoryApi::class.java).getCategory(GetCategoryReq(parentId))
    }
}