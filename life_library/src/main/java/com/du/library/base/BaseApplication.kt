package com.du.library.base

import android.app.Application
import cn.bmob.v3.Bmob
import com.alibaba.android.arouter.launcher.ARouter
import com.du.library.init.InitOtherApp
import com.du.log.AndroidLogAdapter
import com.du.log.Logger
import com.du.log.PrettyFormatStrategy

/**
 * ClassName: BaseApplication
 * Function:
 * Date: 2020-07-28 - 15:55
 * Author 杜时光
 * Version 0.1
 */
open class BaseApplication : Application() {

    private val TAG = BaseApplication::class.java.simpleName
    //private val isDebugARouter = true

    companion object {
        private var baseInstance: BaseApplication? = null

        fun instance() = baseInstance!!
    }

    override fun onCreate() {
        super.onCreate()
        baseInstance = this

        //必须在init之前
        ARouter.openLog()//打印日志
        ARouter.openDebug()//线上版本需要关闭

        //官方推荐在Application中初始化
        ARouter.init(baseInstance)

        initLog()

        InitOtherApp(this).initModuleHighPriority()

        initBmob()
    }

    private fun initLog() {

        val formatStrategy = PrettyFormatStrategy.newBuilder()
            .showThreadInfo(false)  // (Optional) Whether to show thread info or not. Default true
            .methodCount(1)         // (Optional) How many method line to show. Default 2
            //.methodOffset(5)        // (Optional) Hides internal method calls up to offset. Default 5 设置调用堆栈的函数偏移值，默认是 5
            //.logStrategy(ls) // (Optional) Changes the log strategy to print out. Default LogCat
            .tag("life_Log/")   // (Optional) Global tag for every log. Default PRETTY_LOGGER
            .build()

        Logger.addLogAdapter(object : AndroidLogAdapter(formatStrategy) {
            override fun isLoggable(priority: Int, tag: String): Boolean {
                return true
            }
        }) // 自定义一个打印适配器
    }

    private fun initBmob() {
        Bmob.initialize(this, "2dee6602392ad30c78913042e3592ea9")
    }
}