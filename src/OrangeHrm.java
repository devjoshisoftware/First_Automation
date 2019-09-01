import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OrangeHrm {
    protected static WebDriver driver;
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
        driver=new ChromeDriver();
        //maximise the browser window screen
        driver.manage().window().fullscreen();
        //set implicity wait for driver object
        driver.manage().timeouts().implicitlyWait(59, TimeUnit.SECONDS);
        //open the website
        driver.get("http://opensource-demo.orangehrmlive.com");
        //enter username
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        //enter password
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
        //click on login
        driver.findElement(By.xpath("//input[@name='Submit']")).click();
        //click on welcome admin
        driver.findElement(By.xpath("//a[contains(@class,'gger')]")).click();
        //click on log out button
        driver.findElement(By.linkText("Logout")).click();
        //driver.close












    }
}
