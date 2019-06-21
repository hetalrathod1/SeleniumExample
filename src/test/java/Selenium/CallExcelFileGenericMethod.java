package Selenium;

public class CallExcelFileGenericMethod
{
    public static void main(String args[]) {


        ExcelFileGenericMethod excelFileGenericMethod = new ExcelFileGenericMethod("C:\\Users\\Pahal\\Desktop\\software testing\\homework\\ReadDataFromExcel.xlsx");
        System.out.println(excelFileGenericMethod.getData(0,0,0));
    }
}

