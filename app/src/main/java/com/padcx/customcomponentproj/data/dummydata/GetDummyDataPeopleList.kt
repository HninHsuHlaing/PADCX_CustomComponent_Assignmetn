package com.padcx.customcomponentproj.data.dummydata

import com.padcx.customcomponentproj.data.vos.PeopleEntity

fun getDummyDataPeopleList() : List<PeopleEntity> {
    var one = PeopleEntity()
    one.imageurl="https://images.assetsdelivery.com/compings_v2/gmast3r/gmast3r1511/gmast3r151100776.jpg"
    one.status  = "In progress"
    one. name  = "Design"
    one. title  = "Contact Page"
    one. messagecount  =20
    one. shareCount =10
    var two = PeopleEntity()
    two.imageurl="https://thumbs.dreamstime.com/b/man-hipster-avatar-cartoon-guy-black-hair-red-glasses-flat-icon-blue-background-user-person-character-vector-151711777.jpg"
    two.status  = "Done"
    two. name  = "Design"
    two. title  = "Calculator Page"
    two. messagecount  =50
    two. shareCount =60
    var three = PeopleEntity()
    three.imageurl="https://us.123rf.com/450wm/gmast3r/gmast3r1603/gmast3r160300768/54398279-business-man-profile-icon-male-avatar-hipster-style-fashion-cartoon-guy-beard-portrait-casual-busine.jpg?ver=6"
    three.status  = "Review"
    three. name  = "Backend"
    three. title  = "HomePage"
    three. messagecount  =20
    three. shareCount =40
    var four = PeopleEntity()
    four.imageurl="https://previews.123rf.com/images/photoplotnikov/photoplotnikov1604/photoplotnikov160400049/57872290-hipster-man-character-with-beard-hairstyle-and-glasses-in-flat-style-stylish-young-guy-on-background.jpg"
    four.status  = "Done"
    four. name  = "Frondend"
    four. title  = "Login Page"
    four. messagecount  =30
    four. shareCount =40
    return arrayListOf(one,two,three,four)

}