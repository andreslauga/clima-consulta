package com.climaconsulta.user.interactor

import com.climaconsulta.user.presenter.MainActivityPresenter
import com.climaconsulta.user.presenter.MainActivityPresenterImpl
import com.climaconsulta.user.repository.MainActivityRepository
import com.climaconsulta.user.repository.MainActivityRepositoryImpl

class MainActivityInteractorImpl : MainActivityInteractor{

//    private val presenter: MainActivityPresenter = MainActivityPresenterImpl()
    private var mainActivityRepository: MainActivityRepository = MainActivityRepositoryImpl()

    override fun getCurrentCity(ipAdress: Int?) {

    }

    override fun getMainWheather(cityName: String) {
        mainActivityRepository.getMainWeather(cityName)
    }

    override fun getFiveDaysWheather(cityName: String) {
        mainActivityRepository.getFiveDaysWheather(cityName)
    }
}