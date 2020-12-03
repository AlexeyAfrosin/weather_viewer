package com.afrosin.weather_viewer;

public class WeatherItem {

    private String temperature;
    private String windSpeed;
    private String cloudy;
    private String time;

    public WeatherItem(String temperature, String windSpeed, String cloudy, String time) {
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.cloudy = cloudy;
        this.time = time;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getCloudy() {
        return cloudy;
    }

    public void setCloudy(String cloudy) {
        this.cloudy = cloudy;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}


