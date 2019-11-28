package com.mellies.temperatureconverter.service;

import com.mellies.temperatureconverter.model.LogConverter;
import com.mellies.temperatureconverter.repository.LogConverterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service("logConverterService")
public class LogConverterService {

    @Autowired
    LogConverterRepository logConverterRepository;

       @Async
    public LogConverter saveAsync(LogConverter log) {
        return logConverterRepository.save(log);
    }
}
