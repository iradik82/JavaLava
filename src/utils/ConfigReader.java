package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties read(String path) throws IOException {
        FileInputStream fileInputStream=new FileInputStream(path);
        var properties=new Properties();//software wich helps us read the file
        properties.load(fileInputStream); //loads all the data from the file inside
       return properties;
    }
}
