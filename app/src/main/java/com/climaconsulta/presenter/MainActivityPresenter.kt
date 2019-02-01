package com.climaconsulta.presenter

interface MainActivityPresenter {

    abstract fun getCurrentCity()
    abstract fun getMainWeather()
    abstract fun getFiveDaysWheather()

    abstract fun showResult()
    abstract fun showError(error: String)
}