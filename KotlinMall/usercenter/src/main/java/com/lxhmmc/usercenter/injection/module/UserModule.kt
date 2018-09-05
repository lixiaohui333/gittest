package com.lxhmmc.usercenter.injection.module

import com.lxhmmc.usercenter.service.UserService
import com.lxhmmc.usercenter.service.impl.UserServiceImpl
import dagger.Module
import dagger.Provides


@Module
class UserModule {

    @Provides
    fun providesUserService(service: UserServiceImpl):UserService{
        return service
    }
}