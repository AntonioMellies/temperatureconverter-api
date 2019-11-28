package com.mellies.temperatureconverter.service;

import com.mellies.temperatureconverter.dto.ReturnConverterDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.BeforeTestMethod;

@SpringBootTest
class ConverterServiceTest {

    @Autowired
    ConverterService converterService;

    ReturnConverterDTO dtoFahrenheitToCelsius;

    ReturnConverterDTO dtoCelsiusTofahrenheit;

    @BeforeTestMethod
    public void beforeTestMethod(){

    }

    @Test
    void fahrenheitToCelsius() {
    }

    @Test
    void celsiusTofahrenheit() {
    }
}