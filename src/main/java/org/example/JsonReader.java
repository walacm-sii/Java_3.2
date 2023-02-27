package org.example;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class JsonReader {
    private final String PROPERTIES_PATH = "src/main/resources/properties.json";
    private JSONObject jsonObject;

    public JsonReader() {
        try {
            JSONParser jsonParser = new JSONParser();
            FileReader reader = new FileReader(PROPERTIES_PATH);
            Object obj = jsonParser.parse(reader);
            jsonObject = (JSONObject) obj;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Map<String, String> getHashMap() {
        Map<String, String> map = new HashMap<>();
        for (Object key : jsonObject.keySet()) {
            map.put((String) key, (String) jsonObject.get(key));
        }
        return map;
    }
}
