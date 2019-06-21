package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GoogleSearchTest
{
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pahal\\IdeaProjects\\SeleniumExample\\src\\test\\WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java");

        // xpath of all elements
        List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li"));

//        System.out.println(list.size());
//        for(int i=0; i<list.size();i++) {
//            System.out.println(list.get(i));
//
//            if(list.get(i).getText().trim().contains("java interview questions") || list.get(i).getText().trim().equalsIgnoreCase("java interview questions")) {
//                list.get(i).click();
//                break;
//            }
//
      //  }







    }
    }
