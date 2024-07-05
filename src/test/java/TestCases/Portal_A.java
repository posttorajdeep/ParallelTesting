package TestCases;

import DataProvider.DataSet;
import Page.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Portal_A extends BaseTest {

    @Test(dataProvider = "dataCount", dataProviderClass = DataSet.class ,threadPoolSize = 5)
    public void testPortalA(int a) throws InterruptedException {
       // Thread.sleep(2000);
        System.out.println("Testing Portal_A " + a + " " + driver.hashCode());

    }

    @Test()
    public void testPortalA2() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Testing Portal_A 2------- " + driver.hashCode());
    }



}
