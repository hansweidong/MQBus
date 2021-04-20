package com.mobile.mqbus

/**
 * @note 数据中心池
 */
class DataCenterPool {

    companion object {
        const val TAG = "DataCenter"

        @JvmStatic
        val instance by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
            DataCenterPool()
        }
    }

    inner class PipeBuilder {



    }

    private var mDataPipeMgr : DataPipeMgr = DataPipeMgr()

    fun putData(pipeId: String, dataItem: AbstractionDataItem) {
        mDataPipeMgr.mPriorityMapQueue[pipeId]?.add(dataItem)
    }

    fun openPipe(pipeId: String) {
        mDataPipeMgr.mPriorityMapQueue[pipeId]?.open()
    }

    fun closePipe(pipeId: String) {
        mDataPipeMgr.mPriorityMapQueue[pipeId]?.close()
    }

    fun pausePipe(pipeId: String) {
        mDataPipeMgr.mPriorityMapQueue[pipeId]?.pause()
    }

    fun openAllPipe() {
        mDataPipeMgr.mPriorityMapQueue.values.forEach {
            it.open()
        }
    }

    fun closeAllPipe() {
        mDataPipeMgr.mPriorityMapQueue.values.forEach {
            it.close()
        }
    }
}