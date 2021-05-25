package com.cybertek.tests.day2_Locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_ZeroBankAttributeVerification {
    public static void main(String[] args) {
        //TC #2: Zero Bank link text verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement zeroBankLink = driver.findElement(By.className("brand"));
        //3. Verify link text from top left:
        //Expected: “Zero Bank”
        String expectedLinkText = "Zero Bank";
        String actualLinkText = zeroBankLink.getText();

        if (actualLinkText.equals(expectedLinkText)) {
            System.out.println("Header verification PASSED!");
        }else {
            System.out.println("Header verification FAILED!");
        }

        //4. Verify link href attribute value contains:
        //Expected: “index.html”
        String expectedInHrefValue = "index.html";
        String actualHrefValue = zeroBankLink.getAttribute("href");
        //System.out.println("actualHrefValue = " + actualHrefValue);

        if (actualHrefValue.contains(expectedInHrefValue)){
            System.out.println("Href Attribute Value verification PASSED!");
        }else {
            System.out.println("Href Attribute Value verification FAILED!");
        }
    }
}
