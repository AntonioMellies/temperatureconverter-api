package com.mellies.temperatureconverter.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class ConverterControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ConverterController converterController;

    @Test
    void verifyController() throws Exception {
        assertThat(converterController).isNotNull();
    }

    @Test
    void verifyFahrenheitToCelsius() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/fahrenheitToCelsius/10").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }

    @Test
    void verifyCelsiusTofahrenheit() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/celsiusTofahrenheit/10").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }
}