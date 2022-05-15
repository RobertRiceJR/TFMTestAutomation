package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.page.Page;

import static com.myfirstproject.Day01_BasicNavigations.w;

public class Day02_GetPageSource {

    public static void main (String [] args ){
        System.setProperty("webdriver.chrome.driver", w );
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
        if (pageSource.contains("Registry")) {
            System.out.println("Pass");
            }else{
            System.out.println("no");

            driver.quit();
        }
    }
}
