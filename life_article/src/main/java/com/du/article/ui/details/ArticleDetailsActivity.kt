package com.du.article.ui.details

import android.os.Bundle
import butterknife.ButterKnife
import com.alibaba.android.arouter.facade.annotation.Route
import com.du.library.base.BaseActivity
import com.du.library.key.RouterKey
import cn.bmob.v3.exception.BmobException
import cn.bmob.v3.BmobArticle
import cn.bmob.v3.BmobQuery
import cn.bmob.v3.listener.FindListener
import com.du.article.R


/**
 * ClassName: ArticleDetailsActivity
 * Function: 文章详情
 * Date: 2020-09-15 - 10:52
 * Author 杜时光
 * Version 0.1
 */
@Route(path = RouterKey.ARTICLE_DETAILS_ACTIVITY)
class ArticleDetailsActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.article_activity_details)
        ButterKnife.bind(this)

        initView()
    }

    private fun initView() {
        queryArticle()
    }

    /**
     * 查询图文消息
     */
    private fun queryArticle() {
        val bmobArticleBmobQuery = BmobQuery<BmobArticle>()
        bmobArticleBmobQuery.findObjects(object : FindListener<BmobArticle>() {
            override fun done(list: List<BmobArticle>, e: BmobException?) {
                if (e == null) {

                } else {

                }
            }
        })
    }

}