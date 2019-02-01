package com.climaconsulta.view

interface MainActivityView {

    fun showCurrentCity()
    fun showMainWeather()
    fun showFiveDaysWeather()
    fun showError(error: String)
}