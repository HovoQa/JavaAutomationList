package pages;

import org.example.utils.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage implements WaitHelper {
    WebDriver driver;
    private final By emailFieldEl = By.id("_idyour_email");
    private final By passFieldEl = By.id("_idpassword");
    private final By loginBtn = By.xpath("//input[@type = 'submit']");
    private final String email = "hovhannes.gharayan@gmail.com";
    private final String pass = "4CQapeZP9KBqp@D";
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void SetEmail(){
        waitUntilElementIsVisible(driver, driver.findElement(emailFieldEl));
        driver.findElement(emailFieldEl).sendKeys(email);
    }
    public void SetPass(){
        driver.findElement(passFieldEl).sendKeys(pass);
    }
    public StatmentPage clickLoginBtn(){
        waitUntilElementToBeClickable(driver,loginBtn);
        driver.findElement(loginBtn).click();
        return new StatmentPage(driver);
    }

}
