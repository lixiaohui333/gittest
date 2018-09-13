package com.lxhmmc.goodscenter.service.impl

import com.lxhmmc.baselibrary.data.protocol.BaseResp
import com.lxhmmc.goodscenter.data.protocol.Category
import com.lxhmmc.goodscenter.data.repository.CategoryRepository
import com.lxhmmc.goodscenter.service.CategoryService
import io.reactivex.Observable
import javax.inject.Inject

class CategoryServiceImpl @Inject constructor() : CategoryService {


    @Inject
    lateinit var categoryRepository: CategoryRepository

    override fun getCategory(parentId: Int): Observable<BaseResp<MutableList<Category>?>> {
        return categoryRepository.getCategory(parentId)
    }

}