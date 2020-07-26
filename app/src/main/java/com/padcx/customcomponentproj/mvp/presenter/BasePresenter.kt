package com.padcx.customcomponentproj.mvp.presenter

import android.view.View
import com.padcx.customcomponentproj.mvp.view.BaseView

interface BasePresenter<T : BaseView> {

    fun initPresenter(view : T)
}