package consume.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Megan on 8/2/2016.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Main {
    private float temperature;
    private float pressure;
    private float humidity;
    private float temperature_min;
    private float temperature_max;

    public Main(float temperature, float pressure, float humidity){
        this.setTemperature(temperature);
        this.setPressure(pressure);
        this.setHumidity(humidity);
//        this.setTemperature_min(temperature_min);
//        this.setTemperature_max(temperature_max);
    }

    @Override
    public String toString(){
        return  "Temperature: " + temperature + "\n" +
                "Pressure: " + pressure + "\n" +
                "Humidity: " + humidity + "\n";
    }


    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getTemperature_min() {
        return temperature_min;
    }

    public void setTemperature_min(float temperature_min) {
        this.temperature_min = temperature_min;
    }

    public float getTemperature_max() {
        return temperature_max;
    }

    public void setTemperature_max(float temperature_max) {
        this.temperature_max = temperature_max;
    }
}
