package com.mobile.mqbus

/**
 * @author wuweidong
 * @data 4/19/21
 * @time 5:49 PM
 * @note
 **/
class PipeOwer {

    companion object {
        const val TAG = "PipeOwer"
    }

    private var pipeId: String = ""
        get() = this.toString()

    init {

    }

    /**
     * @param function 接收数据的函数
     */
    fun receive(function: (dataItem: AbstractionDataItem) -> Unit) {

    }
}