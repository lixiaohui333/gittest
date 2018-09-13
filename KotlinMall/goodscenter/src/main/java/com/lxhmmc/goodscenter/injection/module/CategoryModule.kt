package com.lxhmmc.goodscenter.injection.module

import com.lxhmmc.goodscenter.service.CategoryService
import com.lxhmmc.goodscenter.service.impl.CategoryServiceImpl
import dagger.Module
import dagger.Provides


@Module
class CategoryModule {

    @Provides
    fun provideCategoryService(categoryService: CategoryServiceImpl): CategoryService {
        return categoryService
    }

}