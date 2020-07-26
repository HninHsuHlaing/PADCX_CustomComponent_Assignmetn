package com.padcx.customcomponentproj.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padcx.customcomponentproj.R
import com.padcx.customcomponentproj.data.dummydata.getDummyDataPeopleList
import com.padcx.customcomponentproj.data.vos.PeopleEntity
import com.padcx.customcomponentproj.delegate.PeopleListItemDelegate
import com.padcx.customcomponentproj.view.viewHolder.TaskListHolder

class TaskListAdapter(private val delegate: PeopleListItemDelegate):RecyclerView.Adapter<TaskListHolder>() {
    var mData : List<PeopleEntity> = getDummyDataPeopleList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskListHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.taskitemforrecycler, parent, false)
        return TaskListHolder(view,delegate)
    }

    override fun getItemCount(): Int {
        return  mData.count()
    }

    override fun onBindViewHolder(holder: TaskListHolder, position: Int) {
        holder.bindData(mData[position])
    }
    fun setNewData(data : List<PeopleEntity>){
        mData = data
        notifyDataSetChanged()
    }
}