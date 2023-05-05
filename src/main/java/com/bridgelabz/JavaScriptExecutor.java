package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.ScriptKey;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.JavascriptExecutor.*;

public class JavaScriptExecutor {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\91762\\IdeaProjects\\CQA115Selenium\\src\\main\\java\\com\\bridgelabz\\test.Html.html");

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        Thread.sleep(2000);

        driver.findElement(By.id("username")).sendKeys("Omkar");
        Thread.sleep(3000);
      //  driver.findElement(By.id("pass")).sendKeys("omkar123");

        javascriptExecutor.executeScript("document.getElementById('pass').value='omkar123'");
        Thread.sleep(3000);
        driver.close();


    }
}
