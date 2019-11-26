package com.mellies.temperatureconverter.controller;

import com.mellies.temperatureconverter.dto.ReturnConverterDTO;
import com.mellies.temperatureconverter.exception.ConverterException;
import com.mellies.temperatureconverter.service.ConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ConverterController {

    @Autowired
    ConverterService converterService;

    @RequestMapping(value = "/fahrenheitToCelsius/{value}", method = RequestMethod.GET)
    public ResponseEntity<ReturnConverterDTO> fahrenheitToCelsius(@PathVariable("value") double value) throws ConverterException {
        return ResponseEntity.ok(this.converterService.fahrenheitToCelsius(value));
    }

    @RequestMapping(value = "/celsiusTofahrenheit/{value}", method = RequestMethod.GET)
    public ResponseEntity<ReturnConverterDTO> celsiusTofahrenheit(@PathVariable("value") double value) throws ConverterException {
        return ResponseEntity.ok(this.converterService.celsiusTofahrenheit(value));
    }

}
