package com.example.countersmvp

import moxy.MvpPresenter

class MainPresenter(private val model: CountersModel) : MvpPresenter<MainView>() {

    fun counter1Click(){
        viewState.showCounter1(getNextValue(0))
    }

    fun counter2Click(){
        viewState.showCounter2(getNextValue(1))
    }

    fun counter3Click(){
        viewState.showCounter3(getNextValue(2))
    }

    private fun getNextValue(index: Int):String =
        model.next(index).toString()

}
