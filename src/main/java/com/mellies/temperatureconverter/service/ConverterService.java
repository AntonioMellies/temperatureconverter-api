package com.mellies.temperatureconverter.service;

import com.mellies.temperatureconverter.dto.ReturnConverterDTO;
import com.mellies.temperatureconverter.enums.UnitEnum;
import com.mellies.temperatureconverter.exception.ConverterException;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;

@Service("converterService")
public class ConverterService {

    DecimalFormat decimalFormat = new DecimalFormat("#.##");

    public ReturnConverterDTO fahrenheitToCelsius(double value) throws ConverterException {
        ReturnConverterDTO dto = new ReturnConverterDTO();
        Double valueCalc = ((value - 32) /1.8);
        dto.setValue(Double.parseDouble(decimalFormat.format(valueCalc).replace(",",".")));
        dto.setUnit(UnitEnum.CELSIUS);
        return dto;
      }

    public ReturnConverterDTO celsiusTofahrenheit(double value) throws ConverterException {
        ReturnConverterDTO dto = new ReturnConverterDTO();
        Double valueCalc = (1.8 * value + 32);
        dto.setValue(Double.parseDouble(decimalFormat.format(valueCalc).replace(",",".")));
        dto.setUnit(UnitEnum.FAHRENHEIT);
        return dto;
    }

}
