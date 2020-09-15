package com.du.lifehome.bean.response

import cn.bmob.v3.BmobObject

/**
 * ClassName: ArticleList
 * Function: 文章
 * Date: 2020-09-14 - 14:56
 * Author 杜时光
 * Version 0.1
 */
data class Articles(var title: String, var author: String, var time: String, var intro: String)
    : BmobObject()