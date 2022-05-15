package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.myfirstproject.Day01_BasicNavigations.q;
import static com.myfirstproject.Day01_BasicNavigations.w;

public class day02_VerifyURLTest {

    public static void main (String [] args) {

     System.setProperty("webdriver.chrome.driver",  w);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        String expectedUrl = "https://www.google.com/";
        String actualURL = driver.getCurrentUrl();

        if (expectedUrl.equals(actualURL)){
            System.out.println("The URLs are equal");
            System.out.println("Expected URL is " + expectedUrl);
            System.out.println("Actual URL is " + actualURL);
        }else{
            System.out.println("These URLs are NOT equal");
            System.out.println("Expected URL is " + expectedUrl);
            System.out.println("Actual URL is " + actualURL);


            /*
            When a test case fails
            1. Rerun your test one more time
            2. Do manual testing to make sure
            3. Contact with Developer
            4. Contact with BA
            - Check if this is a docyument issue (spelling,....)
            - If that is a documentation issue, then let teh BA fix the doc s
            - And correct your test case
            5. If that is actual bug???
            -Raise a bug ticket with JIRA
            -Assign is to the dewv
            6. After dev fix the issue and deploy the code in the test enviorment
            - Retest manually, then run your automation script
             */
        }

    }
}
