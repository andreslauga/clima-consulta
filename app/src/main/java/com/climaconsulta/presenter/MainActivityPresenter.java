package com.climaconsulta.presenter;

public interface MainActivityPresenter {

    void getCurrentCity();
    void getMainWeather();
    void getFiveDaysWheather();

    void showResult();
    void showError();
}
