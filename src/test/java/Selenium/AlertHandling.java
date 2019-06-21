package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;


public class AlertHandling
{
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Pahal\\IdeaProjects\\SeleniumExample\\src\\test\\WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");


        driver.findElement(By.xpath("//input[@name='proceed']")).click();

        //switching to alert
        Alert alert=driver.switchTo().alert();

        //capturing alert message


        String alertMessage=driver.switchTo().alert().getText();

        //displaying alert message
        System.out.println(alertMessage);
        Thread.sleep(5000);

        //Accepting alert
        alert.accept();
        //cancel alert
        //alert.dismiss();




    }
}
