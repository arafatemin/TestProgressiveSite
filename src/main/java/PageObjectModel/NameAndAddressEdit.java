package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameAndAddressEdit {
    public WebDriver driver;

    By firstName = By.cssSelector(".first-name [analyticsevent]");
    By lastName = By.cssSelector(".last-name [analyticsevent]");
    By dateOFBirth = By.cssSelector("date-input [type]");
    By streetName = By.cssSelector(".control.ng-star-inserted [analyticsevent]");
    By zipCode = By.cssSelector(".zip-code [analyticsevent]");
    By startMyQuote = By.cssSelector(".blue > button");

    public NameAndAddressEdit(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getFirstName() {
        return driver.findElement(firstName);
    }

    public WebElement getLastName() {
        return driver.findElement(lastName);
    }


    public WebElement getDateOFBirth() {
        return driver.findElement(dateOFBirth);
    }


    public WebElement getStreetName() {
        return driver.findElement(streetName);
    }

    public WebElement getZipCode() {
        return driver.findElement(zipCode);
    }

    public WebElement getStartMyQuote() {
        return driver.findElement(startMyQuote);
    }




}
