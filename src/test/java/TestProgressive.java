import Base.BaseClass;
import PageObjectModel.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.http.WebSocket;
import java.time.Duration;

public class TestProgressive  extends BaseClass {

    public TestProgressive() throws IOException {
        super();
    }
    @BeforeTest
    public void sutUp(){
        driver = getDriver(); // chrome
        driver.get(getUrl()); // progressive.com
    }

    @Test
    public void testProperties() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.getAutoLink().click();
    }





    @AfterSuite
    public void teamDown(){
        driver.close();
        driver = null;
    }


}
