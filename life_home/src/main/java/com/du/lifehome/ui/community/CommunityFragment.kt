package com.du.lifehome.ui.community

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import butterknife.ButterKnife
import butterknife.Unbinder
import com.du.library.base.BaseFragment
import cn.bmob.v3.exception.BmobException
import cn.bmob.v3.BmobQuery
import cn.bmob.v3.listener.FindListener
import com.du.lifehome.R
import com.du.lifehome.bean.response.Articles
import com.du.log.Logger
import kotlinx.android.synthetic.main.home_fragment_community.*

/**
 * ClassName: CommunityFragment.kt
 * Function: 社区
 * Date: 2020-09-02 - 15:03
 * Author 杜时光
 * version 0.1
 */
class CommunityFragment : BaseFragment() {
    private lateinit var binder: Unbinder
    private lateinit var adapter: CommunityRecycleAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.home_fragment_community, container, false)
        binder = ButterKnife.bind(this, root)
        return root
    }

    override fun onResume() {
        super.onResume()
        initView()
    }

    private fun initView() {
        activity?.let { it ->
            val linearLayoutManager = LinearLayoutManager(it.baseContext)
            recyclerView.layoutManager = linearLayoutManager

            context?.let {
                adapter = CommunityRecycleAdapter(it)
                recyclerView.adapter = adapter
                query()
            }
        }
    }

    /**
     * 查询多条数据
     */
    private fun query() {
        val bmobQuery = BmobQuery<Articles>()
        bmobQuery.findObjects(object : FindListener<Articles>() {
            override fun done(articles: List<Articles>, e: BmobException?) {
                if (e == null) {
                    adapter.addData(articles)
                    adapter.notifyDataSetChanged()

                    Logger.t("CommunityFragment").e("查询成功")
                } else {
                    Logger.t("CommunityFragment").e(e.toString())
                }
            }
        })
    }

    override fun onDestroy() {
        super.onDestroy()
        binder.unbind()
    }
}