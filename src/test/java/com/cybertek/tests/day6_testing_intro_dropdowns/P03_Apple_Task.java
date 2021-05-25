package com.cybertek.tests.day6_testing_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P03_Apple_Task {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.get("http://www.apple.com");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        List<WebElement> headers = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li//a"));

        for (int i = 1; i < headers.size()-2 ; i++) {
            //Click to all of the headers one by one
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            headers.get(i).click();

            //  Print out the titles of the each page
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            System.out.println("Page title :" + driver.getTitle());

            //Print out total number of links in each page
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            List<WebElement> allLinks = driver.findElements(By.tagName("a"));


            //  While in each page:
            int noText = 0;
            for (WebElement each : allLinks){
                if (each.getText().isEmpty()){
                    noText++;
                }else {

                }
            }
            System.out.println("--->Total link that missing text: " + noText);
            System.out.println("--->Total link that are NOT missing text: " +( allLinks.size()-noText));

            // to find the elements again after refresh
            headers = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li//a"));


        }


        driver.close();
    }
}
