package com.du.lifehome.init

import com.du.library.base.BaseApplication


/**
 * ClassName: HomeApplication
 * Function: HomeApplication
 * Date: 2020-06-19 - 10:40
 * Author 杜时光
 * Version 0.1
 */
class HomeApplication : BaseApplication() {
    override fun onCreate() {
        super.onCreate()
        val app = ModuleHomeAppInit()
        app.onInitHighPriority(this)
    }

}