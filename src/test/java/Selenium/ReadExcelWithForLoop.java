package Selenium;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcelWithForLoop
{
    public static void main(String args[]) throws IOException {


        // add apache poi jar file and add all jar file from all folder

        //Create an object of File class n give path of xlsx file
    File src = new File("C:\\Users\\Pahal\\Desktop\\software testing\\homework\\ReadDataFromExcel.xlsx");

    //Create an object of FileInputStream class to read excel file
    FileInputStream fis = new FileInputStream(src);

    // need to add poi-ooxml maven dependency
    // workbook  will read fis (fileinputstram) n load

    XSSFWorkbook wb = new XSSFWorkbook(fis);// dealing with xlsx file

    // HSSFWorkbook wb = new HSSFWorkbook(fis);// if dealing with .xlx file
        // Load sheet- Here we are loading first sheetonly
    // HSSFSheet sheet1 = wb.getSheetAt(0);

        XSSFSheet sheet1 = wb.getSheetAt(0);//load sheet index 0 means it will read first sheet

      int rowCount=  sheet1.getLastRowNum();// count how many row we have from excel fine

        System.out.println("total no of row = "+rowCount);

        for (int i=0; i<rowCount; i++)
        {
            String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
            System.out.println("data from excel is ="+data0);
        }
       // wb.close();
    }
}
