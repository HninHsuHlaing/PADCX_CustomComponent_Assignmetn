package com.padcx.customcomponentproj.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padcx.customcomponentproj.R
import com.padcx.customcomponentproj.view.viewHolder.FragmentUserRecyclerViewHolder
import com.padcx.customcomponentproj.view.viewHolder.TaskListHolder

class FragmentUserRecyclerAdapter :RecyclerView.Adapter<FragmentUserRecyclerViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FragmentUserRecyclerViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.taskitemforrecycler, parent, false)
        return FragmentUserRecyclerViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: FragmentUserRecyclerViewHolder, position: Int) {

    }

}