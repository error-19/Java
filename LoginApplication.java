package com.hrm2live;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class LoginApplication {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Documents\\Drivers\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        Thread.sleep(500);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        Thread.sleep(500);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(500);
        String expectedTitle="OrangeHRM";
        String actualTitle=driver.getTitle();
        System.out.println("Actual Page Title:" + " " + actualTitle);
        if(expectedTitle.equals(actualTitle)){
            System.out.println("Loged In Successfully and it's home page");
        }
    }
}
