package consume.controllers;

import consume.dao.WeatherDAO;
import consume.domain.WeatherData;
import consume.services.WeatherAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by Megan on 8/3/2016.
 */
@RestController
public class WeatherController {
    ArrayList<WeatherData> weatherData;

    @Autowired
    WeatherAPIService weatherAPIService;

    @Autowired
    WeatherDAO weatherDAO;

    @RequestMapping("/test")
    public ArrayList<WeatherData> testEndpoint(){
        weatherAPIService.getWeatherDataForLocation();
        return weatherDAO.getWeatherDataFromDatabase();
//        return new ResponseEntity(HttpStatus.CREATED);
    }
}
