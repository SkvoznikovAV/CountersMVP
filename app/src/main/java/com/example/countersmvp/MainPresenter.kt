package com.example.countersmvp

class MainPresenter(private val view: MainView, private val model: CountersModel) {

    fun counter1Click(){
        view.showCounter1(getNextValue(0))
    }

    fun counter2Click(){
        view.showCounter2(getNextValue(1))
    }

    fun counter3Click(){
        view.showCounter3(getNextValue(2))
    }

    private fun getNextValue(index: Int):String =
        model.next(index).toString()

}
