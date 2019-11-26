package com.mellies.temperatureconverter.exception;

public class ConverterException extends Exception {

    private static final long serialVersionUID = 1L;
    private String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    public ConverterException(String errorMessage) {
        super(errorMessage);
        this.errorMessage = errorMessage;
    }

    public ConverterException() {
        super();
    }

}
