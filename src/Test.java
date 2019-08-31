import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

public class Test {
    protected static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src\\BrowserDriver\\chromedriver.exe");

        //open the Browser
        driver=new ChromeDriver();
        //maximise the browser window screen
        driver.manage().window().fullscreen();
        //set implicity wait for driver object
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        //open the website
        driver.get("http://demo.nopcommerce.com/");
        //click on register button
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        //enter firstname
        driver.findElement(By.id("FirstName")).sendKeys("Dev");
        //enter lastname
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Joshi");
        driver.findElement(By.name("Email")).sendKeys("tester@test.com");
        //enter password
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("1234567");
        //enter confirm password
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("1234567");
        //closer the browser window
        driver.findElement(By.xpath("//input[@id='register-button']")).click();
        //closer the browser window
        // driver.close();


    }

}
