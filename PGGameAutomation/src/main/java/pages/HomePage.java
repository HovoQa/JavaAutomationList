package pages;

import org.example.utils.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePage implements WaitHelper {
    private final WebDriver driver;
    private final By selectAMLanguage = By.xpath("//a[@href='/am/']");
    private final By languageVerifyEl = By.xpath("//div[@class='am']");
    private final By myAccountBtn = By.id("ma");

    private final By searchFieldEl = By.xpath("//input[@type='text']");
    private final By clickSearchBtnEl = By.xpath("//button[@type='button']");
    public String searchText = "BMW X5";



    public HomePage (WebDriver driver){
        this.driver=driver;
    }
    public void SelectLanguage(){
        waitUntilElementToBeClickable(driver,selectAMLanguage);
        driver.findElement(selectAMLanguage).click();
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


}
