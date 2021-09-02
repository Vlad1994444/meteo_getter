package main.java.model;

public class PhysicalParameters {
    private double temperature;
    private double fillingTemperature;
    private double minTemp;
    private double maxTemp;
    private int pressure;
    private int humidity;

    public PhysicalParameters() {
    }

    public PhysicalParameters(double temperature, double fillingTemperature, double minTemp, double maxTemp, int pressure, int humidity) {
        this.temperature = temperature;
        this.fillingTemperature = fillingTemperature;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getFillingTemperature() {
        return fillingTemperature;
    }

    public void setFillingTemperature(double fillingTemperature) {
        this.fillingTemperature = fillingTemperature;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double maxTemp) {
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

