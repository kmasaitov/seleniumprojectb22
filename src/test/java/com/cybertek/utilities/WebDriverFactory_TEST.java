package com.cybertek.utilities;

import org.openqa.selenium.WebDriver;

public class WebDriverFactory_TEST {
    public static void main(String[] args) {
//        WebDriverManager.chromedriver().setup();
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.manage().window().maximize();

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/");

        String expectedInUrl = "cybertekschool";

        String actualUrl = driver.getCurrentUrl();

        if ( actualUrl.contains(expectedInUrl)){
            System.out.println("URL Verification PASSED");
        } else {
            System.out.println("URL Verification FAILED");
        }

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if ( actualTitle.equals(expectedTitle)){
            System.out.println("Title Verification PASSED");
        } else {
            System.out.println("Title Verification FAILED");
        }


    }
}
