package com.example.countersmvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.countersmvp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainView {
    private var vb: ActivityMainBinding? = null
    private val presenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb?.root)

        vb?.btnCounter1?.setOnClickListener{ presenter.counterClick(0) }
        vb?.btnCounter2?.setOnClickListener{ presenter.counterClick(1) }
        vb?.btnCounter3?.setOnClickListener{ presenter.counterClick(2) }
    }

    override fun setButtonText1(text: String) {
        vb?.btnCounter1?.text = text
    }

    override fun setButtonText2(text: String) {
        vb?.btnCounter2?.text = text
    }

    override fun setButtonText3(text: String) {
        vb?.btnCounter3?.text = text
    }
}

