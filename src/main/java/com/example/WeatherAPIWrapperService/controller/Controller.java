package com.example.WeatherAPIWrapperService.controller;

import com.example.WeatherAPIWrapperService.entity.WeatherData;
import com.example.WeatherAPIWrapperService.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/weather")
@RestController

public class Controller {
    @Autowired
    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/city")
    public WeatherData getWeather(@RequestParam String city){
        return service.getWeatherByCity(city);
    }
}
