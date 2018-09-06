package com.lxhmmc.baselibrary.rx

import com.kotlin.base.rx.BaseException
import io.reactivex.disposables.Disposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer

class BaseConsumer {

    companion object {

        open fun throwable(): Consumer<Throwable> {
            return Consumer<Throwable>{
                it as BaseException
                println(it)
            }
        }

        open fun start(): Consumer<Disposable> {
            return Consumer<Disposable> { println("start") }
        }

        open fun finish(): Action {
            return Action { println("finish") }
        }


    }

}