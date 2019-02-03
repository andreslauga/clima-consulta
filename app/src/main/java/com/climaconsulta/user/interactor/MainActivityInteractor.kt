package com.climaconsulta.user.interactor

interface MainActivityInteractor {

    fun getCurrentCity(ipAdress: Int?)
    fun getMainWheather(cityName: String)
    fun getFiveDaysWheather(cityName: String)
}