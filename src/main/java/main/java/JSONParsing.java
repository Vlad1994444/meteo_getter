package main.java;

import main.java.model.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.util.ArrayList;
import java.util.List;

public class JSONParsing{

    GetURLContent urlContent = new GetURLContent();

    Root root = new Root();

    JSONParser parser = new JSONParser();

    public Root parse(){
        try {
            JSONObject rootJSONObject = (JSONObject) parser.parse(urlContent.getOutput());

            JSONArray weatherFromJSON = (JSONArray) rootJSONObject.get(Constants.WEATHER_KEY);
            List<Weather>weather = new ArrayList<>();
            for(Object weatherOne:weatherFromJSON){
                JSONObject currentWeather = (JSONObject) weatherOne;
                String cloudDescriptionWeatherOne = (String) currentWeather.get(Constants.WEATHER_MAIN);
                String descriptionWeatherOne = (String) currentWeather.get(Constants.WEATHER_DESCRIPTION);
                weather.add(new Weather(cloudDescriptionWeatherOne, descriptionWeatherOne));
            }
            root.setWeather(weather);

            JSONObject physicalParametersFromJSON = (JSONObject) rootJSONObject.get("main");
            double temper = (double)physicalParametersFromJSON.get("temp");
            double temperFeelsLike = (double)physicalParametersFromJSON.get("feels_like");
            double minTemper = (double)physicalParametersFromJSON.get("temp_min");
            double maxTemper = (double)physicalParametersFromJSON.get("temp_max");
            long pressure = (Long)physicalParametersFromJSON.get("pressure");
            long humidity = (Long)physicalParametersFromJSON.get("humidity");
            root.setPhysicalParameters(new PhysicalParameters(
                    temper,
                    temperFeelsLike,
                    minTemper,
                    maxTemper,
                    (int) pressure,
                    (int) humidity
            ));

            long visibility = (Long) rootJSONObject.get(Constants.VISIBILITY);
            root.setVisibility((int) visibility);

            JSONObject wind = (JSONObject) rootJSONObject.get(Constants.WIND_KEY);
            double windSpeed = (double) wind.get(Constants.WIND_SPEED);
            long windDegree = (Long) wind.get(Constants.WIND_DEGREE);
            root.setWind(new Wind(
                    windSpeed,
                    (int)windDegree
            ));

            JSONObject clouds = (JSONObject) rootJSONObject.get(Constants.CLOUD_KEY);
            long cloudsAll = (Long) clouds.get(Constants.CLOUD_ALL);
            root.setClouds(new Clouds(
                    (int)cloudsAll
            ));

            long dataUNIXFormat = (Long) rootJSONObject.get(Constants.DT);
            root.setTimeOfDataUNIXFormat(
                    dataUNIXFormat
            );

            JSONObject sys = (JSONObject) rootJSONObject.get(Constants.SYS_KEY);
            long sysSunrise = (Long) sys.get(Constants.SYS_SUNRISE);
            long sysSunset = (Long) sys.get(Constants.SYS_SUNSET);
            root.setCountrySunriseSunset(new CountrySunriseSunset(
                    sysSunrise,
                    sysSunset
            ));

            return root;
        } catch (Exception e) {
            System.out.println("Parse exception "+e);
        }


        return null;
    }

}
