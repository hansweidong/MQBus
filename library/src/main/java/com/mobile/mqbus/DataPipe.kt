package com.mobile.mqbus

import java.util.concurrent.PriorityBlockingQueue
import kotlin.Comparator

/**
 * @author wuweidong
 * @data 4/19/21
 * @time 4:38 PM
 * @note 数据管道
 **/
class DataPipe {

    enum class PipeState {
        Open,  //管道处于打开状态
        Close, //管道处于关闭状态
        Pause  //管道处于暂停状态
    }

    companion object {
        const val TAG = "DataPipe"
        const val MaxDataFlowSize = 200
    }

    private var pipeQueue = PriorityBlockingQueue<AbstractionDataItem>(MaxDataFlowSize,
            Comparator<AbstractionDataItem> { o1, o2 -> (o1?.priority ?: 0) - (o2?.priority ?: 0) })

    //管道的状态
    var pipeState: PipeState =  PipeState.Open

    //管道ID
    var pipeId = ""

    //管道优先级，值越低 优先级越高
    var priority = 0

    fun add(dataItem: AbstractionDataItem) {
        if (pipeState == PipeState.Close) {
            //管道已经关闭，不再接纳数据进来
            return
        }
        if (pipeQueue.size > MaxDataFlowSize) {
            //超过容量不再添加
            return
        }
        pipeQueue.add(dataItem)
    }

    //分发
    fun handout(): AbstractionDataItem? = pipeQueue.poll()

    fun open() {
        pipeState = PipeState.Open
    }

    fun close() {
        pipeState = PipeState.Close
    }

    fun pause() {
        pipeState = PipeState.Pause
    }
}