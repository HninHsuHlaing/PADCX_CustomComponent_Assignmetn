package com.padcx.customcomponentproj.mvp.view

import com.padcx.customcomponentproj.data.vos.PeopleEntity

interface MainView :BaseView {
    fun displayPeopleList(list: List<PeopleEntity>)
    fun navigateToProfileScreen()
    fun navigateToCreateTask()
}