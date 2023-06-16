package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SnapshotEnrollment {
    public WebDriver driver;

    By noBtn = By.cssSelector("div:nth-of-type(2) > .input-container > input[name='viewModel_embedded_questions_list_SnapshotPolicyEnrollment']");
    By continueBtn = By.cssSelector(".blue > button");

    public SnapshotEnrollment(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getNoBtn() {
        return driver.findElement(noBtn);
    }

    public WebElement getContinueBtn() {
        return driver.findElement(continueBtn);
    }
}
