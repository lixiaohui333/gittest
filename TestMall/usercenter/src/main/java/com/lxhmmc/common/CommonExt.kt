package com.lxhmmc.common

import com.lxhmmc.baselibrary.presenter.BaseBooleanObserver
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * @author lxh 2018/10/5.
 * @desc
 */


fun Observable<Boolean>.executeBoolean(baseBooleanObserver: BaseBooleanObserver){

    this.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
            .subscribe(baseBooleanObserver)

}