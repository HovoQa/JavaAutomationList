package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage implements WaitHelper {
    private final WebDriver driver;
    private final By selectENLanguage = By.xpath("(//a[@href='/en/'])[2]");
    private final By languageVerifyEl = By.xpath("//div[@class='am']");
    private final By myAccountBtn = By.id("ma");

    private final By searchFieldEl = By.xpath("//input[@type='text']");
    private final By clickSearchBtnEl = By.xpath("//button[@type='button']");
    public String searchText = "BMWX5";

    private final By transportSectionEl = By.xpath("//div[@data-c='16']");
    private final By autoSectionEl = By.linkText("Passenger Cars");



    public HomePage (WebDriver driver){
        this.driver=driver;
    }

    public void clickInElement(By element){
        driver.findElement(element);
    }
    public void selectLanguage(){
        waitUntilElementToBeClickable(driver,selectENLanguage);
        driver.findElement(selectENLanguage).click();
    }
    public boolean ElementIsVisible(){
        return driver.findElement(languageVerifyEl).isDisplayed();
    }
    public LoginPage clickLoginBtn(){
        waitUntilElementToBeClickable(driver,myAccountBtn);
        driver.findElement(myAccountBtn).click();
        return new LoginPage(driver);
    }

    public void EnterSearchText(){
        driver.findElement(searchFieldEl).sendKeys(searchText);
    }
    public SearchResultPage ClickSearchBtn(){
        driver.findElement(clickSearchBtnEl).click();
        return new SearchResultPage(driver);
    }
    public void hoverOver(By element){
        WebElement popUpSection = driver.findElement(element);
        Actions actions = new Actions(driver);
        actions.moveToElement(popUpSection).perform();
    }
    public AutomobilesPage passengerCars(){
        waitUntilElementIsVisible(driver,driver.findElement(transportSectionEl));
        hoverOver(transportSectionEl);
        waitUntilElementToBeClickable(driver,By.linkText("Passenger Cars"));
        driver.findElement(By.linkText("Passenger Cars")).click();
        return new AutomobilesPage(driver);
    }


}
