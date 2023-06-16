package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RatePackageDetails {
    public WebDriver driver;

    By qouteNumber = By.xpath("//main[@id='main']/rate-package-details[@class='interview-container interview-layout ng-star-inserted']/rate-package//rate-package-quote-summary[@class='ng-star-inserted']//div[@class='header-summary']");
    By qouteText = By.xpath("//main[@id='main']/rate-package-details[@class='interview-container interview-layout ng-star-inserted']/div[@class='rate-page-header']//div[@class='text']");

    public RatePackageDetails(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getQouteNumber() {
        return driver.findElement(qouteNumber);
    }

    public WebElement getQouteText() {
        return driver.findElement(qouteText);
    }
}
