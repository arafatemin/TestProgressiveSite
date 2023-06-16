package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VehicleAllEdit {
    public WebDriver driver;

    By continueBtn = By.cssSelector(".blue > button");

    public VehicleAllEdit(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getContinueBtn() {
        return driver.findElement(continueBtn);
    }

}
