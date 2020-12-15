package Stepdefinations;

import COM.PageFiles.HolidayBookingPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;

public class HolidayBooking extends DriverClass {

    public HolidayBookingPage PG = PageFactory.initElements(driver, HolidayBookingPage.class);

    @Given("^i enter url as \"([^\"]*)\"$")
    public void iEnterUrlAs(String url) throws Throwable {
        System.out.println(url);
        OpenBrowser();
        driver.get(url);
        driver.manage().window().maximize();
    }


    @When("^i click on holiday park button$")
    public void iClickOnHolidayParkButton() {
        PG.click();
        //driver.findElement(By.xpath("//li[@id='main-nav-holiday-parks']")).click();
    }

    @Then("^i should see url as \"([^\"]*)\"$")
    public void iShouldSeeUrlAs(String Expected_url) throws Throwable {

        String Actual_Url;
        Expected_url = "https://www.hoseasons.co.uk/holiday-parks";
        Actual_Url = driver.getCurrentUrl();
        assertEquals(Expected_url, Actual_Url);


    }

    @When("^i click on Region field$")
    public void iClickOnRegionField() {
        PG.ClickRegion();
       // driver.findElement(By.id("region-select")).click();
    }

    @When("^i click on Northern Highland link$")
    public void iClickOnNorthernHighlandLink() {
        PG.ClkickNorthernHighlands();
       // driver.findElement(By.xpath("//*[@id=\"region-id-15943\"]/ul/li[7]/ul/li[3]/a")).click();

    }

    @When("^i click on date field$")
    public void iClickOnDateField() {
        PG.Date();
        //driver.findElement(By.id("dateselect")).click();
    }

    @When("^i click on  (\\d+) from calander$")
    public void iClickOnFromCalander(int date) {
        PG.calander();
        //driver.findElement(By.xpath("//div[@id='datepickerPopup']//tbody/tr[4]//td[5]//a[@class='ui-state-default' and text()='25']")).click();
    }


    @When("^i select \"([^\"]*)\" from duration drop down menu$")
    public void iSelectFromDurationDropDownMenu(String duration) throws Throwable {
        PG.duration();
        //new Select(driver.findElement(By.id("gsw-thg_durationlist"))).selectByValue("7");


    }


    @When("^i select \"([^\"]*)\" from   flexibility drop down menu$")
    public void iSelectFromFlexibilityDropDownMenu(String flexibility) throws Throwable {
        PG.Flexibility();
       //new Select(driver.findElement(By.id("thg_flexlist"))).selectByValue("7");
    }

    @When("^i click on Done$")
    public void iClickOnDone() {
        PG.ClickDone();
        //driver.findElement(By.id("dateCancelBtn")).click();
    }

    @When("^i click on Search button$")
    public void iClickOnSearchButton() {
        PG.ClickSearch();
        //driver.findElement(By.id("gsw-search-btn")).click();
    }

    @Then("^i should see search url as \"([^\"]*)\"$")
    public void iShouldSeeSearchUrlAs(String expected_url) throws Throwable {
        String actual_url;
        actual_url = driver.getCurrentUrl();
        assertEquals(expected_url, actual_url);

    }


    @When("^i click Ben nevis holiday park title$")
    public void iClickBenNevisHolidayParkTitle() {
        driver.findElement(By.xpath("//h3[text()='Ben Nevis Holiday Park']")).click();
    }

    @And("^i should see Ben Nevis Holiday Park page title$")
    public void iShouldSeeBenNevisHolidayParkPageTitle() {
        String acutal_pagetitle;
        String expected_pagetitle = "Ben Nevis Holiday Park";

        acutal_pagetitle = driver.findElement(By.className("banner-title")).getText();
        assertEquals(expected_pagetitle, acutal_pagetitle);

    }

    @When("^i click on Highland premier Link$")
    public void iClickOnHighlandPremierLink() {
        driver.findElement(By.xpath("//h3[text()='Highland Premier']")).click();
    }

    @Then("^i should see result url as \"([^\"]*)\"$")
    public void iShouldSeeResultUrlAs(String ExpecteUrl) throws Throwable {
        String ActualUrl;
        ActualUrl = driver.getCurrentUrl();
        assertEquals(ExpecteUrl, ActualUrl);

    }

    @And("^i should see Highland Premier page title$")
    public void iShouldSeeHighlandPremierPageTitle() {
        String ActualPageTitle;
        String ExpectedPageTille = "Highland Premier";

        ActualPageTitle = driver.findElement(By.className("banner-title")).getText();
        assertEquals(ExpectedPageTille, ActualPageTitle);
    }

    @When("^i click on book your holiday button$")
    public void iClickOnBookYourHolidayButton() {
        PG.ClickBook();
        //driver.findElement(By.xpath("//*[@id=\"AvailabilityDetails\"]/div[2]/a[1]")).click();

    }

    @When("^i select \"([^\"]*)\" from title drop down menu$")
    public void iSelectFromTitleDropDownMenu(String Title) throws Throwable {
        PG.Mr();
       // new Select(driver.findElement(By.id("tmpguestTitle"))).selectByValue("Mr");

    }

    @Given("^i enter \"([^\"]*)\" in the name field$")
    public void iEnterInTheNameField(String FirstName) throws Throwable {
        PG.FirstName();
        //driver.findElement(By.name("firstName")).sendKeys("HP");
    }

    @Given("^i enter \"([^\"]*)\" in the surname field$")
    public void iEnterInTheSurnameField(String Patel) throws Throwable {
        PG.Surname();
        //driver.findElement(By.id("tmpguestLastName")).sendKeys("Patel");
    }

    @Given("^i enter \"([^\"]*)\" in email field$")
    public void iEnterInEmailField(String email) throws Throwable {
        PG.email();

       //driver.findElement(By.xpath("//*[@id=\"tmpguestEmail\"]")).sendKeys("yahoo1@gmail.com");

    }
    @Given("^i enter \"([^\"]*)\" in confirm email field$")
    public void iEnterInConfirmEmailField(String ConfirmEmail) throws Throwable {
        PG.ConfirmEmail();

      // driver.findElement(By.id("tmpguestConfirmEmail")).sendKeys("yahoo1@gmail.com");

    }
    @Given("^i enter \"([^\"]*)\" in the phone field$")
    public void iEnterInThePhoneField(String PhoneNo) throws Throwable {
        PG.PhoneNo();

       //driver.findElement(By.id("tmpguestMobile")).sendKeys("78707335748");

    }

    @And("^i select \"([^\"]*)\" from adult drop down menu$")
    public void iSelectFromAdultDropDownMenu(String Adult) throws Throwable {
        PG.Adult();

        //new Select(driver.findElement(By.id("ddlAdults"))).selectByValue("2");

    }
    @And("^i select \"([^\"]*)\" from children drop down menu$")
    public void iSelectFromChildrenDropDownMenu(String Child) throws Throwable {
        PG.Child();

      // new Select(driver.findElement(By.id("ddlChild"))).selectByValue("2");

    }

    @And("^i select \"([^\"]*)\" from Babies drop down menu$")
    public void iSelectFromBabiesDropDownMenu(String babies) throws Throwable {
        PG.Babies();

       //new Select(driver.findElement(By.id("ddlInfants"))).selectByValue("1");

    }

    @And("^i select \"([^\"]*)\" from Pet drop down menu$")
    public void iSelectFromPetDropDownMenu(String pet) throws Throwable {
        PG.Pet();

       // new Select(driver.findElement(By.id("ddlpet"))).selectByValue("0");
    }
    @When("^i select \"([^\"]*)\" from type of party drop down menu$")
    public void iSelectFromTypeOfPartyDropDownMenu(String party) throws Throwable {
        PG.Party();

        //new Select(driver.findElement(By.id("ddlPartyMakeup"))).selectByVisibleText("Family");

    }
    @Given("^i enter \"([^\"]*)\" from your address field$")
    public void iEnterFromYourAddressField(String postCode) throws Throwable {


       driver.findElement(By.id("postCodeEntry")).sendKeys(postCode);
    }

    @When("^i click on Find address button$")
    public void iClickOnFindAddressButton() {
        PG.FindAddress();

        //driver.findElement(By.id("find-address-text")).click();
    }

    @When("^i click \"([^\"]*)\" from address drop down menu$")
    public void iClickFromAddressDropDownMenu(String Address1) throws Throwable {
        PG.AddressDropDown();

       //driver.findElement(By.xpath("//*[@id=\"addresslookupautoCompleteContainer\"]/li[3]/span/a")).click();

    }


    @When("^i click on Continue securely$")
    public void iClickOnContinueSecurely() {
        PG.ContinueButton();

       //driver.findElement(By.id("btnNextNavigation")).click();
    }


}
