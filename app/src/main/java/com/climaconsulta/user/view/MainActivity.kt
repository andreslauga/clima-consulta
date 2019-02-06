package com.climaconsulta.user.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.climaconsulta.R
import com.climaconsulta.user.model.pojos.MainWeather
import com.climaconsulta.user.presenter.MainActivityPresenter
import com.climaconsulta.user.presenter.MainActivityPresenterImpl
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity(), MainActivityView {

    var presenter: MainActivityPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainActivityPresenterImpl()
        presenter!!.getMainWeather("London")
    }

    override fun showCurrentCity() {
        presenter!!.getCurrentCity()
    }

    override fun showMainWeather(mainWeather: MainWeather) {
        mainTemperature.text = mainWeather.main!!.temp.toString()
    }

    override fun showFiveDaysWeather(cityName: String) {
        presenter!!.getFiveDaysWheather(cityName)
    }

    override fun showError(error: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
