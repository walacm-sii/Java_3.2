package org.example;

import java.io.IOException;

public class ConfigReader {
    public static String[] getArray(String field) throws IOException {
        String s = FileHandler.loadFile().getProperty(field);
        return s.replaceAll("\\{|\\}", "").replaceAll(" ", "").split(",");
    }
}
