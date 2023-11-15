package com.hrm2live;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginApplication {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Documents\\Drivers\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();

    }
}
