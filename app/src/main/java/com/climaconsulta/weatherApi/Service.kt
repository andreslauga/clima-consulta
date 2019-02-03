package com.climaconsulta.weatherApi

import com.climaconsulta.user.model.pojosRetrofit.MainWeatherResponse
import com.climaconsulta.weatherApi.Constants.Companion.MAIN_WEATHER
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Service {

    @GET(MAIN_WEATHER)
    fun getMainWeather(@Query("city") city: String): Call<MainWeatherResponse>
}