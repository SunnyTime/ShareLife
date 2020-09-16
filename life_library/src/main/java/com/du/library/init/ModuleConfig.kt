package com.du.library.init

/**
 * ClassName: ModuleConfig
 * Function: 添加有个module需要维护其中信息
 * Date: 2020-04-22 - 10:27
 * Author 杜时光
 * Version 0.1
 * Copyright (c) 2017, www.leadfund.com.cn All Rights Reserved.
 * 上海利得金融科技集团版权所有.
 */
class ModuleConfig {
    companion object {
        //private const val moduleBaseAppInit = "com.du.library.init.ModuleBaseAppInit"
        private const val moduleHomeAppInit = "com.du.lifehome.init.ModuleHomeAppInit"//首页Module
        private const val moduleArticleAppInit = "com.du.article.init.ModuleArticleAppInit"//文章Module

        var moduleInit = arrayOf(moduleHomeAppInit, moduleArticleAppInit)
    }
}