package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class VehiclePage {
    public WebDriver driver;


    By year = By.cssSelector(".control > select[name='VehiclesEdit_embedded_questions_list_Year']");
    By make = By.cssSelector(".ymm-desktop > .make:nth-child(6) > .ng-star-inserted:nth-child(1) .control .ng-untouched.ng-pristine.ng-star-inserted.ng-valid");
    By model = By.cssSelector(".model > .ng-star-inserted:nth-child(1) .control .ng-untouched.ng-pristine.ng-star-inserted.ng-valid");
    By bodyType = By.cssSelector(".control > select[name='VehiclesEdit_embedded_questions_list_BodyStyle']");
    By vehicleUse = By.cssSelector(".control > select[name='VehiclesEdit_embedded_questions_list_VehicleUse']");
    By rideSharing = By.cssSelector(".ng-dirty");
    By zipLocation = By.cssSelector("[analyticsevent='focus']");
    By ownOrLease = By.cssSelector(".control > select[name='VehiclesEdit_embedded_questions_list_OwnOrLease']");
    By lengthOfOwnership = By.cssSelector(".control > select[name='VehiclesEdit_embedded_questions_list_LengthOfOwnership']");
    By annualMileageForRate = By.cssSelector(".control > select[name='VehiclesEdit_embedded_questions_list_AnnualMileageForRate']");
    By doneBtn = By.cssSelector("[forwardnavtext] [aria-live]");




    public VehiclePage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getYear() {
        return driver.findElement(year);
    }

    public WebElement getMake() {
        return driver.findElement(make);
    }

    public WebElement getModel() {
        return driver.findElement(model);
    }

    public WebElement getBodyType() {
        return driver.findElement(bodyType);
    }


    public WebElement getVehicleUse() {
        return driver.findElement(vehicleUse);
    }

    public WebElement getRideSharing() {
        return driver.findElement(rideSharing);
    }

    public WebElement getZipLocation() {
        return driver.findElement(zipLocation);
    }

    public WebElement getOwnOrLease() {
        return driver.findElement(ownOrLease);
    }

    public WebElement getLengthOfOwnership() {
        return driver.findElement(lengthOfOwnership);
    }

    public WebElement getAnnualMileageForRate() {
        return driver.findElement(annualMileageForRate);
    }

    public WebElement getDoneBtn() {
        return driver.findElement(doneBtn);
    }










}
