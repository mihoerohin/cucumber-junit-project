package com.cydeo.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelRead_2 {

    @Test
    public void excelReader() throws IOException {

        String pathToFile = "LibraryCredentials.xlsx";

        File file = new File(pathToFile);

        // to read from excel we need to load it to FileInput Stream
        FileInputStream fileInputStream = new FileInputStream(file);


        // workbook -> book -> row -> cell

        // <1> create a workbook
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        // <2> We need to get specific sheet from currently opened workbook
        XSSFSheet sheet1 = workbook.getSheet("library1");
        XSSFSheet sheet2 = workbook.getSheet("library2");
        XSSFSheet sheet3 = workbook.getSheet("library3");

        // <3>  Select row and cell
        // Print out "" cell
        // index start from 0

        System.out.println("sheet #1 " + sheet1.getRow(0).getCell(0) + " is password => " + sheet1.getRow(0).getCell(2));

        System.out.println("sheet #2 " + sheet2.getRow(0).getCell(0) + " is password => " + sheet2.getRow(0).getCell(2));

        System.out.println("sheet #3 " + sheet3.getRow(0).getCell(0) + " is password => " + sheet3.getRow(0).getCell(2));

        int countNumberRows1 = sheet1.getPhysicalNumberOfRows();
        int countNumberRows2 = sheet2.getPhysicalNumberOfRows();
        int countNumberRows3 = sheet3.getPhysicalNumberOfRows();
        
        // This  method doesn't count empty rows
        System.out.println("Method getPhysicalNumberOfRows() => " + countNumberRows1 + ", " + countNumberRows2 + ", " + countNumberRows3);

        // start count from index 0 and count empty rows also
        // got fit to use with loop, if there are empty rows
        int lastNumberRows1 = sheet1.getLastRowNum();
        int lastNumberRows2 = sheet2.getLastRowNum();
        int lastNumberRows3 = sheet3.getLastRowNum();
        System.out.println(lastNumberRows1 + ", " + lastNumberRows2 + ", " + lastNumberRows3);


        for (int i = 0; i < sheet2.getLastRowNum(); i++) {
            if (sheet2.getRow(i).getCell(1).toString().equals("student58@library")) {
                System.out.println("password => " + sheet2.getRow(i).getCell(2));
            }
        }
        

    }
}
