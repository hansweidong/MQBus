package com.mobile.mqbus

import kotlin.random.Random

/**
 * @author wuweidong
 * @data 4/20/21
 * @time 5:37 PM
 * @note
 **/
abstract class AbstractionPipeOwer {

    //PipeOwer 的 ID
    protected fun pipeId() : String {
        return String.format("%d_%d",Random(Int.MAX_VALUE), hashCode())
    }
}