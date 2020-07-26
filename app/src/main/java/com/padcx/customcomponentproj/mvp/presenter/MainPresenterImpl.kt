package com.padcx.customcomponentproj.mvp.presenter

import android.widget.ImageView
import androidx.lifecycle.LifecycleOwner
import com.padcx.customcomponentproj.data.dummydata.getDummyDataPeopleList
import com.padcx.customcomponentproj.mvp.view.MainView

class MainPresenterImpl :MainPresenter, AbstractBasePresenter<MainView>() {
    override fun onUiReady(lifeCycleOwner: LifecycleOwner) {
        mView?.displayPeopleList(getDummyDataPeopleList())
    }

    override fun onTapProfole() {
        mView?.navigateToProfileScreen()
    }

    override fun onTapAddItem() {
        mView?.navigateToCreateTask()
    }


}