package com.climaconsulta.weatherApi

import com.climaconsulta.user.model.pojosRetrofit.MainWeatherResponse
import com.climaconsulta.weatherApi.Constants.Companion.MAIN_WEATHER
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface Service {

    @GET(MAIN_WEATHER)
    fun getMainWeather(
        @Query("q") city: String,
        @Query("lang") lang: String,
        @Query("units") units: String,
        @Query("appid") appid: String):
            Call<MainWeatherResponse>
}