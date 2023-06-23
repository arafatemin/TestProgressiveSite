package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DriversEdit {
    public WebDriver driver;

    By priorAddress = By.cssSelector("//main[@id='main']/drivers-edit-no-credit-hit-pni-details[@class='ng-star-inserted']/small-layout-transclude-template//question[@class='moved']//select-input[@class='control']/select[@name='DriversEditNoCreditHitPniDetails_embedded_questions_list_HasPriorAddress']");
    By continueLink = By.cssSelector(".blue > button");

    public DriversEdit(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getPriorAddress() {
        return driver.findElement(priorAddress);
    }


    public WebElement getContinueLink() {
        return driver.findElement(continueLink);
    }
}
