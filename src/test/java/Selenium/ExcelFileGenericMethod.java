package Selenium;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelFileGenericMethod
{
    XSSFWorkbook wb;
    XSSFSheet sheet1;

     public ExcelFileGenericMethod(String excelfilepath)     {
      try {
          File src = new File(excelfilepath);
          //Create an object of FileInputStream class to read excel file
          FileInputStream fis = new FileInputStream(src);

          // need to add poi-ooxml maven dependency
          // workbook  will read fis (fileinputstram) n load

          wb = new XSSFWorkbook(fis);// dealing with xlsx file

      }catch (Exception e)
      {
        e.getMessage();
      }
     }

     public String getData(int sheetnumber,int row, int column)

     {
        sheet1=wb.getSheetAt(sheetnumber);
         String data=sheet1.getRow(row).getCell(column).getStringCellValue();
         return data;
     }
}
