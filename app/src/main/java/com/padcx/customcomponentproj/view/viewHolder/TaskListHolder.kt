package com.padcx.customcomponentproj.view.viewHolder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.padcx.customcomponentproj.data.vos.PeopleEntity
import com.padcx.customcomponentproj.delegate.PeopleListItemDelegate
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.taskitemforrecycler.view.*

class TaskListHolder(itemView : View ,private val delegate: PeopleListItemDelegate) : AbstractTaskListHolder(itemView) {

    init {
        itemView.imageitem.setOnClickListener {
            mData?.let {
                delegate.onTapProfole()
            }
        }
//        itemView.imgfirpeople.setOnClickListener {
//          mData?.let {
//              delegate.onTapProfole()
//          }
//        }
//        itemView.imgsecondPeople.setOnClickListener {
//            mData?.let {
//                delegate.onTapProfole()
//            }
//        }
//        itemView.imgthirdpeople.setOnClickListener {
//            mData?.let {
//                delegate.onTapProfole()
//            }
//        }
//        itemView.imgaddpeople.setOnClickListener {
//            mData?.let {
//                delegate.onTapAddItem()
//            }
//        }
    }

    override fun bindData(data :PeopleEntity){
        mData = data
        itemView.tvprogress.text = data.status
        itemView.tvname.text = data.name
        itemView.tvtitle.text = data.title
        itemView.tvattachcount.text = data.shareCount.toString()
        itemView.tvmessaecount.text = data.messagecount.toString()

    }
}