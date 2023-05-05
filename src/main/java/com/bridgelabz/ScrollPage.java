package com.bridgelabz;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;

        for (int i=0;i<10;i++){

            javascriptExecutor.executeScript("window.scrollBy(0,800)");
            Thread.sleep(2000);
        }
        Thread.sleep(3000);
        driver.close();


    }

}
