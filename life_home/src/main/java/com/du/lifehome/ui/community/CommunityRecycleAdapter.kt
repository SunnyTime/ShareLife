package com.du.lifehome.ui.community

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import com.alibaba.android.arouter.launcher.ARouter
import com.du.library.base.BaseRecycleAdapter
import com.du.library.key.RouterKey
import com.du.lifehome.R
import com.du.lifehome.bean.response.Articles

/**
 * ClassName: CommunityRecycleAdapter
 * Function:
 * Date: 2020-09-14 - 14:51
 * Author 杜时光
 * Version 0.1
 * Copyright (c) 2017, www.leadfund.com.cn All Rights Reserved.
 * 上海利得金融科技集团版权所有.
 */
class CommunityRecycleAdapter(private val context: Context) : BaseRecycleAdapter<Articles, RecycleViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): RecycleViewHolder {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.home_item_community_recycle, viewGroup, false)
        return RecycleViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    override fun onBindViewHolder(holder: RecycleViewHolder, position: Int) {
        val bean = listData[position]
        holder.title.text = bean.title
        holder.intro.text = bean.intro
        holder.author.text = bean.author
        holder.time.text = bean.time

        holder.content.setOnClickListener {
            ARouter.getInstance().build(RouterKey.ARTICLE_DETAILS_ACTIVITY).navigation()
        }
    }
}

class RecycleViewHolder(itemView: View) : BaseRecycleAdapter.ViewHolder(itemView) {
    var title: TextView = itemView.findViewById<View>(R.id.title) as TextView
    var intro: TextView = itemView.findViewById<View>(R.id.intro) as TextView
    var author: TextView = itemView.findViewById<View>(R.id.author) as TextView
    var time: TextView = itemView.findViewById<View>(R.id.time) as TextView
    var content:LinearLayout = itemView.findViewById<View>(R.id.content) as LinearLayout
}