package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MovedHouse {
    public WebDriver driver;

    By priorAddress = By.cssSelector(".control > select[name^='DriversEditNoCreditHitPniDetails_embedded_questions_list_Has']");
    By continueBtn = By.cssSelector(".blue > button");

    public MovedHouse(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getPriorAddress() {
        return driver.findElement(priorAddress);
    }

    public WebElement getContinueBtn() {
        return driver.findElement(continueBtn);
    }
}
