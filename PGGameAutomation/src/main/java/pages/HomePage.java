package pages;

import org.example.utils.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage implements WaitHelper {
    private final WebDriver driver;
    private final By selectAMLanguage = By.xpath("//a[@href='/am/']");
    private final By languageVerifyEl = By.xpath("//div[@class='am']");
    private final By myAccountBtn = By.id("ma");

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


}
