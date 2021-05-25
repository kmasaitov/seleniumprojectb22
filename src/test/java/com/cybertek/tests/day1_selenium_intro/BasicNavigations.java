package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        // 1. Set up the browser Web driver manager
        WebDriverManager.chromedriver().setup();

        // 2. Create instance of selenium web driver
        WebDriver driver = new ChromeDriver();

        // This line basically maximizes the browser size ( making it full screen)
        driver.manage().window().maximize();


        // 3. get the tesla.com
        driver.get("http://www.tesla.com");

        System.out.println("Current title: " + driver.getTitle());

        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        // putting 3 seconds of wait/stop for the code for 3 sec
        Thread.sleep(1500);

        // 4. Going back using navigation
        driver.navigate().back();

        // putting 3 seconds of wait/stop time
        Thread.sleep(1500);

        // 5. Going forward using navigation
        driver.navigate().forward();

        // putting 3 seconds of wait/stop for the code for 3 sec
        Thread.sleep(1500);

        // 6. Going back using navigation
        driver.navigate().refresh();

        // putting 3 seconds of wait/stop for the code for 3 sec
        Thread.sleep(1500);

        // 7. Going to another url using .to() method
        driver.navigate().to("http://www.google.com");

        System.out.println("Current title: " + driver.getTitle());

        currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);




    }
}
