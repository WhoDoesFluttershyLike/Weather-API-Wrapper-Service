package com.example.WeatherAPIWrapperService.entity;


import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class WeatherData {
  private List<Days> days;
  private String address;

}
