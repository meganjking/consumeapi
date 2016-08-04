package consume.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Megan on 7/30/2016.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Coord {

    private float lon;
    private float lat;

    public Coord(float lat, float lon){
        this.setLatitude(lat);
        this.setLongitude(lon);
    }

    @Override
    public String toString(){
        return "Coordinates: lon= " + lon + ", lat= " + lat + "\n";
    }

    public float getLongitude() {
        return lon;
    }

    public void setLongitude(float lon) {
        this.lon = lon;
    }

    public float getLatitude() {
        return lat;
    }

    public void setLatitude(float lat) {
        this.lat = lat;
    }
}