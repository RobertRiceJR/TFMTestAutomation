package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.myfirstproject.Day01_BasicNavigations.w;

public class REview1 {

    public static void main (String [] args){
        System.setProperty("webdriver.chrome.driver", w);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com");
        String expectedTitle = "youtube";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)){
            System.out.println("The titles match");
        }else{
            System.out.println("The correct title is" + actualTitle);
        }
        driver.get("https://www.amazon.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.manage().window().maximize();
        String actualPageTitle = driver.getTitle();
        if (actualPageTitle.contains("Amazon")){
            System.out.println("Pass");
        }else{
            System.out.println("The actual title is " + actualPageTitle);
            String expectedURL = "https://www.amazon.com/";
            String actualURL = driver.getCurrentUrl();
            if (expectedURL.equals(actualURL)){
                System.out.println("The URLs match");
            }else{
                System.out.println("The correct URL is" + actualURL);
            }
        }
        driver.quit();
    }
}
