package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class GetAllLinks {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\selenium\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");

        List<WebElement> totoaLinks = driver.findElements(By.tagName("a"));
        System.out.println("Total link present on wabpage:"+totoaLinks.size());

        int visibalelinkcount = 0, Hiddenlinkcount =0;

        for (WebElement link : totoaLinks){

            if (link.isDisplayed()){
                visibalelinkcount++;
                System.out.println("visibal link count:"+link);
            }
            else {
                Hiddenlinkcount++;
            }
        }
        System.out.println("Total visibal link:"+visibalelinkcount);
        System.out.println("Total Hidden link:"+Hiddenlinkcount);

     Thread.sleep(2000);
        driver.quit();

    }
}
