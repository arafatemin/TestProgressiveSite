package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FinalDetailsEdit {
    public WebDriver driver;

    By btnOne = By.cssSelector("div:nth-of-type(2) > .input-container > input[name='viewModel_embedded_questions_list_InsuranceToday']");
    By btnTwoNo = By.cssSelector("div:nth-of-type(2) > .input-container > input[name='viewModel_embedded_questions_list_InsuranceLastMonth']");
    By btnThreeNo = By.cssSelector("div:nth-of-type(2) > .input-container > input[name='viewModel_embedded_questions_list_OtherPolicies']");
    By emailAddress = By.cssSelector("[analyticsevent='focus']");
    By residentsNumber = By.xpath("//main[@id='main']/final-details[@class='ng-star-inserted']/interview-layout-template//additional-information//select-input[@class='control']/select[@name='FinalDetailsEdit_embedded_questions_list_TotalResidents']");
    By continueBtn = By.cssSelector(".blue > button");


    public FinalDetailsEdit(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getBtnNo() {
        return driver.findElement(btnOne);
    }

    public WebElement getBtnTwoNo() {
        return driver.findElement(btnTwoNo);
    }

    public WebElement getBtnThreeNo() {
        return driver.findElement(btnThreeNo);
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
