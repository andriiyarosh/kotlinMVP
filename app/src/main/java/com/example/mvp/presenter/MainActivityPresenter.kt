package com.example.mvp.presenter

import com.example.mvp.interfaces.FirstInterface
import com.example.mvp.model.MainActivityModel

class MainActivityPresenter (_view: FirstInterface.View): FirstInterface.Presenter {

    private var view: FirstInterface.View = _view
    private var model: FirstInterface.Model = MainActivityModel()

    init {
        view.initView()
    }

    override fun incrementValue() {
        model.incrementCounter()
        view.updateViewData()
    }

    override fun getCounter() = model.getCounter().toString()
    
}