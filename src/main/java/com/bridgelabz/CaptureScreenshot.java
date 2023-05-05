package com.bridgelabz;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class CaptureScreenshot {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        TakesScreenshot TakesScreenshot = (TakesScreenshot) driver;

        File SourceFile = TakesScreenshot.getScreenshotAs(OutputType.FILE);

        File destinationFile = new File(System.currentTimeMillis() + "ScreenShot.png");

        try {
            FileHandler.copy(SourceFile,destinationFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Thread.sleep(3000);
        driver.close();
    }
}
