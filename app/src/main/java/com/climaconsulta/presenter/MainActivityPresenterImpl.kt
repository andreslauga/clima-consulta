package com.climaconsulta.presenter

import com.climaconsulta.view.MainActivityView

class MainActivityPresenterImpl : MainActivityPresenter {

    private val mainAvtivityView: MainActivityView? = null


    override fun getCurrentCity() {

    }

    override fun getMainWeather() {

    }

    override fun getFiveDaysWheather() {

    }

    override fun showResult() {

    }

    override fun showError(error: String) {
        mainAvtivityView!!.showError(error)
    }
}
