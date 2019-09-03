import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Nopcommerce {
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
        //click on login button
        driver.findElement(By.xpath("//a[@class='ico-login']")).click();

        //enter mail id
        driver.findElement(By.name("Email")).sendKeys("tester1@test.com");
        //enter password
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("1234567");
        //click on login
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
        //select mac book pro
        driver.findElement(By.xpath("//h2/a[@href=\"/apple-macbook-pro-13-inch\"]")).click();
        //click on email on friend
        driver.findElement(By.xpath("//input[@value='Email a friend']")).click();
        //enter friend mail
        driver.findElement(By.xpath("//input[@id='FriendEmail']")).sendKeys("milankg18@gmail.com");
        //enter your mail id
        driver.findElement(By.xpath("//input[@id='YourEmailAddress']")).click();
        //write personal message
        driver.findElement(By.xpath("//textarea[@id='PersonalMessage']")).sendKeys("Please check this out");
        //click on send mail
        driver.findElement(By.xpath("//input[@value='Send email']")).click();
        //driver.close();
    }}
