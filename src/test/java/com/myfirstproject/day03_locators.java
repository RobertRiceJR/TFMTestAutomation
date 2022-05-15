package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.http.WebSocket;
import java.util.List;

import static com.myfirstproject.Day01_BasicNavigations.w;

public class day03_locators {

        /*
         * How many locators are there in selenium?
         * 8
         * What are they?
         * id, name, className, tagName, linkText, partialLinkText, xpath, css
         * What is findElement() method?
         * To locate the elements. Return type is WebElement
         * Which locator do you prefer?
         * I prefer id, cause id is unique, easy to locate, and a little faster that xpath or css
         * If there is no id, then i use other unique elements such as name, class,...
         * If no appropriate locator is there, then I write dynamic xpath
         *
         * */
        @Test
        public void locators(){
//        Prerequisites
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        user goes to http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");
//        Locate the elements of email textbox, password textbox, and signin button
//        Email
        driver.findElement(By.id("session_email")).sendKeys("testtechproed@gmail.com");
//        Password
        driver.findElement(By.id("session_password")).sendKeys("Test1234!");
//        click on sign in button
//        driver.findElement(By.name("commit")).click();
//        ALTERNATIVELY we can first locate the element then click
        WebElement signInButton = driver.findElement(By.name("commit"));
        signInButton.click();
//        Then verify that the expected user id testtechproed@gmail.com (USE getText() method to get the text from the page)
//        Verify the Addresses and Sign Out texts are displayed
//        Find the number of total link on the page
//        Sign out from the page

            WebElement idElemnent = driver.findElement(By.className("navbar-text"));
            System.out.println(idElemnent.getText());
            String idElementText = idElemnent.getText();
            Assert.assertEquals("testtechproed@gmail.com", idElementText);

    // Verify the Addresses and Sign Out texts are displayed
            // Address is a link. SO i cna uselinkText or prtialLinkText
            WebElement address= driver.findElement(By.linkText("Addresses"));
            //driver.findElement(By.partialLinkText("Addresses"));
        Assert.assertTrue(address.isDisplayed());

        WebElement signout = driver.findElement(By.partialLinkText("Sign out"));
            Assert.assertTrue(signout.isDisplayed());

           List<WebElement> alllinks = driver.findElements(By.tagName("a"));
           int numberoflinks = alllinks.size();
            System.out.println("Numberof Links : " +  numberoflinks);

            driver.findElement(By.linkText("Sign out")).click();

            //if user signed out successfuyylly, that means the url signs out
            boolean isSignedOut = driver.getCurrentUrl().equals("http://a.testaddressbook.com/sign_in");
            Assert.assertTrue(isSignedOut);

            boolean isSignOut1 = driver.findElement(By.name("commit")).isDisplayed();
            Assert.assertTrue(isSignOut1);
        }
    }
