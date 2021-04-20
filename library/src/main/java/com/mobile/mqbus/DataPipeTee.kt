package com.mobile.mqbus

import java.util.concurrent.ConcurrentLinkedQueue

/**
 * @author wuweidong
 * @data 4/19/21
 * @time 5:15 PM
 * @note 数据管道分流器
 **/
class DataPipeTee {

    companion object {
        const val TAG = "DataPipeTee"
    }

    private var mPipeList: ConcurrentLinkedQueue<DataPipe> = ConcurrentLinkedQueue()
}