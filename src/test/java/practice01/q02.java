package practice01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
//  ...Exercise2...
// Create a new class under Q02
// Set Path
// Create chrome driver
// Maximize the window
// Open google home page https://www.google.com/.
// Wait for 3 seconds
// Go to the "https://www.sahibinden.com"
// Get the title and URL of the page
// Check if the title contains the word "oto" print console "Title contains oto" or "Title does not contain oto"
// Check if the URL contains the word "oto" print console "URL contains oto" or "URL does not contain oto"
// Then go to "https://www.gittigidiyor.com"
// Get the title and check if it contains the word "site" and print "Title contains site" or "Title does not contain site"
// Back to the previous webpage, sahibinden.com
// Refresh the page
// Navigate to gittigidiyor.com
// Wait for 3 seconds
// Close the browser
 */
public class q02 {
    WebDriver driver;
    @Before
    public void setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(3000);
    }

    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        Thread.sleep(3000);
        driver.navigate().to("https://www.gittigidiyor.com");
      String title = driver.getTitle();
      String url = driver.getCurrentUrl();
        if (title.contains("oto")){
            System.out.println("Title contains oto");
        }else{
            System.out.println("Title does not contain oto");
        }
        if (url.contains("oto")){
            System.out.println("Url contains oto");
        }else{
            System.out.println("Url does not contain oto");
        }
        driver.navigate().to("https://www.gittigidiyor.com");
        String title1 = driver.getTitle();
        if (title1.contains("site")) {
            System.out.println("title contains site");
        } else{
                System.out.println("title does not contain site");
        }
        driver.navigate().back();
        driver.navigate().refresh();
        Thread.sleep(3000);

        // Check if the title contains the word "oto" print console "Title contains oto" or "Title does not contain oto"
// Check if the URL contains the word "oto" print console "URL contains oto" or "URL does not contain oto"
    }

    @After
    public void teardown(){
        driver.quit();
    }
}
