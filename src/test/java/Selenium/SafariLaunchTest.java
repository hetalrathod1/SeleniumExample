package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

import java.util.List;

public class SafariLaunchTest
{
    public static void main(String[] args) {
        WebDriver driver=new SafariDriver();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());

        }
}
