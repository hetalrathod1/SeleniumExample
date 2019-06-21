package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HoverMethod {
    public static void main(String args[])
    {

    System.setProperty("webdriver.chrome.driver","C:\\Users\\Pahal\\IdeaProjects\\SeleniumExample\\src\\test\\WebDriver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
        WebElement ele= driver.findElement(By.xpath("//button[@class='dropbtn'][1]")); //xpath store in ele or you can use direct
        Actions act=new Actions(driver);
        act.moveToElement(ele).perform();// single element .perform if multiple we use build.perform

       List<WebElement> links=driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));//xpath of multiple element(all link) so store in list

        //counting total number of link
        int count_link=links.size();

        //print all link
        for (int i=0; i<count_link; i++)
        {
            WebElement element=links.get(i);
            String text=element.getAttribute("innerHTML");//that means link name(can use gettext() as wellubstead if getattrubute

           boolean status=element.isEnabled(); //to check link is enable or not when performing

            System.out.println("Link name is "+text+"and the link status is "+status);// print all link name and checking enable or not

            if (text.equalsIgnoreCase("Appium"))// selecting appium link n click
            {
                element.click();
                break; // just break loop to go tp further link
            }
        }
}
}
