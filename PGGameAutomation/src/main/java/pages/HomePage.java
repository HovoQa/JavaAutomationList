package pages;

import org.example.utils.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage implements WaitHelper {
    private final WebDriver driver;
    public HomePage (WebDriver driver){
        this.driver=driver;
    }

}
