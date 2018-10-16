package com.lxhmmc.baselibrary.presenter

import com.lxhmmc.baselibrary.presenter.view.BaseView
import io.reactivex.Observer
import io.reactivex.disposables.Disposable

/**
 * @author lxh 2018/10/5.
 * @desc
 */
abstract class  BaseBooleanObserver : Observer<Boolean> {

    val mBaseView:BaseView

    constructor(mView: BaseView) {
        this.mBaseView = mView
    }

    abstract fun success()


    override fun onNext(t: Boolean) {
        if (t){
            success()
        }else{
            mBaseView.onError("失败")
        }
    }

    override fun onComplete() {
        mBaseView.hideLoading()
    }

    override fun onSubscribe(d: Disposable) {

    }

    override fun onError(e: Throwable) {
        mBaseView.onError("异常")
    }
}