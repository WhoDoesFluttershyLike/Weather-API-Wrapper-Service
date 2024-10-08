package com.example.WeatherAPIWrapperService.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Days {
    private String datetime;
    private double tempmax;
    private double tempmin;
    private double temp;
}
