package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.myfirstproject.Day01_BasicNavigations.w;

public class VerifyTitleTest {

    public static void main (String [] args){


        System.setProperty("webdriver.chrome.driver", w);

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.manage().window().maximize();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        if( actualTitle.equals(actualTitle)){
            System.out.println("Pass");
            System.out.println("Expected : " +expectedTitle);
            System.out.println("Actual : " + actualTitle );
        }else{
            System.out.println("Failed");
            System.out.println("Expected : " +expectedTitle);
            System.out.println("Actual : " + actualTitle );
        }
    }
}
