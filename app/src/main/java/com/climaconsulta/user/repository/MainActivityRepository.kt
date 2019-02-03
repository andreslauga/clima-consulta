package com.climaconsulta.user.repository

interface MainActivityRepository {
    fun getCurrentCity()
    fun getMainWeather(cityName: String)
    fun getFiveDaysWheather(cityName: String)
}