package JavaClasses.java28class101222FileHandlingExcel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo {
    public static void main(String[] args) throws IOException {
        String path="/Users/radik/Downloads/JavaExel/Book 2.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);

        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        int noOfRows=sheet.getPhysicalNumberOfRows();
        System.out.println(noOfRows);
        for (int i = 0; i < noOfRows; i++) {
            Row row=sheet.getRow(i);
            int noOfCell=row.getPhysicalNumberOfCells();
            for (int j = 0; j <noOfCell ; j++) {
                Cell cell= row.getCell(j);
                System.out.print(cell+" ");
            }
            System.out.println();
        }


    }
}
