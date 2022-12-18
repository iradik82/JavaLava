package JavaClasses.java28class101222FileHandlingExcel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {

        String path="Data/config.properties";
        FileInputStream fileInputStream=new FileInputStream(path);
        var properties=new Properties();//software wich helps us read the file
        properties.load(fileInputStream); //loads all the data from the file inside
        System.out.println(properties.getProperty("URL"));
        System.out.println(properties.getProperty("password"));
        fileInputStream.close();//close the file



    }
}
