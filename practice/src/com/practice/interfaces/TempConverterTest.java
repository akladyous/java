package com.practice.interfaces;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TempConverterTest {
    TemperatureConverter converter = new TempConverter();
    @Test
    void fahrenheitToCelcius() {
        double resut = this.converter.fahrenheitToCelcius(90);
        assertEquals(32, resut, 0.25);
    }

    @Test
    void celciusToFahrenheit() {
        double result = this.converter.celciusToFahrenheit(100);
        assertEquals(212, result, 0.1);
    }

    @Test
    void convertTemp() {
    }
}