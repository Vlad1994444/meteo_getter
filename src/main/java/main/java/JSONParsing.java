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

            JSONArray weatherFromJSON = (JSONArray) rootJSONObject.get(Constants.WEATHER);
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


            return root;
        } catch (Exception e) {
            System.out.println("Parse exception "+e);
        }


        return null;
    }

}
