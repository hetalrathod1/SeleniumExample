package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ChatBotExample {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pahal\\IdeaProjects\\SeleniumExample\\src\\test\\WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ksrtc.in/oprs-web/guest/home.do?h=1");

        List<WebElement> list=driver.findElements(By.xpath("//div[@id='corover-close-btn']"));
        System.out.println(list.size());

        System.out.println("found chat bot");
        if (list.size()>0)
        {
            list.get(0).click();
            System.out.println("closing chat bot");
        }
    }
}

