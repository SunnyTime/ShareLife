package com.du.library.init

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter

/**
 * ClassName: ModuleAppAppInit
 * Function: 多module 初始化方法
 * Date: 2020-04-22 - 10:21
 * Author 杜时光
 * Version 0.1
 */
class ModuleBaseAppInit : BaseAppInit {
    val TAG = "ModuleAppAppInit====>"

    override fun onInitHighPriority(application: Application): Boolean {
        ARouter.openLog()//打印日志
        ARouter.openDebug()//线上版本需要关闭
        //官方推荐在Application中初始化
        ARouter.init(application)
        return true
    }

    override fun onInitLowPriority(application: Application): Boolean {
        return true
    }
}