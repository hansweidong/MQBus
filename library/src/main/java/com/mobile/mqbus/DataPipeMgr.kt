package com.mobile.mqbus

import java.util.concurrent.ConcurrentHashMap


/**
 * @author wuweidong
 * @data 4/19/21
 * @time 4:39 PM
 * @note 数据管道管理器
 **/
class DataPipeMgr {

    companion object {
        const val TAG = "DataPipeMgr"
    }

    private var mDataPipeTee: DataPipeTee = DataPipeTee()

    var mPriorityMapQueue = ConcurrentHashMap<String, DataPipe>()

    private fun createDataPipe(pipeId: String) {
        val pipe = DataPipe()
        mPriorityMapQueue[pipeId] = pipe
    }

    fun addData(pipeId: String, dataItem: AbstractionDataItem) {
        mPriorityMapQueue[pipeId]?.add(dataItem)
    }

    //分发
    fun handout() {
        mPriorityMapQueue.values.forEach {
            val dataItem = it.handout()
        }
    }
}