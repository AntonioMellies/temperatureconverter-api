package com.mellies.temperatureconverter.service;

import com.mellies.temperatureconverter.dto.ReturnConverterDTO;
import com.mellies.temperatureconverter.enums.UnitEnum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.BeforeTestClass;
import org.springframework.test.context.event.annotation.BeforeTestMethod;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ConverterServiceTest {

    @Autowired
    ConverterService converterService;

    ReturnConverterDTO dtoFahrenheitToCelsius;
    ReturnConverterDTO dtoCelsiusTofahrenheit;

    @BeforeEach
    public void beforeTestMethod(){
        dtoFahrenheitToCelsius = new ReturnConverterDTO(0.0, UnitEnum.CELSIUS);
        dtoCelsiusTofahrenheit = new ReturnConverterDTO(32.0, UnitEnum.FAHRENHEIT);
    }

    @Test
    void fahrenheitToCelsius() throws Exception{
        ReturnConverterDTO dto = converterService.fahrenheitToCelsius(32.0);
        assertEquals(dtoFahrenheitToCelsius.getValue(), dto.getValue());
        assertEquals(dtoFahrenheitToCelsius.getUnit(), dto.getUnit());
    }

    @Test
    void celsiusTofahrenheit()  throws Exception {
        ReturnConverterDTO dto = converterService.celsiusTofahrenheit(0.0);
        assertEquals(dtoCelsiusTofahrenheit.getValue(), dto.getValue());
        assertEquals(dtoCelsiusTofahrenheit.getUnit(), dto.getUnit());
    }
}