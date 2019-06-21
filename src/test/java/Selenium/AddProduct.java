package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AddProduct
{
    public static void main (String args[]) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pahal\\IdeaProjects\\SeleniumExample\\src\\test\\WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.linkText("Books")).click();
        driver.findElement(By.linkText("First Prize Pies")).click();
        driver.findElement(By.xpath("//input[@id='add-to-cart-button-38']")).click();

        String actresult=driver.findElement(By.xpath("//a[contains(text(),'shopping cart')]")).getText();
        Assert.assertEquals("The product has been added to your shopping cart",actresult);

        driver.findElement(By.xpath("//a[contains(text(),'Pride and Prejudice')]")).click();
        driver.findElement(By.xpath(""));


    }
}
