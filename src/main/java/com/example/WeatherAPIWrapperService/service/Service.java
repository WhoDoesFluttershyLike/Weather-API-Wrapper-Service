package com.example.WeatherAPIWrapperService.service;

import com.example.WeatherAPIWrapperService.entity.WeatherData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@org.springframework.stereotype.Service

public class Service {

    private String apiKey = "QPAK4PZJX6UEGUUTZJ66UATC4";
    private final String BASE_URL = "https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/";
    @Autowired
    private final RestTemplate restTemplate;

    public Service(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


//    public String getWeatherByCity(String city) {
//        String url = BASE_URL + city + "?unitGroup=metric&key=" + apiKey;
//        return restTemplate.getForObject(url, String.class);
//    }


    public WeatherData getWeatherByCity(String city) {
        String url = BASE_URL + city + "?unitGroup=metric&key=" + apiKey;
        ResponseEntity<WeatherData> response = restTemplate.getForEntity(url, WeatherData.class);
        return response.getBody();
    }
}
