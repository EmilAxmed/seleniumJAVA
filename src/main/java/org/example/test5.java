package org.example;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.tracing.Span;
import org.openqa.selenium.support.ui.Select;
import java.util.List;


class test5 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C://chrome/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://useinsider.com/careers/open-positions/?department=qualityassurance";
        driver.get(baseUrl);
        //It will page full screen mode
        driver.manage().window().maximize();


        //Accept the cookies
        WebElement AcceptCookies = driver.findElement(By.xpath("//a[@id='wt-cli-accept-all-btn']"));
        AcceptCookies.click();

        //Find All qa jobs
        WebElement viewRole = driver.findElement(By.xpath("//*[@id=\"jobs-list\"]/div[1]/div/a"));
        driver.wait(50);
        Thread.sleep(100);
        //Department module has bug so can list job every time and click on view role
        //But know how we can check that.If in here do not have ant issues we can use driver.getcurrenturl method and we know where button redirect us





    }
}