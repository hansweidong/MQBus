package com.mobile.mqbus

/**
 * @author wuweidong
 * @data 4/19/21
 * @time 4:38 PM
 * @note 数据管道
 **/
class DataPipe {

    companion object {
        const val TAG = "DataPipe"
    }

    /**
     * 管道优先级
     */
    var property = 0

    fun open() {}

    fun close() {}

    fun pause() {}
}