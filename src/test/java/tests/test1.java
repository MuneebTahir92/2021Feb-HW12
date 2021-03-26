package tests;

import home.WalmartTestRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class test1 extends WalmartTestRunner {

    @Test
    public void testOne() throws InterruptedException {
        driver.findElement(By.id("global-search-input")).sendKeys("toys", Keys.ENTER);
        Thread.sleep(2000);
    }
}
