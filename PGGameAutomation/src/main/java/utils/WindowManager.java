package utils;

import org.openqa.selenium.WebDriver;

import java.net.URL;
import java.util.Set;

public class WindowManager {

    private WebDriver driver;
    private WebDriver.Navigation navigation;

    public  WindowManager(WebDriver driver){
        this.driver = driver;
        navigation = driver.navigate();
    }

    public void goBack(){
        driver.navigate().back();
    }
    public void goForward(){
        navigation.forward();
    }
    public void refreshPage(){
        navigation.refresh();
    }
    public void goTo(String url){
        navigation.to(url);
    }
    public void switchToTab(String tabTitle){
        Set<String> windows =driver.getWindowHandles();
        for(String window : windows ){
            driver.switchTo().window(window);
            if(tabTitle.equals(driver.getTitle())){
                break;
            }
        }
    }
    public void switchToNewTab(){
        Set<String> windows = driver.getWindowHandles();
        windows.forEach(driver.switchTo()::window);
    }

}
