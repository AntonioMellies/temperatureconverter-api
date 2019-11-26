package com.mellies.temperatureconverter.service;

import com.mellies.temperatureconverter.dto.ReturnConverterDTO;
import com.mellies.temperatureconverter.enums.UnitEnum;
import com.mellies.temperatureconverter.exception.ConverterException;
import org.springframework.stereotype.Service;

@Service("converterService")
public class ConverterService {

    public ReturnConverterDTO fahrenheitToCelsius(double value) throws ConverterException {
        ReturnConverterDTO dto = new ReturnConverterDTO();
        dto.setValue((value - 32) /1.8);
        dto.setUnit(UnitEnum.CELSIUS);
        return dto;
      }

    public ReturnConverterDTO celsiusTofahrenheit(double value) throws ConverterException {
        ReturnConverterDTO dto = new ReturnConverterDTO();
        dto.setValue(1.8 * value + 32);
        dto.setUnit(UnitEnum.FAHRENHEIT);
        return dto;
    }

}
