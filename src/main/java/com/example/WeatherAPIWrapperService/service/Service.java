package com.example.WeatherAPIWrapperService.service;

import com.example.WeatherAPIWrapperService.entity.WeatherData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;

@org.springframework.stereotype.Service

public class Service {

    private String apiKey = "QPAK4PZJX6UEGUUTZJ66UATC4";
    private final String BASE_URL = "https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/";
    @Autowired
    private final RestTemplate restTemplate;

    public Service(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @Cacheable(value = "weatherData", key = "#city")
    public WeatherData getWeatherByCity(String city) {
        String url = BASE_URL + city + "?unitGroup=metric&key=" + apiKey;
        ResponseEntity<WeatherData> response = restTemplate.getForEntity(url, WeatherData.class);
        return response.getBody();
    }
}
//https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/almaty?unitGroup=metric&key=QPAK4PZJX6UEGUUTZJ66UATC4