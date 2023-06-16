package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DriverIndex {
    public WebDriver driver;

    By continueLink = By.cssSelector(".blue > button");

    public DriverIndex(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getContinueLink() {
        return driver.findElement(continueLink);
    }
}
