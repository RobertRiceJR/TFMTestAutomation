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

import java.util.List;

public class q05 {

     /*
    ...Exercise...
   // http://the-internet.herokuapp.com/add_remove_elements/
   // click on the "Add Element" button 100 times
   // write a function that takes a number, and clicks the "Delete" button
   // given number of times, and then validates that given number of
   // buttons was deleted

   1.method : createButtons()
   2.deleteButtonsAndValidate()
*/

    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void get01() throws InterruptedException {
    driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        createbuttonsmethod (driver,100);
        deletbuttonmethod(driver, 100);
    Thread.sleep(3000);
    }
    private void createbuttonsmethod (WebDriver driver, int num){
       WebElement addbutton = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
       for(int i = 1; i<num; i++){
           addbutton.click();
       }
    }
    private void deletbuttonmethod (WebDriver driver, int num) throws InterruptedException {
        List<WebElement> elementbefore = driver.findElements(By.xpath("//button[@onclick='deleteElement()']"));
        int sizebeforedelete = elementbefore.size();
        int countyer = 0;
        for (WebElement w : elementbefore) {
            countyer++;
            if (countyer > num) {
                break;
            }
            w.click();
        }
        List<WebElement> elementafter = driver.findElements(By.xpath("//button[@onclick='deleteElement()']"));
        int sizeAfterdelete = elementafter.size();
        Assert.assertEquals(0,sizeAfterdelete);
        Thread.sleep(3000);
    }

    @After
    public void teardown (){
        driver.quit();
    }



}
