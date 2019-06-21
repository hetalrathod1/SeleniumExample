package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp
{
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pahal\\IdeaProjects\\SeleniumExample\\src\\test\\WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("  https://html.com/input-type-file/");

        // Dont use .click because if u use .click it will open from where to dowload ..so give sendkey n give path
        // also make sure in xpath type=file is their
        driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\Pahal\\Desktop\\chirag.txt");
    }
}
