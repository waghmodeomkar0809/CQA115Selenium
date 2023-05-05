package com.bridgelabz;

import net.bytebuddy.dynamic.TypeResolutionStrategy;
import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v106.page.model.ScreencastFrame;

import java.awt.*;

public class SeleniumDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("8109555221");
        Thread.sleep(2000);

        driver.findElement(By.name("pass")).sendKeys("Test12345");
        Thread.sleep(2000);

//        driver.findElement(By.name("pass")).submit();

        driver.findElement(By.name("login")).click();
        Thread.sleep(2000);

         driver.findElement(By.linkText("Create new account")).click();
         Thread.sleep(2000);

        driver.findElement(By.name("firstname")).sendKeys("omkar");
        Thread.sleep(2000);

        driver.findElement(By.name("lastname")).sendKeys("waghmode");
        Thread.sleep(2000);

        driver.findElement(By.name("reg_email__")).sendKeys("8065080968");
        Thread.sleep(2000);

        driver.findElement(By.name("reg_passwd__")).sendKeys("8065080968");
        Thread.sleep(2000);

        driver.findElement(By.id("day")).sendKeys("15");
        Thread.sleep(2000);

        driver.findElement(By.id("month")).sendKeys("march");
        Thread.sleep(2000);

        driver.findElement(By.id("year")).sendKeys("1997");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
        Thread.sleep(2000);


        //Point loginCoordinate = driver.findElement(By.name("login")).getLocation();
        //System.out.println("X-Coordinate:" + loginCoordinate.getX());
        //System.out.println("Y-Coordinate:" +loginCoordinate.getY());

        //  Dimension LoginBtnDimention = driver.findElement(By.name("login")).getSize();
        //System.out.println("Height:" + LoginBtnDimention.getHeight());
        //System.out.println("Width:" + LoginBtnDimention.getWidth());

//        WebElement loginButton = (WebElement) driver.findElement(By.name("login"));
//        Rectangle loginButtonRect = loginButton.getRect();
//        System.out.println(loginButtonRect.getHeight());
//        System.out.println(loginButtonRect.getWidth());
//        System.out.println(loginButtonRect.getX());
//        System.out.println(loginButtonRect.getY());


        String actualtitle = driver.getTitle();
        System.out.println("title of the page: " + actualtitle );
        String expectedtitle = "Facebook---";

        if (expectedtitle.equals(actualtitle));

        { System.out.println("Home page is loaded ... ");}

        { System.out.println("Home page not loaded ... ");}
        driver.quit();

    }
}
