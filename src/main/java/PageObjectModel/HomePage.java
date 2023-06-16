package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    public WebDriver driver;

    By autoLink = By.cssSelector(".big.item.purple > .link.shadow-box.shadow-box-animation  .last-word");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAutoLink() {
        return driver.findElement(autoLink);
    }
}
