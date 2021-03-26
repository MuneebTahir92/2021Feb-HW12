package tests;

import home.WalmartTestRunner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test2 extends WalmartTestRunner {

    @Test
    public void testTwo(){
        String titleOfWebpage = "Walmart.com | Save Money. Live Better.";
        String realTitle = driver.getTitle();
        Assert.assertEquals(realTitle, titleOfWebpage);

    }
}
