package com.mellies.temperatureconverter.dto;

import com.mellies.temperatureconverter.enums.UnitEnum;

import java.io.Serializable;

public class ReturnConverterDTO implements Serializable {

    private Double value;

    private UnitEnum unit;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public UnitEnum getUnit() {
        return unit;
    }

    public void setUnit(UnitEnum unit) {
        this.unit = unit;
    }
}
