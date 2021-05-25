package com.cybertek.tests.day6_testing_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {
    @BeforeClass
    public void setupClass(){
        System.out.println("-----> Before class is running");
    }

    @AfterClass
    public void teardownClass() {
        System.out.println("-----> After Class is running");
    }

    @BeforeMethod
    public void setupMethod(){
        System.out.println("---> Before method is running");
    }

    @AfterMethod
    public void teardownMethod(){
        System.out.println("---> After Method is running...");
    }

    @Test
    public void test1() {
        System.out.println("Running test 1 Number 1...");
        String actual = "apple";
        String expected = "apples";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test2 () {
        System.out.println("Running test 2 Number 2...");
        String actual = "apple";
        String expected = "apples";
        Assert.assertTrue(actual.equals(expected));
    }
}
