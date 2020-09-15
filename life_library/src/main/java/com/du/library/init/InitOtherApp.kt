package com.du.library.init

import android.app.Application
import android.util.Log
import com.alibaba.android.arouter.launcher.ARouter
import com.du.log.Logger

/**
 * ClassName: InitOtherApp
 * Function: InitOtherApp
 * Date: 2020-06-16 - 13:42
 * Author 杜时光
 * Version 0.1
 */
class InitOtherApp(val app: Application) {
    /**
     * 高优先级初始化
     */
    fun initModuleHighPriority() {
        //必须在init之前
        ARouter.openLog()//打印日志
        ARouter.openDebug()//线上版本需要关闭

        //官方推荐在Application中初始化
        ARouter.init(app)

        for (init in ModuleConfig.moduleInit) {
            try {
                Logger.t("InitOtherApp").e("Class.forName(init)" + Class.forName(init))
                val clazz = Class.forName(init)
                val appInit = clazz.newInstance() as BaseAppInit
                val b = appInit.onInitHighPriority(instance())
                Logger.t("InitOtherApp").e("b==>$b")
            } catch (e: ClassNotFoundException) {
                e.printStackTrace()
            } catch (e: IllegalAccessException) {
                e.printStackTrace()
            } catch (e: InstantiationException) {
                e.printStackTrace()
            }

        }
    }

    /**
     * 低优先级初始化
     */
    private fun initModuleLowPriority() {
        for (init in ModuleConfig.moduleInit) {
            try {
                val clazz = Class.forName(init)
                val appInit = clazz.newInstance() as BaseAppInit
                appInit.onInitLowPriority(app)
            } catch (e: ClassNotFoundException) {
                e.printStackTrace()
            } catch (e: IllegalAccessException) {
                e.printStackTrace()
            } catch (e: InstantiationException) {
                e.printStackTrace()
            }

        }
    }

    private fun instance(): Application {
        return app
    }
}