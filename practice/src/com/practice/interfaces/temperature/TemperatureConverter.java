package com.practice.interfaces.temperature;

public interface TemperatureConverter {
    double fahrenheitToCelcius(double temp);
    double celciusToFahrenheit(double temp);

    double convertTemp(double temp, String from, String to);

};
