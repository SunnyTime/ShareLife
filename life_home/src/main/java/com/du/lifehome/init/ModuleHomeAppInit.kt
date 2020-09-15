package com.du.lifehome.init

import android.app.Application
import android.util.Log
import com.alibaba.android.arouter.launcher.ARouter
import com.du.library.init.BaseAppInit
import com.du.log.AndroidLogAdapter
import com.du.log.Logger
import com.du.log.PrettyFormatStrategy

/**
 * ClassName: ModuleHomeAppInit
 * Function: ModuleHomeAppInit
 * Date: 2020-06-16 - 13:42
 * Author 杜时光
 * Version 0.1
 */
class ModuleHomeAppInit : BaseAppInit {
    val TAG = "ModuleHomeAppInit====>"

    companion object {
        private var instance: Application? = null
        fun instance() = instance!!
    }

    override fun onInitHighPriority(application: Application): Boolean {
        Logger.t(TAG).e("onInitHighPriority")
        //必须在init之前
        ARouter.openLog()//打印日志
        ARouter.openDebug()//线上版本需要关闭

        //官方推荐在Application中初始化
        ARouter.init(application)

        instance = application

        return true
    }

    override fun onInitLowPriority(application: Application): Boolean {
        Logger.e(TAG, "onInitLowPriority")
        return true
    }
}