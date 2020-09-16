package com.du.library.key

/**
 * ClassName: RouterKey
 * Function: 路由表
 * Date: 2019-11-05 - 19:03
 * Author 杜时光
 * Version 0.1
 * Copyright (c) 2017, www.leadfund.com.cn All Rights Reserved.
 * 上海利得金融科技集团版权所有.
 */
class RouterKey {
    companion object {
        //home
        const val HOME_ACTIVITY = "/home/HomeActivity"

        //article
        const val ARTICLE_DETAILS_ACTIVITY = "/article/ArticleDetailsActivity"

        var map = mapOf(
            HOME_ACTIVITY to "0",
            ARTICLE_DETAILS_ACTIVITY to "1"
        )
    }
}