package main.java.model;

import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.List;

public class Root {

    private List<Weather>weather;
    private PhysicalParameters physicalParameters;
    private int visibility;
    private Wind wind;
    private Clouds clouds;
    private Long timeOfDataUNIXFormat;
    private CountrySunriseSunset countrySunriseSunset;

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public PhysicalParameters getPhysicalParameters() {
        return physicalParameters;
    }

    public void setPhysicalParameters(PhysicalParameters physicalParameters) {
        this.physicalParameters = physicalParameters;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Long getTimeOfDataUNIXFormat() {
        return timeOfDataUNIXFormat;
    }

    public void setTimeOfDataUNIXFormat(Long timeOfDataUNIXFormat) {
        this.timeOfDataUNIXFormat = timeOfDataUNIXFormat;
    }

    public CountrySunriseSunset getCountrySunriseSunset() {
        return countrySunriseSunset;
    }

    public void setCountrySunriseSunset(CountrySunriseSunset countrySunriseSunset) {
        this.countrySunriseSunset = countrySunriseSunset;
    }

    @Override
    public String toString() {
        return "Root{" +
                "weather=" + weather +
                ", physicalParameters=" + physicalParameters +
                ", visibility=" + visibility +
                ", wind=" + wind +
                ", clouds=" + clouds +
                ", timeOfDataUNIXFormat=" + timeOfDataUNIXFormat +
                ", countrySunriseSunset=" + countrySunriseSunset +
                '}';
    }
}
