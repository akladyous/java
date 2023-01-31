package com.practice.interfaces;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class TempConverterTest {

    TemperatureConverter converter = new TempConverter();
    @Test
    void celciusToFahrenheit(){
        double result = this.converter.celciusToFahrenheit(100);
        assertEquals(212, result, 0.1);
    }
}