package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class FileUpload {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\selenium\\chromedriver.exe");

        ChromeOptions Options = new ChromeOptions();
        Options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(Options);
        driver.manage().window().maximize();
        driver.get("https://www.ilovepdf.com/excel_to_pdf");

        driver.findElement(By.xpath("//span[contains(text(),'Select EXCEL files')]")).click();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("\"C:\\Users\\91762\\Documents\\Fileuplodtest.exe\"");
    }
}
