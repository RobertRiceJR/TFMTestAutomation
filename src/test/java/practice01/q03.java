package practice01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class q03 {

    /*
    // ...Exercise3...
// go to url : https://www.techlistic.com/p/selenium-practice-form.html
//fill the firstname
//fill the lastname
//check the gender
//check the experience
//fill the date
//choose your profession -> Automation Tester
//choose your tool -> Selenium Webdriver
//choose your continent -> Antartica
//choose your command  -> Browser Commands
//click submit button

     */
    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void test01 () throws InterruptedException {
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        Thread.sleep(3000);
    //fill the firstname
        driver.findElement(By.name("firstname")).sendKeys("Howdy");
        driver.findElement(By.name("lastname")).sendKeys("NowWhat");
        driver.findElement(By.id("sex-0")).click();
        driver.findElement(By.id("exp-6")).click();
        driver.findElement(By.id("datepicker")).sendKeys("10/05/2015");
        driver.findElement(By.id("profession-1")).click();
        driver.findElement(By.id("tool-2")).click();
        driver.findElement(By.xpath("//select[@id='continents']")).sendKeys("Antartica");
        driver.findElement(By.xpath("(//option[@style='margin: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px;'])[8]")).click();
    }

    /*
    @After
    public void teardown(){
        driver.quit();
    }
    */


}
