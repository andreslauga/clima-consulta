package com.climaconsulta.user.presenter

import com.climaconsulta.user.interactor.MainActivityInteractor
import com.climaconsulta.user.model.pojos.MainWeather
import com.climaconsulta.user.view.MainActivityView

class MainActivityPresenterImpl : MainActivityPresenter {

    private val mainActivityView: MainActivityView? = null
    private lateinit var mainActivityInteractor: MainActivityInteractor

    override fun getCurrentCity() {

    }

    override fun getMainWeather(cityName: String) {
        mainActivityInteractor.getMainWheather(cityName)
// TODO: NULL POINTER EXCEPTION POR QUE NO SE ESTA INICIALIZANDO LA VARIABLE
    }

    override fun getFiveDaysWheather(cityName: String) {
        mainActivityInteractor!!.getFiveDaysWheather(cityName)
    }

    override fun showMainWeather(mainWeather: MainWeather) {
        mainActivityView!!.showMainWeather(mainWeather)
    }

    override fun showFiveDaysWeather() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showError(error: String) {
        mainActivityView!!.showError(error)
    }
}
