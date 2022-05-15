package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.myfirstproject.Day01_BasicNavigations.w;

public class day02_Threadsleep {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", w);

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        Thread.sleep(5000);
        driver.get("https://www.amazon.com");

        Thread.sleep(10000);

        driver.quit();
    }

}
