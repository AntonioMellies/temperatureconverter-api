package com.mellies.temperatureconverter.model;

import com.mellies.temperatureconverter.enums.UnitEnum;

import javax.persistence.*;
import java.util.Date;

@Entity
public class LogConverter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date dateCreation = new Date();

    private Double value;

    private String endPoint;

    public LogConverter(Double value, String endPoint) {
        this.value = value;
        this.endPoint = endPoint;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }
}
