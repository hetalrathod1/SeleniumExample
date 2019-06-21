package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlUnitDriver
{
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pahal\\IdeaProjects\\SeleniumExample\\src\\test\\WebDriver\\chromedriver.exe");
      //  WebDriver driver = new ChromeDriver();

        WebDriver driver= new org.openqa.selenium.htmlunit.HtmlUnitDriver();
        driver.manage().window().maximize();
        driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
        System.out.println("Before login ="+driver.getTitle());

        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Qedge123!@#");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        System.out.println("after login "+driver.getTitle());
    }
    }
