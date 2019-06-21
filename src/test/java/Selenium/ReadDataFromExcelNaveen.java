package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcelNaveen
{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pahal\\IdeaProjects\\SeleniumExample\\src\\test\\WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.getpostman.com/");

        driver.findElement(By.linkText("SIGN IN")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hetal@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234");


    }
}
