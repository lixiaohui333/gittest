package com.lxhmmc.baselibrary.ext

import com.lxhmmc.baselibrary.rx.BaseConsumer
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers


fun <T> Observable<T>.execute(consumer:Consumer<T>) {

    this.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
            .subscribe(consumer, BaseConsumer.throwable(), BaseConsumer.finish(), BaseConsumer.start())
}