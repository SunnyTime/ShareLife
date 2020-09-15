package com.du.library.init

import android.app.Application

/**
 * ClassName: BaseAppInit
 * Function: 初始化各个Module的Application
 * Date: 2020-04-22 - 10:09
 * Author 杜时光
 * Version 0.1
 */
interface BaseAppInit {
    /**
     * 高优先级被初始化
     * @param application
     * @return
     */
    fun onInitHighPriority(application: Application): Boolean

    /**
     * 低优先级被初始化
     * @param application
     * @return
     */
    fun onInitLowPriority(application: Application): Boolean
}