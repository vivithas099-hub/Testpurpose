package com.test.tancem.Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basepage {
    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        // Enable incognito mode
    //    options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://staging.tancem.org/login");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        System.out.println(">>> Browser launched once per class");

    }

}

    // @AfterMethod
    // public void tearDown() {
    //     if (driver != null) {
    //         driver.quit();
    //     }
    

