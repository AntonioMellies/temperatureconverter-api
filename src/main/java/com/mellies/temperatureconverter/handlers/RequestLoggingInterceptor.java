package com.mellies.temperatureconverter.handlers;

import com.mellies.temperatureconverter.model.LogConverter;
import com.mellies.temperatureconverter.service.LogConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class RequestLoggingInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    LogConverterService logConverterService;

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        String endPoint = request.getRequestURI().split("/")[1];
        String valuePath = request.getRequestURI().split("/")[2];
        Double value = Double.parseDouble(valuePath);
        logConverterService.saveAsync(new LogConverter(value, endPoint));
    }
}
