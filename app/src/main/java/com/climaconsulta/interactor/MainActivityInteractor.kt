package com.climaconsulta.interactor

interface MainActivityInteractor {

    fun getCurrentCity(ipAdress: Int?)
    fun getMainWheather(cityName: String)
    fun getFiveDaysWheather(cityName: String)
}