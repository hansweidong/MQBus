package com.mobile.mqbus

/**
 * @note 数据中心池
 */
class DataCenterPool : IDataCenterInterface {

    companion object {
        const val TAG = "DataCenter"

        @JvmStatic
        val instance by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
            DataCenterPool()
        }
    }

    private var mDataPipeMgr : DataPipeMgr = DataPipeMgr()

    override fun putData() {

    }
}