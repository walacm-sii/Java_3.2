package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FileHandler {

    public static Properties loadFile() throws IOException {
        InputStream configFile = null;
        Properties properties = null;
        try {
            configFile = ClassLoader.getSystemClassLoader().getResourceAsStream("config.properties");
            properties = new Properties();
            properties.load(configFile);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            assert configFile != null;
            configFile.close();
        }

        return properties;

    }
}