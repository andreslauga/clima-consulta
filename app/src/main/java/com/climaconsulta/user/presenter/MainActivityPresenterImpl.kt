package com.climaconsulta.user.presenter

import com.climaconsulta.user.interactor.MainActivityInteractor
import com.climaconsulta.user.interactor.MainActivityInteractorImpl
import com.climaconsulta.user.model.pojos.MainWeather
import com.climaconsulta.user.view.MainActivity
import com.climaconsulta.user.view.MainActivityView

class MainActivityPresenterImpl : MainActivityPresenter {

    private var mainActivityView: MainActivityView = MainActivity()
    private var mainActivityInteractor: MainActivityInteractor = MainActivityInteractorImpl()

    override fun getCurrentCity() {

    }

    override fun getMainWeather(cityName: String) {
        mainActivityInteractor.getMainWheather(cityName)
    }

    override fun getFiveDaysWheather(cityName: String) {
        mainActivityInteractor.getFiveDaysWheather(cityName)
    }

    override fun showMainWeather(mainWeather: MainWeather) {
        mainActivityView.showMainWeather(mainWeather)
    }

    override fun showFiveDaysWeather() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showError(error: String) {
        mainActivityView!!.showError(error)
    }
}
