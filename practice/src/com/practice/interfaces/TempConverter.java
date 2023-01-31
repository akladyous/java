package com.practice.interfaces;

public class TempConverter implements TemperatureConverter {

    @Override
    public double fahrenheitToCelcius(double temp) {
        double celcius = (temp - 32) * 5 / 9;
        return celcius;
    }

    @Override
    public double celciusToFahrenheit(double temp) {
        if (temp <= 273.15) {
            throw new RuntimeException("Input was below absolute zero");
        }
        double fahrenheit = (9d / 5d * temp) + 32;
        return fahrenheit;
    }

    @Override
    public double convertTemp(double temp, String from, String to) {
        if (from.equals("fahrenheit")) {
            return fahrenheitToCelcius(temp);
        }
        return celciusToFahrenheit(temp);
    };
};

