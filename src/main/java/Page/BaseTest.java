package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.manage().window().minimize();
        driver.manage().deleteAllCookies();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Thread.sleep(5000);
     //   driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() {
        try {
            System.out.println(driver);
            if (driver != null) {
                System.out.println(driver.toString());
                driver.close();
            }
        } catch (Exception e) {
            System.out.println("$$$$$$$$$$$$$$$");
            e.printStackTrace();
            e.getMessage();
        }
    }


    }



