package main.java.model;

public class CountrySunriseSunset {
    private long sunrise;
    private long sunset;

    public CountrySunriseSunset() {
    }

    public CountrySunriseSunset(long sunrise, long sunset) {
        this.sunrise = sunrise;
        this.sunset = sunset;
    }

    public long getSunrise() {
        return sunrise;
    }

    public void setSunrise(long sunrise) {
        this.sunrise = sunrise;
    }

    public long getSunset() {
        return sunset;
    }

    public void setSunset(long sunset) {
        this.sunset = sunset;
    }

    @Override
    public String toString() {
        return "CountrySunriseSunset{" +
                "sunrise=" + sunrise +
                ", sunset=" + sunset +
                '}';
    }
}
