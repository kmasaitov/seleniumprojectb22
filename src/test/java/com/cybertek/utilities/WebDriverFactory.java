package com.cybertek.utilities;

//TASK: NEW METHOD CREATION
//Method name
//Static method
// Accepts String arg: browser Type
// = This arg will determine what type of browser is opened
// = if Chrome is passed --> it will open Chrome browser
// = if "firefox" passed --> it will open firefox browser
// RETURN TYPE: "WebDriver"

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverFactory {

        public static WebDriver getDriver(String name) {

            if (name.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                return driver;
            } else if (name.equalsIgnoreCase("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                WebDriver driver = new FirefoxDriver();
                driver.manage().window().maximize();
                return driver;
            } else {
                System.out.println("WebDriver not supported, please choose alternate driver");
                return null;
            }

        }
}
