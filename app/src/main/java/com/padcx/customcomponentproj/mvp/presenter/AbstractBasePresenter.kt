package com.padcx.customcomponentproj.mvp.presenter

import androidx.lifecycle.ViewModel
import com.padcx.customcomponentproj.mvp.view.BaseView

abstract class AbstractBasePresenter<T:BaseView> : BasePresenter<T> ,ViewModel(){

    var mView : T? = null
    override fun initPresenter(view: T) {
        mView = view
    }

}