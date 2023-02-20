package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatmentPage {
    private final WebDriver driver;
    private final By statmentPagetextEl = By.cssSelector("#ap") ;
    public StatmentPage(WebDriver driver){
        this.driver=driver;
    }
    public String getStatmentText(){
        return driver.findElement(statmentPagetextEl).getText();
    }
//    public HomePage navigateToHomePgae(){
//
//    }
}
