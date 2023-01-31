package com.cydeo.tests;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.*;

public class WriteExcel {

    String path = "SampleData.xlsx";
    XSSFWorkbook workbook;
    XSSFSheet sheet;

    @Test
    public void test() throws IOException {

        File file = new File(path);

        FileInputStream fileInputStream = new FileInputStream(file);

        workbook = new XSSFWorkbook(fileInputStream);
        sheet = workbook.getSheet("Employees");

        XSSFCell  salaryCell = sheet.getRow(0).createCell(3);
        salaryCell.setCellValue("Salary");

        XSSFCell salary1 = sheet.getRow(1).createCell(3);
        salary1.setCellValue(200000);

        XSSFCell salary2 = sheet.getRow(2).createCell(3);
        salary2.setCellValue(222000);

        XSSFCell salary3 = sheet.getRow(3).createCell(3);
        salary3.setCellValue(100000);

        XSSFCell salary4 = sheet.getRow(4).createCell(3);
        salary4.setCellValue(110000);


        // change Tom's last name to Jerry
        for (int i = 0; i <= sheet.getLastRowNum(); i++) {
            if(sheet.getRow(i).getCell(0).toString().equals("Tom")){
                sheet.getRow(i).getCell(1).setCellValue("Jerry");
            }

        }


        // save changes to the workbook
        FileOutputStream outputStream = new FileOutputStream(path);

        // save/write changes to the workbook
        workbook.write(outputStream);

        // close all
        outputStream.close();
        workbook.close();
        fileInputStream.close();
    }
}
