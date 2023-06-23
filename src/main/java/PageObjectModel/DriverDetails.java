package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DriverDetails {
    public WebDriver driver;

    By gander = By.cssSelector(".ng-touched");
    By dateOfBirth = By.cssSelector(".driver-dob [type]");
    By maritalStatus = By.cssSelector(".ng-star-inserted.ng-touched.ng-dirty.ng-invalid");
    By levelOfEducation = By.cssSelector(".control.ng-star-inserted > select[name^='DriversEditPniDetails_embedded_questions_list_HighestLevelOf']");
    By employmentStatement = By.cssSelector("[property='EmploymentStatus'] > .ng-star-inserted:nth-child(1) .dropdown .control.ng-star-inserted .ng-star-inserted.ng-dirty.ng-invalid.ng-touched");
    By primary_Residence = By.cssSelector(".control.ng-star-inserted > select[name^='DriversEditPniDetails_embedded_questions_list_PrimaryResiden']");
    By licenseType = By.cssSelector(".control.ng-star-inserted > select[name='DriversEditPniDetails_embedded_questions_list_LicenseType']");
    By yearsLicensed = By.cssSelector(".control.ng-star-inserted > select[name^='DriversEditPniDetails_embedded_questions_list_DriverYearsLic']");
    By accidentBtn = By.cssSelector(".ng-star-inserted:nth-of-type(2) .ng-touched");
    By ticketBtn = By.cssSelector(".ng-pristine.ng-touched");
    By continueBtn = By.cssSelector(".blue > button");


    public DriverDetails(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getGander() {
        return driver.findElement(gander);
    }

    public WebElement getDateOfBirth() {
        return driver.findElement(dateOfBirth);
    }

    public WebElement getMaritalStatus() {
        return driver.findElement(maritalStatus);
    }

    public WebElement getLevelOfEducation() {
        return driver.findElement(levelOfEducation);
    }

    public WebElement getEmploymentStatement() {
        return driver.findElement(employmentStatement);
    }

    public WebElement getPrimary_Residence() {
        return driver.findElement(primary_Residence);
    }

    public WebElement getYearsLicensed() {
        return driver.findElement(yearsLicensed);
    }
    public WebElement getUsLicensed() {
        return driver.findElement(licenseType);
    }

    public WebElement getAccidentBtn() {
        return driver.findElement(accidentBtn);
    }

    public WebElement getTicketBtn() {
        return driver.findElement(ticketBtn);
    }

    public WebElement getContinueBtn() {
        return driver.findElement(continueBtn);
    }





}
