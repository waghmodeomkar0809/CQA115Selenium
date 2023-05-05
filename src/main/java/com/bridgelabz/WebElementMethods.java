package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
        Thread.sleep(3000);

      System.out.println(driver.findElement(By.xpath("//input[@class='gsc-search-button'][@type='submit']")).isDisplayed());
       driver.quit();

         System.out.println(driver.findElement(By.xpath("//input[@id='hbutton']")).isDisplayed());
         driver.quit();

        System.out.println(driver.findElement(By.id("but2")).isEnabled());
        driver.quit();

        System.out.println(driver.findElement(By.id("but1")).isEnabled());
       driver.quit();

        System.out.println(driver.findElement(By.id("checkbox1")).isSelected());
        driver.quit();

        System.out.println(driver.findElement(By.id("checkbox2")).isSelected());
        driver.quit();

          String textOnButton = driver.findElement(By.xpath("//input[@class='gsc-search-button'][@type='submit']")).getAttribute("value");
          System.out.println(textOnButton);
          driver.quit();

        String text = driver.findElement(By.id("pah")).getText();
        System.out.println(text);
        driver.quit();

        String tagName = driver.findElement(By.id("alert1")).getTagName();
        System.out.println(tagName);
        driver.quit();

        String linehieghtOnHomePage = driver.findElement(By.id("home")).getCssValue("line-height");
        System.out.println(linehieghtOnHomePage);
        driver.close();

        driver.findElement(By.id("textbox1")).clear();


    }
}
