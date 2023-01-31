package com.cydeo.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelRead {

    @Test
    public void read_from_excel_file() throws IOException {

        String path = "SampleData.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);

        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        XSSFSheet sheet = workbook.getSheet("Employees");   // sheet choose



        System.out.println(sheet.getRow(1).getCell(0) +
                    " "  + sheet.getRow(1).getCell(2));     // Janna PO

        System.out.println(sheet.getRow(4).getCell(2));  //  SDET



        int usedRows = sheet.getPhysicalNumberOfRows();
        System.out.println(usedRows);       // 5


        for (int i = 0; i < usedRows; i++) {
            if(sheet.getRow(i).getCell(0).toString().equals("Kate")){
                System.out.println(sheet.getRow(i).getCell(0));  //  Kate
            }
            
        }

    }

}
