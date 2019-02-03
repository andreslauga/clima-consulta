package com.climaconsulta.user.interactor

import com.climaconsulta.user.presenter.MainActivityPresenter
import com.climaconsulta.user.repository.MainActivityRepository

class MainActivityInteractorImpl : MainActivityInteractor{

    private val presenter: MainActivityPresenter? = null
    private val mainActivityRepository: MainActivityRepository? = null

    override fun getCurrentCity(ipAdress: Int?) {
//        TODO: aca tiras el request
    }

    override fun getMainWheather(cityName: String) {
        mainActivityRepository!!.getMainWeather(cityName)
    }

    override fun getFiveDaysWheather(cityName: String) {
        mainActivityRepository!!.getFiveDaysWheather(cityName)
    }
}