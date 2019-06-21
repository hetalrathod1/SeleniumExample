package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class BrowserWindowPopUpHandle {

    //alerts - javascripts pop up[alert API(accept,dismiss)
    //file upload popup - browser button(type=file,sendkeys(path)
    //browser window popup -advertisement popup-windowhandler API[getwindowhandles()]


    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pahal\\IdeaProjects\\SeleniumExample\\src\\test\\WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" http://www.popuptest.com/");

        driver.findElement(By.linkText("Come & Go Test")).click();
        Thread.sleep(2000);

        Set<String> handles=driver.getWindowHandles();// it will navigate to malitple window with object name handles

        // set object does not store value of index base like for loop so we have to use iterator

        Iterator <String> it=handles.iterator();

        //first window id
        String parentWindowId =it.next();
        System.out.println(parentWindowId+"parentwindowid");

        Thread.sleep(2000);
        //second window id
        String childWindowId=it.next();
        System.out.println(childWindowId+"childWindow");

        //third window id
//        String childWindowId2= it.next();
//        System.out.println("subchild window title"+childWindowId2);


        Thread.sleep(2000);
        //switch to window
        driver.switchTo().window(childWindowId);

        System.out.println("child window title"+driver.getTitle());//child window title
        driver.close(); // close child window

        driver.switchTo().window(parentWindowId);// comeback of parent window

        Thread.sleep(2000);
        System.out.println("parent window title"+driver.getTitle());

        driver.close();

//        driver.switchTo().window(childWindowId);

//        System.out.println("child window title"+driver.getTitle());
  //     driver.close();




    }
}
