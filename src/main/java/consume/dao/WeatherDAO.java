package consume.dao;

import consume.domain.WeatherData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * Created by Megan on 8/3/2016.
 */
@Repository
public class WeatherDAO {
    ArrayList<WeatherData> weatherArray;

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void insertWeatherForLocation(WeatherData weatherData){
       jdbcTemplate.update("Insert into weatherdata (" +
               "name, latitude, longitude, temperature, pressure, humidity" +
               ") VALUES ('" +
               weatherData.getName() + "', '" +
               weatherData.getCoord().getLatitude() + "', '" +
               weatherData.getCoord().getLongitude() + "', '" +
               weatherData.getMain().getTemperature() + "', '" +
               weatherData.getMain().getPressure() + "', '" +
               weatherData.getMain().getHumidity() +
               "')");
    }

    public ArrayList<WeatherData> getWeatherDataFromDatabase(){
        jdbcTemplate.query(
                "SELECT id, name, latitude, longitude, temperature, pressure, humidity" +
                        "  FROM weatherdata LIMIT 10",
                (rs, rowNum) -> new WeatherData(rs.getString("name"), rs.getFloat("latitude"),
                        rs.getFloat("longitude"), rs.getFloat("temperature"), rs.getFloat("pressure"),
                        rs.getFloat("humidity"))).forEach(weatherRow -> weatherArray.add(weatherRow));

        return weatherArray;
    }

}
