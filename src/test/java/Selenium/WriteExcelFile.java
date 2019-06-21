package Selenium;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelFile {

    public static void main(String args[]) throws IOException {

        // add apache poi jar file and add all jar file from all folder


        File src = new File("C:\\Users\\Pahal\\Desktop\\software testing\\homework\\ReadDataFromExcel.xlsx");

        FileInputStream fis = new FileInputStream(src);// to read data fileinputstream

        // need to add poi-ooxml maven dependency
        // workbook  will read fis (fileinputstram) n load

        XSSFWorkbook wb = new XSSFWorkbook(fis);// dealing with xlsx file

        // HSSFWorkbook wb = new HSSFWorkbook(fis);// if dealing with .xlx file


        // Load sheet- Here we are loading first sheetonly
        // HSSFSheet sheet1 = wb.getSheetAt(0);

        XSSFSheet sheet1 = wb.getSheetAt(0);//load sheet index 0 means it will read first sheet

        sheet1.getRow(0).createCell(2).setCellValue("pass");
        sheet1.getRow(1).createCell(2).setCellValue("fail");


        sheet1.getRow(2).createCell(2).setCellValue("pass");
        sheet1.getRow(3).createCell(2).setCellValue("fail");

        FileOutputStream fout=new FileOutputStream(src);//to write data fileoutputstream to use
        wb.write(fout);

       // wb.close();
    }
}