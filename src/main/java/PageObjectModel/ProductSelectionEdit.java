package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductSelectionEdit {
    public WebDriver driver;

    By justClick = By.cssSelector(".blue > button");

    public ProductSelectionEdit(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getJustClick() {
        return driver.findElement(justClick);
    }
}
