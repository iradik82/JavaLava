package utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class exelReader {


    public static ArrayList<LinkedHashMap<String, String>> read(String path) throws IOException {

        // Reads the data from HardDrive brings it to RAM in the raw form 10101010101010
        // In simple words we can say computer has navigated to that file
        FileInputStream fileInputStream = new FileInputStream(path);
        // this class converts the raw bytes to Excel format or in simple words it is that special software
        // that helps us read and write data to an Excel file.
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);

        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        int noOfRows = sheet.getPhysicalNumberOfRows();
        // getting the first row so that we can use it as keys for our map
        Row headerRow = sheet.getRow(0);
        // the Map that will store the data for each row

        ArrayList<LinkedHashMap<String, String>> excelMap = new ArrayList<>();
// A loop that goes through all the rows that contain the data.
        for (int rowNo = 1; rowNo < noOfRows; rowNo++) {
            LinkedHashMap<String, String> rowMap = new LinkedHashMap<>();
// get a dataRow from sheet one by one through loop
            Row dataRow = sheet.getRow(rowNo);
// getting the count of how many cells contain the data
            int noOfcell = dataRow.getPhysicalNumberOfCells();
            // A loop to go through all the cells
            for (int cellNo = 0; cellNo < noOfcell; cellNo++) {
//getting keys from header row and values from data row

                String key = headerRow.getCell(cellNo).toString();
                String value = dataRow.getCell(cellNo).toString();
                rowMap.put(key, value);
            }
            excelMap.add(rowMap);

        }
        return excelMap;
    }
}



