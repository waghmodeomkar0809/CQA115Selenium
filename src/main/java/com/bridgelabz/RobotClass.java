package com.bridgelabz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class RobotClass {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        Robot robot = new Robot();
        Thread.sleep(5000);

        robot.mouseMove(300, 500);
        Thread.sleep(5000);
        driver.close();


        //driver.navigate().to("https://www.facebook.com/");
        //Thread.sleep(2000);

    }
}
