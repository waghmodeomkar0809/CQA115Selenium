package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("C:\\Users\\91762\\IdeaProjects\\CQA115Selenium\\src\\main\\java\\com\\bridgelabz\\page3.html");
        Thread.sleep(3000);
        driver.findElement(By.id("t3")).sendKeys("t3 text field");
        Thread.sleep(3000);

        driver.switchTo().frame("f2");
        driver.findElement(By.id("t2")).sendKeys("t2 text field");
        Thread.sleep(3000);

        driver.switchTo().frame("f1");
        driver.findElement(By.id("t1")).sendKeys("t1 text field");
        Thread.sleep(3000);
        driver.quit();

    }
}
