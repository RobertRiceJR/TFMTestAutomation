package Tonystest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tonystest {

    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    String email = "Testingemail@yahoo.com";
    String pw = "TestingMyPassWord!@#123";

    @Test
    public void test01() throws InterruptedException {
        driver.get("https://www.tonysfreshmarket.com/");
        driver.findElement(By.xpath("//img[@class='sgpb-popup-close-button-6']")).click();
    Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='fp-register-link']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='fp-input-first_name']")).sendKeys("Testingfirstname");
        driver.findElement(By.xpath("//input[@name='fp-input-last_name']")).sendKeys("testinglastname");
        driver.findElement(By.xpath("//input[@name='fp-input-email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@name='reenter-email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@name='fp-input-password']")).sendKeys(pw);
        driver.findElement(By.xpath("//input[@name='re-password']")).sendKeys(pw);
        driver.findElement((By.xpath("//input[@name='fp-input-address_1']"))).sendKeys("4700  VOUGHT");
        driver.findElement(By.xpath("//input[@name='fp-input-city']")).sendKeys("ANCHORAGE");
        driver.findElement(By.xpath("//input[@name='fp-input-postal_code']")).sendKeys("99502-1200");
        driver.findElement(By.xpath("(//span[@class='fp-dropdown-icon'])[5]")).sendKeys( Keys.ENTER, "A");


        /*Select dropdown1 = new Select(driver.findElement(By.xpath("(//span[@class='fp-dropdown-icon'])[2]")));
        dropdown1.selectByValue("IL - Belmont");
        Select dropdown = new Select((driver.findElement(By.xpath("(//span[@class='fp-dropdown-icon'])[2]"))));
        dropdown.selectByValue("Mar (03)");
       */
       // driver.findElement(By.xpath("//span[@class='fp-value']")).sendKeys("Mar (03)");
    }


    @After
    public void teardown() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }
}
