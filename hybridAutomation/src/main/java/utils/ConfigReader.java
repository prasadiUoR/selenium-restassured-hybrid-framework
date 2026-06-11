package utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties prop;

    static {
        try {
            FileReader reader = new FileReader("src/main/resources/config.properties");
            prop = new Properties();
            prop.load(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String get(String key) {
        return prop.getProperty(key);
    }
}
