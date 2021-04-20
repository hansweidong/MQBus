package com.mobile.mqbus

import java.lang.ref.WeakReference

/**
 * @author wuweidong
 * @data 4/19/21
 * @time 5:49 PM
 * @note
 **/
class PipeOwer: AbstractionPipeOwer() {

    companion object {
        const val TAG = "PipeOwer"
    }

    private var pipeId: String = ""
        get() = pipeId()

    var mFuncRefWek: WeakReference<((dataItem: AbstractionDataItem) -> Unit)?>? = null

    /**
     * @param function 接收数据的函数
     */
    fun receive(function: (dataItem: AbstractionDataItem) -> Unit) {
        mFuncRefWek = WeakReference(function)
    }
}