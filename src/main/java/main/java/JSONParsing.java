package main.java;

import main.java.model.Root;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONParsing {

    GetURLContent urlContent = new GetURLContent();
    Root root = new Root();
    JSONParser parser = new JSONParser();

    public Root parse(){
        try {
            JSONObject rootJSONObject = (JSONObject) parser.parse(urlContent.getOutput());

        } catch (Exception e) {
            System.out.println("Parse exception "+e);
        }

        return null;
    }

}
