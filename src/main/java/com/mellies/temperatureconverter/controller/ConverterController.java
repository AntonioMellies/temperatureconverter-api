package com.mellies.temperatureconverter.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class ConverterController {

    @RequestMapping(value = "/fahrenheitToCelsius/{value}", method = RequestMethod.GET)
    public String fahrenheitToCelsius(@PathVariable double value){
        return "Teste";
    }

}
