package com.example.mvp.interfaces

interface FirstInterface {

    interface View {
        fun initView()
        fun updateViewData()
    }

    interface Presenter {
        fun incrementValue ()
        fun getCounter(): String
    }

    interface Model {
        fun getCounter() : Int
        fun incrementCounter()
    }

}