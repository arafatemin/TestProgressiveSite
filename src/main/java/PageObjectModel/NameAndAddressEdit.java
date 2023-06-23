package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NameAndAddressEdit {
    public WebDriver driver;

    By firstName = By.cssSelector(".first-name [analyticsevent]");
    By lastName = By.cssSelector(".last-name [analyticsevent]");
    By dateOFBirth = By.cssSelector("date-input [type]");
    By streetName = By.cssSelector(".ng-star-inserted > input[name='NameAndAddressEdit_embedded_questions_list_MailingAddress']");
    By cityName = By.cssSelector(".city [analyticsevent]");
    By zipCode = By.cssSelector(".zip-code [analyticsevent]");
    By startMyQuote = By.cssSelector(".blue > button");



    @FindBy(xpath = "//input[@id='NameAndAddressEdit_embedded_questions_list_MailingAddress']")
    public WebElement inputStreet;

    @FindBy(xpath = "//input[@id='NameAndAddressEdit_embedded_questions_list_City']")
    public WebElement inputCity;


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

    public WebElement getCityName() {
        return driver.findElement(cityName);
    }

    public WebElement getStartMyQuote() {
        return driver.findElement(startMyQuote);
    }




}
