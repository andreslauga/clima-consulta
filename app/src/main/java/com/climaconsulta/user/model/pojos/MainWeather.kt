package com.climaconsulta.user.model.pojos

import com.climaconsulta.user.model.pojosRetrofit.Main
import com.climaconsulta.user.model.pojosRetrofit.WeatherItem

data class MainWeather (val weather: List<WeatherItem?>?, val main: Main?, val name: String?)
