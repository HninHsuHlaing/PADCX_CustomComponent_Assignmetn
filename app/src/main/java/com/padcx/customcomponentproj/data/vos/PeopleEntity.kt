package com.padcx.customcomponentproj.data.vos

data class PeopleEntity(
    var status : String = "",
    var name : String = "",
    var title : String = "",
    var imageurl : String = "",
    var messagecount : Int =0,
    var shareCount : Int=0
)