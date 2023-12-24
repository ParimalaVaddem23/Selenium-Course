package com.qascript;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;


public class FirstTest {


    @Test
    public void OpenBrowser()  {
        WebDriver driver;
       // System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
//        options.addArguments("disable-gpu");
        options.addArguments("--no-sandbox");
       // options.addArguments("--disable-setuid-sandbox");
       // options.addArguments("--disable-dev-shm-usage");


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        //maximize window
         System.out.println("maximize window");
            driver.manage().window().maximize();
        System.out.println("add timeout");
            //add implicit timeout
            driver.manage()
                    .timeouts()
                    .implicitlyWait(Duration.ofSeconds(30));
       System.out.println("launching browser");
        driver.get("https://www.google.com");
         System.out.println("getting title");
        System.out.println("Title of the page is: " + driver.getTitle());
        //Assert.assertTrue("Page title is not correct",driver.getTitle().equals("Google"));
    }


}


