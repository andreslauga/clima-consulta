package com.climaconsulta.user.view

import com.climaconsulta.user.model.pojos.MainWeather

interface MainActivityView {

    fun showCurrentCity()
    fun showMainWeather(mainWeather: MainWeather)
    fun showFiveDaysWeather(cityName: String)
    fun showError(error: String)
}