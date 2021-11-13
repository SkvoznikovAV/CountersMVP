package com.example.countersmvp

import android.os.Bundle
import com.example.countersmvp.databinding.ActivityMainBinding
import moxy.MvpAppCompatActivity
import moxy.ktx.moxyPresenter

class MainActivity : MvpAppCompatActivity(), MainView {
    private var vb: ActivityMainBinding? = null
    private val presenter by moxyPresenter { MainPresenter(CountersModel()) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb?.root)

        vb?.btnCounter1?.setOnClickListener{ presenter.counter1Click() }
        vb?.btnCounter2?.setOnClickListener{ presenter.counter2Click() }
        vb?.btnCounter3?.setOnClickListener{ presenter.counter3Click() }
    }

    override fun showCounter1(text: String) {
        vb?.btnCounter1?.text = text
    }

    override fun showCounter2(text: String) {
        vb?.btnCounter2?.text = text
    }

    override fun showCounter3(text: String) {
        vb?.btnCounter3?.text = text
    }
}

