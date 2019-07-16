package com.example.mvp.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.mvp.R
import com.example.mvp.interfaces.FirstInterface
import com.example.mvp.presenter.MainActivityPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), FirstInterface.View {

    private var presenter: MainActivityPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainActivityPresenter(this)
    }

    override fun initView() {
        number.text = presenter?.getCounter()
        buttonClick.setOnClickListener {
            presenter?.incrementValue()
        }
    }

    override fun updateViewData() {
        number.text = presenter?.getCounter()
    }
}
