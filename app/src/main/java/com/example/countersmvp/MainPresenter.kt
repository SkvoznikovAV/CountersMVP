package com.example.countersmvp

class MainPresenter(private val view: MainView) {
    private val model = CountersModel()

    fun counterClick(index: Int){
       val nextValue = model.next(index).toString()

       when (index) {
            0 -> view.setButtonText1(nextValue)
            1 -> view.setButtonText2(nextValue)
            2 -> view.setButtonText3(nextValue)
       }
    }
}
