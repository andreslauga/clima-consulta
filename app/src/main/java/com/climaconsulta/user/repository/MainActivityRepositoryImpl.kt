package com.climaconsulta.user.repository

import com.climaconsulta.user.model.pojos.MainWeather
import com.climaconsulta.user.model.pojosRetrofit.MainWeatherResponse
import com.climaconsulta.user.presenter.MainActivityPresenter
import com.climaconsulta.user.presenter.MainActivityPresenterImpl
import com.climaconsulta.weatherApi.Constants
import com.climaconsulta.weatherApi.RestApiAdapter
import com.climaconsulta.weatherApi.Service
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivityRepositoryImpl : MainActivityRepository{

    private lateinit var mainActivityPresenter: MainActivityPresenter

    override fun getCurrentCity() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getMainWeather(cityName: String) {
        mainActivityPresenter = MainActivityPresenterImpl()
        val restApiAdapter: RestApiAdapter = RestApiAdapter()
        val service: Service = restApiAdapter.getClientService()
        val call = service.getMainWeather(cityName, "es", "metric", Constants.APPID)
        call.enqueue(object : Callback<MainWeatherResponse> {

            override fun onResponse(call: Call<MainWeatherResponse>, response: Response<MainWeatherResponse>) {
                val mainWeatherResponse: MainWeatherResponse? = response.body()
                val mainWeather: MainWeather? = MainWeather(
                    weather = mainWeatherResponse?.weather,
                    main = mainWeatherResponse?.main,
                    name = mainWeatherResponse?.name
                )
                if (mainWeather != null) {
                    mainActivityPresenter.showMainWeather(mainWeather)
                }
            }

            override fun onFailure(call: Call<MainWeatherResponse>, t: Throwable) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })
    }

    override fun getFiveDaysWheather(cityName: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}