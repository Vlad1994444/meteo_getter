package main.java.model;

public class PhysicalParameters {
    private int temperature;
    private int fillingTemperature;
    private int minTemp;
    private int maxTemp;
    private int pressure;
    private int humidity;

    public PhysicalParameters() {
    }

    public PhysicalParameters(int temperature, int fillingTemperature, int minTemp, int maxTemp, int pressure, int humidity) {
        this.temperature = temperature;
        this.fillingTemperature = fillingTemperature;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getFillingTemperature() {
        return fillingTemperature;
    }

    public void setFillingTemperature(int fillingTemperature) {
        this.fillingTemperature = fillingTemperature;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "PhysicalParameters{" +
                "temperature=" + temperature +
                ", fillingTemperature=" + fillingTemperature +
                ", minTemp=" + minTemp +
                ", maxTemp=" + maxTemp +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                '}';
    }
}

