package com.example.WeatherAPIWrapperService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class WeatherApiWrapperServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherApiWrapperServiceApplication.class, args);
	}

}
