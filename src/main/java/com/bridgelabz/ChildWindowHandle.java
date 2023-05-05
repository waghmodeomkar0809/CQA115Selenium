package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;

public class ChildWindowHandle {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\selenium\\chromedriver.exe");

        ChromeOptions Options = new ChromeOptions();
        Options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(Options);
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com/");

        String parentWindowHandelId = driver.getWindowHandle();
        System.out.println(" Parent Window handle id:" + parentWindowHandelId);
        System.out.println("Parent Window Title:"+driver.getTitle());

        driver.findElement(By.xpath("//span[contains(text(),'Remote')]")).click();

        Set<String> windowHandles = driver.getWindowHandles();

        for (String windowHandle : windowHandles) {
            System.out.println("window handle Id:"+windowHandle);

            if (!windowHandle.equals(parentWindowHandelId)) {
                driver.switchTo().window(windowHandle);
                System.out.println("Child Window Title:"+driver.getTitle());
            }
        }
        Thread.sleep(5000);
         driver.findElement(By.xpath("//a[contains(text(),'Immediate requirement For Data Engineer @Infogain')]")).click();
         Thread.sleep(4000);
         driver.quit();
    }
}
