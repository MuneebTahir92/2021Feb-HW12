package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class WalmartTestRunner {

    public WebDriver driver = null;

    @BeforeMethod
    public void open(){
        System.setProperty("webdriver.chrome.driver", "/Users/muneeb/IdeaProjects/Homework12/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.walmart.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void close(){
        driver.findElement(By.id("hf-home-link")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.close();
    }
}
