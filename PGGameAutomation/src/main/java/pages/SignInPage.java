package pages;

import org.example.utils.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage implements WaitHelper {
    WebDriver driver;
    public SignInPage(WebDriver driver){
        this.driver=driver;
    }
}
