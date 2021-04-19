package com.mobile.mqbus

import android.content.Context


class MQBus {

    companion object {

        const val TAG = "MQBus"

        fun with(context: Context): PipeOwer {
            return PipeOwer()
        }
    }
}