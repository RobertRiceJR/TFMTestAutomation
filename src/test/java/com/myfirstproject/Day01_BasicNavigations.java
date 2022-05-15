package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_BasicNavigations {

//Create a new class under :BasicNAvigations
    //Create main method
    //Set Path
    //Create chrome driver
    //Maximize the window
    // Open google homepage
    // on same class, navigate to amazon homepage
    //Navigatea back to google
    //NAvigate forward to amazon
    //Refresh the page
    // Close/Quit the browser

    static String w = "C:/Users/terri/OneDrive/Desktop/selenium dependencies/drivers/chromedriver.exe";
    static String q =  "webdriver.chrome.driver";
    public static void main (String[] args){
        System.setProperty("webdriver.chrome.driver", w);
        //Create chrome driver
        WebDriver driver = new ChromeDriver();
        //Maximize the window
        driver.manage().window().maximize();
        //open googe home page
        driver.get("https://www.google.com");

        //On the same class, Navigatea to amazon home page
        /*
        There are 2 ways to go to a page
        1) get()
        2) navigate().to

        What is the difference between get and navigate
        get() is easier to use
        get() is a little faster
        get() takes only string paramter
        navigate().to()

        what is the difference between close and quit
        First both closes the driver (browser).
        close() ---> closes only the current active driver
        quit() ----> closes ALL browsers that is open during that test run
         */
        driver.navigate().to("https://www.amazon.com");

        driver.navigate().back();

        //NAvitage forward to amazon

        driver.navigate().forward();

        //refresh the page

        driver.navigate().refresh();

        //close/quite the browser

        driver.quit();


    }

}
