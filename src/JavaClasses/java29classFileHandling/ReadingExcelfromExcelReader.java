package JavaClasses.java29classFileHandling;

import utils.exelReader;

import java.io.IOException;

public class ReadingExcelfromExcelReader {
    public static void main(String[] args) throws IOException {
        var excelReader= exelReader.read("/Users/radik/Downloads/JavaExel/Book 3.xlsx");
        System.out.println(excelReader);
    }
}
