package com.du.library.base

import android.view.View
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

/**
 * ClassName: BaseRecycleAdapter
 * Function:
 * Date: 2020-09-14 - 13:43
 * Author 杜时光
 * Version 0.1
 */
abstract class BaseRecycleAdapter<T, A : BaseRecycleAdapter.ViewHolder> :
    RecyclerView.Adapter<A>() {
    var listData: MutableList<T> = ArrayList()

    fun addData(data: List<T>?) {
        if (null != data) listData.addAll(data)
    }

    fun cleanData() {
        listData.clear()
    }

    open class ViewHolder(@NonNull itemView: View) : RecyclerView.ViewHolder(itemView)
}