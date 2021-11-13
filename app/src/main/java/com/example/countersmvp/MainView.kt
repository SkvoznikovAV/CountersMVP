package com.example.countersmvp

import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType

@StateStrategyType(AddToEndSingleStrategy::class)
interface MainView :MvpView {
    fun showCounter1(text: String)
    fun showCounter2(text: String)
    fun showCounter3(text: String)
}