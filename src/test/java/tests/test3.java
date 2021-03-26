package tests;

import home.WalmartTestRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class test3 extends WalmartTestRunner {

    @Test
    public void testThree() throws InterruptedException {
        driver.findElement(By.name("query")).sendKeys("video game");
        Thread.sleep(3000);
        driver.findElement(By.name("query")).sendKeys("s");
        Thread.sleep(3000);
        driver.findElement(By.name("query")).sendKeys(Keys.CLEAR);
        Thread.sleep(3000);
    }
}
