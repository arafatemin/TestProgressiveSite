package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FinalDetailsEdit {
    public WebDriver driver;

    By btnOne = By.cssSelector("div:nth-of-type(2) > .input-container > input[name='viewModel_embedded_questions_list_InsuranceToday']");
    By btnTwo = By.cssSelector("div:nth-of-type(2) > .input-container > input[name='viewModel_embedded_questions_list_InsuranceLastMonth']");
    By btnThree = By.cssSelector("div:nth-of-type(2) > .input-container > input[name='viewModel_embedded_questions_list_OtherPolicies']");
    By emailAddress = By.cssSelector("[analyticsevent='focus']");
    By residentsNumber = By.cssSelector(".ng-pristine.ng-invalid.ng-star-inserted.ng-touched");
    By continueBtn = By.cssSelector(".blue > button");



    public FinalDetailsEdit(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getBtnOne() {
        return driver.findElement(btnOne);
    }

    public WebElement getBtnTwo() {
        return driver.findElement(btnTwo);
    }

    public WebElement getBtnThree() {
        return driver.findElement(btnThree);
    }

    public WebElement getEmailAddress() {
        return driver.findElement(emailAddress);
    }

    public WebElement getResidentsNumber() {
        return driver.findElement(residentsNumber);
    }

    public WebElement getContinueBtn() {
        return driver.findElement(continueBtn);
    }
}
