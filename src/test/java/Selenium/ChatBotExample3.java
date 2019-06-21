package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChatBotExample3 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pahal\\IdeaProjects\\SeleniumExample\\src\\test\\WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.crmpro.com/index.html");

        WebDriverWait wait=new WebDriverWait(driver,30);
        System.out.println("waiting for frame");
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@title='Intercom live chat message']")));

        System.out.println("frame found and swithched to it");

        //mouse hover to text msg display in chat window so it can show close button sign
        Actions actions=new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Sign up the ')]"))).build().perform();
        System.out.println("mouse hover");
        // close text chat window
        driver.findElement(By.xpath("//div[@class='intercom-borderless-dismiss-button']")).click();
        System.out.println("closing chat bot");
    }


    }
