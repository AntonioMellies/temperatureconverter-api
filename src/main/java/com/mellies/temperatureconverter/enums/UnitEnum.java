package com.mellies.temperatureconverter.enums;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum UnitEnum {

    CELSIUS("Celsius","ºC"),
    FAHRENHEIT("Fahrenheit","ºF");

    private String name;

    private String suffix;

    UnitEnum(String name, String suffix) {
        this.name = name;
        this.suffix = suffix;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
