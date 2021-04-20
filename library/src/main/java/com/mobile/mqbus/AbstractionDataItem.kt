package com.mobile.mqbus

/**
 * 数据的抽象对象
 */
abstract class AbstractionDataItem {

    companion object {
        const val TAG = "AbstractionDataItem"
    }

    //消息是否需要延时
    var delay = 0

    //优先级
    var priority: Int = 0
}