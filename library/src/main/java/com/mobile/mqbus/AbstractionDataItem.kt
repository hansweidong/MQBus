package com.mobile.mqbus

abstract class AbstractionDataItem<T> {

    companion object {
        const val TAG = "AbstractionDataItem"
    }

    /**
     * 消息是否需要延时
     */
    var delay = 0

    /**
     * 扩展实体，对外兼容
     */
    var extendEntry: T? = null
}