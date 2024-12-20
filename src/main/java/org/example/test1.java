package org.example;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class test1 {
    public static void main(String[]args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C://chrome/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        String baseUrl = "https://useinsider.com/";
        driver.get(baseUrl);
        //It will page full screen mode
        driver.manage().window().maximize();

        //Accept the alerts
        //This page has some bugs on alerts even python can not handle allert
        //Alert alert=driver.switchTo().alert();
        //alert.accept();

         //Accept the cookies
         WebElement AcceptCookies= driver.findElement(By.xpath("//a[@id='wt-cli-accept-all-btn']"));
         AcceptCookies.click();


        //Taking the url of opened page
        String newUrl=driver.getCurrentUrl();

        //Check you went to right page
        if (baseUrl.equals(newUrl)) {
            System.out.println("Welcome,you are in Insider home page");
        }
        else {
            System.out.println("Unfortunately,you are not Insider page.You are in:");
            System.out.println(driver.getCurrentUrl());

        }
        Thread.sleep(300);
        driver.quit();
    }
}
