package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpAlertHandling
{
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pahal\\IdeaProjects\\SeleniumExample\\src\\test\\WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://mail.rediff.com/cgi-bin/login.cgi");

        driver.findElement(By.xpath("//input[@type='submit']")).click();

        Alert alert=driver.switchTo().alert();// swith to alert pop up

        System.out.println(alert.getText());// will give alert window text

        // we can validate that
        String text= alert.getText();
        if (text.equals("Please enter a valid user name"))
        {
            System.out.println("correct alert message");
        }
        else
        {
            System.out.println("incorrect alert message");
        }

        Thread.sleep(2000);
        alert.accept();//it will click on ok button
        //alert.dismiss();// if there is cancel button so u can dismiss


    }
}
