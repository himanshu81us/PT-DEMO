package COM.PageFiles;

import Stepdefinations.DriverClass;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class HolidayBookingPage extends DriverClass {


    public void click() {
        driver.findElement(By.xpath("//*[@id=\"main-nav-holiday-parks\"]/a")).click();


    }

    public void ClickRegion() {

        driver.findElement(By.id("region-select")).click();

    }

    public void ClkickNorthernHighlands() {
        driver.findElement(By.xpath("//*[@id=\"region-id-15943\"]/ul/li[7]/ul/li[3]/a")).click();
    }

    public void Date() {

        driver.findElement(By.id("dateselect")).click();
    }

    public void calander() {
        driver.findElement(By.xpath("//div[@id='datepickerPopup']//tbody/tr[4]//td[5]//a[@class='ui-state-default' and text()='25']")).click();

    }

    public void duration() {
        new Select(driver.findElement(By.id("gsw-thg_durationlist"))).selectByValue("7");
    }

    public void Flexibility() {
        new Select(driver.findElement(By.id("thg_flexlist"))).selectByValue("7");
    }

    public void ClickDone() {
        driver.findElement(By.id("dateCancelBtn")).click();
    }

    public void ClickSearch() {
        driver.findElement(By.id("gsw-search-btn")).click();
    }


    public void ClickBook() {
        driver.findElement(By.xpath("//*[@id=\"AvailabilityDetails\"]/div[2]/a[1]")).click();
    }

    public void Mr() {
        new Select(driver.findElement(By.id("tmpguestTitle"))).selectByValue("Mr");
    }

    public void FirstName() {
        driver.findElement(By.name("firstName")).sendKeys("HP");
    }

    public void Surname() {
        driver.findElement(By.id("tmpguestLastName")).sendKeys("Patel");
    }

    public void email() {
        driver.findElement(By.xpath("//*[@id=\"tmpguestEmail\"]")).sendKeys("yahoo1@gmail.com");

    }

    public void ConfirmEmail() {
        driver.findElement(By.id("tmpguestConfirmEmail")).sendKeys("yahoo1@gmail.com");
    }

    public void PhoneNo() {
        driver.findElement(By.id("tmpguestMobile")).sendKeys("78707335748");
    }

    public void Adult() {
        new Select(driver.findElement(By.id("ddlAdults"))).selectByValue("2");
    }

    public void Child() {
        new Select(driver.findElement(By.id("ddlChild"))).selectByValue("2");
    }

    public void Babies() {
        new Select(driver.findElement(By.id("ddlInfants"))).selectByValue("1");
    }

    public void Pet() {
        new Select(driver.findElement(By.id("ddlpet"))).selectByValue("0");
    }

    public void Party() {
        new Select(driver.findElement(By.id("ddlPartyMakeup"))).selectByVisibleText("Family");

    }



    public void FindAddress() {

        driver.findElement(By.id("find-address-text")).click();
    }

    public void AddressDropDown() {
        driver.findElement(By.xpath("//*[@id=\"addresslookupautoCompleteContainer\"]/li[3]/span/a")).click();
    }

    public void ContinueButton(){
        driver.findElement(By.id("btnNextNavigation")).click();
    }
}

