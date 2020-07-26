package com.padcx.customcomponentproj.mvp.presenter

import androidx.lifecycle.LifecycleOwner
import com.padcx.customcomponentproj.delegate.PeopleListItemDelegate
import com.padcx.customcomponentproj.mvp.view.MainView

interface MainPresenter :BasePresenter<MainView>, PeopleListItemDelegate {

    fun onUiReady(lifeCycleOwner: LifecycleOwner)
}