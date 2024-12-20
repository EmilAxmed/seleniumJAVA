package org.example;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.tracing.Span;
import org.openqa.selenium.support.ui.Select;
import java.util.List;


class test4 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C://chrome/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://useinsider.com/careers/quality-assurance/";
        driver.get(baseUrl);
        //It will page full screen mode
        driver.manage().window().maximize();


        //Accept the cookies
        WebElement AcceptCookies = driver.findElement(By.xpath("//a[@id='wt-cli-accept-all-btn']"));
        AcceptCookies.click();

        //Find All qa jobs
        WebElement allQA = driver.findElement(By.cssSelector("#page-head > div > div > div.col-12.col-lg-7.order-2.order-lg-1 > div > div > a"));
        allQA.click();


        //Filter jobs by Location //
        WebElement locationFilter = driver.findElement(By.xpath("//*[@id=\"select2-filter-by-location-container\"]"));
        locationFilter.click();
        //I will send bug which is appeared in here.I take video record of bug

        //Filter jobs by Location //
        //I  sent bug which was appeared in here.


    }
}