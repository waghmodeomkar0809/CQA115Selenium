package com.bridgelabz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

public class FileDownloadPopup {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\selenium\\chromedriver.exe");

        ChromeOptions Options = new ChromeOptions();
        HashMap<String, Object> chromeprefs =new HashMap<String,Object>();
        chromeprefs.put("profile.default_content_setting.popups",0);
        String downloadFilepath = System.getProperty("C:\\Users\\91762\\IdeaProjects\\CQA115Selenium");
        chromeprefs.put("download.default_directory", downloadFilepath);
        Options.setExperimentalOption("prefs",chromeprefs);
        Options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(Options);
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/p/page7.html");

        driver.findElement(By.linkText("ZIP file")).click();
        Thread.sleep(5000);

        File file = new File(downloadFilepath+"\\DownloadDemo-master.zip");
        if (file.exists()) {
            System.out.println("File got Download Successfully");
        }else
            System.out.println("file not Download");

    }
}
