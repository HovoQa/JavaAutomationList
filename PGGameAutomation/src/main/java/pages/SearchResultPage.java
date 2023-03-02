package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class SearchResultPage {

    WebDriver driver;
    private final By searchResultEl = By.xpath("//div[@id='tp']//div[@class='dl']//a");
    private final By transportSectionEl = By.xpath("(//div[@class='s']//a)[1]");


    public SearchResultPage(WebDriver driver){
        this.driver=driver;
    }
    public List<String> getTextElements(){
       List<WebElement> selectedElements = driver.findElements(searchResultEl);
       return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }
    public void SelectTransportSection(){
        driver.findElement(transportSectionEl).click();
    }

}
