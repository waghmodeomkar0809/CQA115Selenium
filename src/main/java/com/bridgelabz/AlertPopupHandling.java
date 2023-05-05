package com.bridgelabz;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertPopupHandling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\selenium\\chromedriver.exe");

        ChromeOptions Options = new ChromeOptions();
        Options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(Options);
        driver.manage().window().maximize();
        driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@value='Say my name!']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println("First Alert text:"+alert.getText());
        Thread.sleep(4000);
        alert.sendKeys("omkar");
        Thread.sleep(4000);
        alert.dismiss();

        System.out.println("Second Alert Text:"+alert.getText());
        alert.accept();
        Thread.sleep(8000);
        driver.close();
    }
}
