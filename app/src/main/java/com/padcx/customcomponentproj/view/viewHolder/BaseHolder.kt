package com.padcx.customcomponentproj.view.viewHolder

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseHolder<T>(itemView :View) :RecyclerView.ViewHolder(itemView) {
var mData : T? = null
    abstract fun bindData(data :T)

}