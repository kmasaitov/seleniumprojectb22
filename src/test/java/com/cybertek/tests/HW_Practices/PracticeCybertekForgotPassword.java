package com.cybertek.tests.HW_Practices;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeCybertekForgotPassword {
    public static void main(String[] args) {
        //TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/forgot_password
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH locator only (total of 6)
        //a. “Home” link
        WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));
        //b. “Forgot password” header
        WebElement forgotPassword = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        //c. “E-mail” text
        WebElement email = driver.findElement(By.xpath("//label[@for='email']"));
        //d. E-mail input box
        WebElement inputBox = driver.findElement(By.xpath("//input[@type='text']"));
        //   //input[@name='email'] this is another way of finding webelement for input box

        //e. “Retrieve password” button
        WebElement retPass = driver.findElement(By.xpath("//i[.='Retrieve password']"));

        //f. “Powered by Cybertek School” text
        WebElement poweredByText = driver.findElement(By.xpath("//a[.='Cybertek School']/.."));

        //4. Verify all WebElements are displayed.
        if (homeLink.isDisplayed() && forgotPassword.isDisplayed() && email.isDisplayed() &&
                inputBox.isDisplayed() && retPass.isDisplayed() && poweredByText.isDisplayed()){
            System.out.println("All elements are displayed. PASS");
        } else {
            System.out.println("Some elements are missing. FAILED");
        }



    }

}
