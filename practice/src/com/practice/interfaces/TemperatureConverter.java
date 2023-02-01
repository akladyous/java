package com.practice.interfaces;

public interface TemperatureConverter {
    double fahrenheitToCelcius(double temp);
    double celciusToFahrenheit(double temp);

    double convertTemp(double temp, String from, String to);

};
