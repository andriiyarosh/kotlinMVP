package com.example.mvp.model

import com.example.mvp.interfaces.FirstInterface

class MainActivityModel: FirstInterface.Model {

    private var mCounter = 0

    override fun getCounter() = mCounter

    override fun incrementCounter() {
        mCounter++
    }
}