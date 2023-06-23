import Base.BaseClass;
import PageObjectModel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.http.WebSocket;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestProgressive extends BaseClass {

    public TestProgressive() throws IOException {
        super();
    }

    @BeforeTest
    public void sutUp() {
        driver = getDriver(); // chrome
        driver.get(getUrl()); // progressive.com
    }

    @Test
    public void testProperties() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.getAutoLink().click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        ZipCodePage zipCodePage = new ZipCodePage(driver);
        zipCodePage.getZipCode().sendKeys("50001");
        zipCodePage.getQuoteBtn().click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        NameAndAddressEdit nameAndAddressEdit = new NameAndAddressEdit(driver);
        nameAndAddressEdit.getFirstName().sendKeys("Feroze");
        nameAndAddressEdit.getLastName().sendKeys("Sultan");
        nameAndAddressEdit.getDateOFBirth().sendKeys("01/01/1980");


//        Actions action = new Actions(driver);
//        WebElement element = driver.findElement(By.id(""));
//        action.moveToElement(element).sendKeys("Happy 11 Street").build().perform();


//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("document.getElementById('NameAndAddressEdit_embedded_questions_list_MailingAddress').setAttribute('value', 'new 11 for element')");
//        js.executeScript("document.getElementById('NameAndAddressEdit_embedded_questions_list_MailingAddress')..innerHTML='value 11 here'");


        nameAndAddressEdit.inputStreet.sendKeys("12345 Main Street");
        nameAndAddressEdit.inputCity.sendKeys("Lexington");


        nameAndAddressEdit.getStartMyQuote().click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        VehiclePage vehiclePage = new VehiclePage(driver);
        Select select_year = new Select(vehiclePage.getYear());
        select_year.selectByVisibleText("2023");

        Select select_make = new Select(vehiclePage.getMake());
        select_make.selectByVisibleText("Jeep");

        Select select_model = new Select(vehiclePage.getModel());
        select_model.selectByVisibleText("Compass");


        Select select_use = new Select(vehiclePage.getVehicleUse());
        select_use.selectByVisibleText("Commute (to/from work or school)");
        Thread.sleep(3000);

        Select select_ownOrLease = new Select(vehiclePage.getOwnOrLease());
        select_ownOrLease.selectByVisibleText("Own");
        Thread.sleep(3000);


        Select select_lengthOfOwnership = new Select(vehiclePage.getLengthOfOwnership());
        select_lengthOfOwnership.selectByVisibleText("Less than 1 month");
        Thread.sleep(3000);


        vehiclePage.getDoneBtn().click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        VehicleAllEdit vehicleAllEdit = new VehicleAllEdit(driver);
        vehicleAllEdit.getContinueBtn().click();


        DriverDetails driverDetails = new DriverDetails(driver);
        driverDetails.getGander().click();

        Select select_maritalStatus = new Select(driverDetails.getMaritalStatus());
        select_maritalStatus.selectByVisibleText("Single");
        Thread.sleep(3000);

        Select select_levelOfEducation = new Select(driverDetails.getLevelOfEducation());
        select_levelOfEducation.selectByVisibleText("No high school diploma or GED");
        Thread.sleep(3000);


        Select select_employmentStatus = new Select(driverDetails.getEmploymentStatement());
        select_employmentStatus.selectByVisibleText("Not working/Other");
        Thread.sleep(3000);


        Select select_primaryResidence = new Select(driverDetails.getPrimary_Residence());
        select_primaryResidence.selectByVisibleText("Own home");
        Thread.sleep(3000);


        Select select_usLicensed = new Select(driverDetails.getUsLicensed());
        select_usLicensed.selectByVisibleText("Not Licensed/State ID");
        Thread.sleep(3000);


        Select select_yearsLicensed = new Select(driverDetails.getYearsLicensed());
        select_yearsLicensed.selectByVisibleText("3 years or more");
        Thread.sleep(3000);


        driverDetails.getAccidentBtn().click();
        Thread.sleep(1000);
        driverDetails.getTicketBtn().click();
        Thread.sleep(1000);
        driverDetails.getContinueBtn().click();
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        DriverIndex driverIndex = new DriverIndex(driver);
        driverIndex.getContinueLink().click();
        Thread.sleep(5000);


        DriversEdit driversEdit = new DriversEdit(driver);
        Select select_driversEdit = new Select(driversEdit.getPriorAddress());
        select_driversEdit.selectByVisibleText("No");
        Thread.sleep(3000);


        driversEdit.getContinueLink().click();
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        FinalDetailsEdit finalDetailsEdit = new FinalDetailsEdit(driver);
        finalDetailsEdit.getBtnNo().click();
        Thread.sleep(3000);
        finalDetailsEdit.getBtnTwoNo().click();
        Thread.sleep(3000);
        finalDetailsEdit.getBtnThreeNo().click();
        Thread.sleep(3000);
        finalDetailsEdit.getEmailAddress().sendKeys("feroze@gmail.com");
        Thread.sleep(3000);

        Select select_residentsNumber = new Select(finalDetailsEdit.getResidentsNumber());
        finalDetailsEdit.getResidentsNumber().click();
        select_residentsNumber.selectByVisibleText("1");
        Thread.sleep(3000);

        finalDetailsEdit.getContinueBtn().click();
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        SnapshotEnrollment snapshotEnrollment = new SnapshotEnrollment(driver);
        Thread.sleep(3000);
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//segmented-radio-input[@id='enrollment']/fieldset[@class='ng-star-inserted']/div[1]/div[@class='input-container']/input[@name='viewModel_embedded_questions_list_SnapshotEnrollmentExperience']"));
        action.moveToElement(element).click().build().perform();

        Thread.sleep(3000);
        snapshotEnrollment.getContinueBtn().click();
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


        ProductSelectionEdit productSelectionEdit = new ProductSelectionEdit(driver);
        productSelectionEdit.getJustClick().click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


        RatePackageDetails ratePackageDetails = new RatePackageDetails(driver);
        Thread.sleep(3000);
        System.out.println(ratePackageDetails.getQouteNumber().getText());
        Thread.sleep(3000);
        System.out.println(ratePackageDetails.getQouteText().getText());

    }

    @AfterSuite
    public void teamDown() {
        driver.close();
        driver = null;
    }


}
