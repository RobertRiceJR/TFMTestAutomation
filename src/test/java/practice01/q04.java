package practice01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class q04 {

    // ...Exercise4...
// Navigate to  https://testpages.herokuapp.com/styled/index.html
// Click on  Calculate under Micro Apps
// Type any number in the first input
// Type any number in the second input
// Click on Calculate
// Get the result
// Print the result
WebDriver driver;
@Before
    public void setup (){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
}


@Test
    public void test() throws InterruptedException {
    driver.get("https://testpages.herokuapp.com/styled/index.html");
    driver.findElement(By.xpath("//a[@id='calculatetest']")).click();
    WebElement firstbox = driver.findElement(By.xpath("//input[@id='number1']"));
    WebElement secondbox = driver.findElement(By.xpath("//input[@id='number2']"));
firstbox.sendKeys("20");
secondbox.sendKeys("35");
driver.findElement(By.xpath("//input[@id='calculate']")).click();
String result = driver.findElement(By.xpath("//span[@id='answer']")).getText();
    Assert.assertEquals("55", result);
Thread.sleep(3000);

}

@After
    public void teardown(){
    driver.quit();
}

}
