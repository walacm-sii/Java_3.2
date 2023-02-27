package org.example;

import java.io.IOException;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<String, String> map = new JsonReader().getHashMap();
        String[] sensualKeys = ConfigReader.getArray("sensualKeys");

        new MapUtil(map, sensualKeys).displayObfuscatedData();
    }
}