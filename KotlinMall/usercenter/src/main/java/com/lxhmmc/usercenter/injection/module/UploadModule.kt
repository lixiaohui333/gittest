package com.lxhmmc.usercenter.injection.module

import com.lxhmmc.usercenter.service.UploadService
import com.lxhmmc.usercenter.service.UserService
import com.lxhmmc.usercenter.service.impl.UploadServiceImpl
import com.lxhmmc.usercenter.service.impl.UserServiceImpl
import dagger.Module
import dagger.Provides


@Module
class UploadModule {

    @Provides
    fun providesUploadService(service: UploadServiceImpl): UploadService {
        return service
    }
}