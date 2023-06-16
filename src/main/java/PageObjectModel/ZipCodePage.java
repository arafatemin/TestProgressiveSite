package PageObjectModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZipCodePage {
    public WebDriver driver;

    By zipCodeBox = By.cssSelector("input#zipCode_overlay");
    By quoteBtn = By.cssSelector("input#qsButton_overlay");

    public ZipCodePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getZipCode() {
        return driver.findElement(zipCodeBox);
    }

    public WebElement getQuoteBtn() {
        return driver.findElement(quoteBtn);
    }
}
