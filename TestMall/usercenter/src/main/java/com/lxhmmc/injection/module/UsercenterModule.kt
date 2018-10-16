package com.lxhmmc.injection.module

import com.lxhmmc.baselibrary.injection.PerComponentScope
import com.lxhmmc.service.RegistService
import com.lxhmmc.service.impl.RegistServiceImpl
import dagger.Module
import dagger.Provides

/**
 * @author lxh 2018/10/6.
 * @desc
 */

@Module
class UsercenterModule  {

    @Provides
    fun providesUserService(service:RegistServiceImpl) :RegistService{
        return service
    }
}