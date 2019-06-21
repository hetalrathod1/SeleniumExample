package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmLogin
{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Pahal\\IdeaProjects\\SeleniumExample\\src\\test\\WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");

        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Qedge123!@#");
        driver.findElement(By.xpath("//input[@class='button']")).click();
    }
}
