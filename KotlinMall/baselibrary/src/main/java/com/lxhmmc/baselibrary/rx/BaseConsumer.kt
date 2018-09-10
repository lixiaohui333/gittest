package com.lxhmmc.baselibrary.rx

import com.kotlin.base.rx.BaseException
import com.lxhmmc.baselibrary.presenter.view.BaseView
import io.reactivex.disposables.Disposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer

class BaseConsumer {

    companion object {

        open fun throwable(): Consumer<Throwable> {
            return Consumer<Throwable> {
                it as BaseException
                println(it)
            }
        }

        open fun start(mView: BaseView? = null): Consumer<Disposable> {
            return Consumer<Disposable> {
                mView?.showLoading()
                println("okhttp start")
            }
        }

        open fun finish(mView: BaseView? = null): Action {
            return Action {
                mView?.hideLoading()
                println("okhttp finish")
            }
        }


    }

}