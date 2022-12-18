package JavaClasses.java29classFileHandling;

import utils.ConfigReader;

import java.io.IOException;

public class FileConfigreader {
    public static void main(String[] args) throws IOException {
        String path="/Users/radik/IdeaProjects/JavaClasses/Data/config.properties";
        var propperties= ConfigReader.read(path);
        System.out.println(propperties.getProperty("browser"));

    }
}
