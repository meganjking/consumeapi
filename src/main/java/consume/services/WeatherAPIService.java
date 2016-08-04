package consume.services;

import consume.dao.WeatherDAO;
import consume.domain.WeatherData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Megan on 8/3/2016.
 */
@Service
public class WeatherAPIService {
    String baseURL = "http://api.openweathermap.org/data/2.5/";
    String apiKey = "2b7beb24cbcc81d128e7f51fa817a1f2";

    @Autowired
    WeatherDAO weatherDAO;


    public void getWeatherDataForLocation(){
        RestTemplate restTemplate = new RestTemplate();
        WeatherData weatherData = restTemplate.getForObject(baseURL + "weather?id=4381982&APPID=" + apiKey, WeatherData.class);


        weatherDAO.insertWeatherForLocation(weatherData);
    }

}
