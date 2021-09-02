package main.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class GetURLContent {

    String line;
    private static final String CITY = "London";
    private static final String API_ONE = "ed9389c8d74c9800aedba32a76aabcb7";
    private static final String API_TWO = "9ee48bcdc71857e72c3303e60dfd2b08";

    String output = getURLCont(
            "https://api.openweathermap.org/data/2.5/weather?q=" + CITY+ "&units=metric&appid="+ API_TWO);

    public String getOutput() {
        return output;
    }

    public String getURLCont(String urlAddress){
        StringBuffer content = new StringBuffer();


        try {
            URL url = new URL(urlAddress);
            URLConnection connection = url.openConnection();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            while((line = bufferedReader.readLine())!=null){
                content.append(line+"\n");
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("Exception in URL part" + e);
        }
        return content.toString();
    }
}
