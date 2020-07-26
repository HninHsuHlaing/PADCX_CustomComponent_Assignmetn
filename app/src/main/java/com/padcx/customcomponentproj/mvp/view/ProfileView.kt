package com.padcx.customcomponentproj.mvp.view

import com.padcx.customcomponentproj.data.vos.PeopleEntity

interface ProfileView: BaseView {
    fun displayPeopleList(list: List<PeopleEntity>)
    fun navigateToProfileScreen()
    fun navigateToCreateTask()
}