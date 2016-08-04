package consume.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty;
import consume.domain.Coord;

/**
 * Created by Megan on 7/30/2016.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherData {
    private WeatherData weatherData;

    private Coord coord;
//    private Weather weather;
//    private String base;
    private Main main;
//    private Wind wind;
//    private Rain rain;
//    private Clouds clouds;
//    private float dt;
//    private Sys sys;
//    private int id;
    private String name;
//    private int cod;

    public WeatherData(String name, float latitude, float longitude, float temperature,
                       float pressure, float humidity){
        this.name = name;
        this.setCoord(new Coord(latitude, longitude));
        this.setMain(new Main(temperature, pressure, humidity));
    }

    public Coord getCoord(){
        return coord;
    }

    public void setCoord(Coord coord){
        this.coord = coord;
    }

    public Main getMain(){
        return main;
    }

    public void setMain(Main main){
        this.main = main;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "WeatherData: Name= " + name + '\n' +
                coord +
                main;
    }

}