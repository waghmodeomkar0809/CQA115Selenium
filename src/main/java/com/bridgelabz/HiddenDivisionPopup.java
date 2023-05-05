package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HiddenDivisionPopup {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\selenium\\chromedriver.exe");

        ChromeOptions Options = new ChromeOptions();
        Options.addArguments("--diseble-Notification");
        WebDriver driver = new ChromeDriver(Options);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("8109555221");
        driver.findElement(By.name("pass")).sendKeys("Test12345");

        Thread.sleep(2000);

        driver.findElement(By.name("login")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("")).click();
        Thread.sleep(2000);
        driver.close();

    }
}
