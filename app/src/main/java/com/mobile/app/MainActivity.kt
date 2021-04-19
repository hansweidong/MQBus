package com.mobile.app

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.mobile.mqbus.AbstractionDataItem
import com.mobile.mqbus.MQBus

class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ly_main_activity)
        MQBus.with(this).receive(::receive)
    }

    private fun receive(dataItem: AbstractionDataItem) {

    }
}