package main.java.model;

public class Weather {
    private String groupOfWeatherParameter;
    private String weatherConditionWithinTheGroup;

    public Weather(String groupOfWeatherParameter, String weatherConditionWithinTheGroup) {
        this.groupOfWeatherParameter = groupOfWeatherParameter;
        this.weatherConditionWithinTheGroup = weatherConditionWithinTheGroup;
    }

    public String getGroupOfWeatherParameter() {
        return groupOfWeatherParameter;
    }

    public void setGroupOfWeatherParameter(String groupOfWeatherParameter) {
        this.groupOfWeatherParameter = groupOfWeatherParameter;
    }

    public String getWeatherConditionWithinTheGroup() {
        return weatherConditionWithinTheGroup;
    }

    public void setWeatherConditionWithinTheGroup(String weatherConditionWithinTheGroup) {
        this.weatherConditionWithinTheGroup = weatherConditionWithinTheGroup;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "groupOfWeatherParameter='" + groupOfWeatherParameter + '\'' +
                ", weatherConditionWithinTheGroup='" + weatherConditionWithinTheGroup + '\'' +
                '}';
    }
}
