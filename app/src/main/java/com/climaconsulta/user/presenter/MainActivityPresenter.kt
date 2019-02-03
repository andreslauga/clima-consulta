package com.climaconsulta.user.presenter

import com.climaconsulta.user.model.pojos.MainWeather

interface MainActivityPresenter {

    fun getCurrentCity()
    fun getMainWeather(cityName: String)
    fun getFiveDaysWheather(cityName: String)

    fun showMainWeather(mainWeather: MainWeather)
    fun showFiveDaysWeather()
    fun showError(error: String)
}