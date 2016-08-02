package consume.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Megan on 7/30/2016.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Coord {

    private float lon;
    private float lat;

    public Coord(){}



    @Override
    public String toString(){
        return "Coordinates: lon= " + lon + ", lat= " + lat + "\n";
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }
}