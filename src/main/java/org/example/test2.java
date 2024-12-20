package org.example;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class test2 {
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

        //Select “Company” menu in navigation bar
        WebElement companyButton=driver.findElement(By.xpath("//body/nav[@id='navigation']/div[@class='container-fluid']/div[@id='navbarNavDropdown']/ul[@class='navbar-nav']/li[6]/a[1]"));
        companyButton.click();

        //Select Career module
        WebElement career=driver.findElement(By.xpath("//a[normalize-space()='Careers']"));
        career.click();

        //Check location blocks open in Page
        WebElement locationBlock=driver.findElement(By.cssSelector("#career-our-location > div > div > div > div.col-12.col-md-6 > h3 "));
        System.out.println(locationBlock.getText());

        //Check Teams blocks open in Page
        WebElement teamsblocks=driver.findElement(By.cssSelector("#career-find-our-calling > div > div > div.col-12.mb-xl-5.py-xl-4.py-2.text-center > h3"));
        System.out.println(teamsblocks.getText());

        //Check Life at Insider
        WebElement lifeatInsider=driver.findElement(By.cssSelector("body > div.elementor.elementor-22610 > section.elementor-section.elementor-top-section.elementor-element.elementor-element-a8e7b90.elementor-section-full_width.elementor-section-height-default.elementor-section-height-default > div > div > div > div.elementor-element.elementor-element-21cea83.elementor-widget.elementor-widget-heading > div > h2"));
        System.out.println(lifeatInsider.getText());

        Thread.sleep(300);


    }
}
