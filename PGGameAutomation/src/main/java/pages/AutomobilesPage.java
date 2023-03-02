package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WaitHelper;

import java.util.List;
import java.util.stream.Collectors;

public class AutomobilesPage implements WaitHelper {
    private WebDriver driver;

    private final By radioBtnPrivate = By.xpath("//input[@id='idcmtype0']");
    private final By radioBtnForSale = By.xpath("//input[@id='idtype0']");
    private final By locationSectionBtn = By.cssSelector("#_idn");
    private final By modelSectionBtn = By.cssSelector("#_idbid");
    private final By price1El = By.cssSelector("#idprice1");
    private final By price2El = By.cssSelector("#idprice2");
    private final By priceApplyBtn = By.cssSelector("#gobtn");
    private final By ordinaryAdList = By.xpath("//div[@class='p']");
    private final By adListPrice = By.xpath("//div[@class='at']");
    private final By yearFromEl = By.xpath("(//div[text()='from'])[1]");
    private final By yearToEl = By.xpath("(//div[text()='to'])[1]");
    private final By languageField = By.cssSelector("#lbar");
    private final By usLanguage = By.cssSelector(".en");

    public AutomobilesPage(WebDriver driver){
        this.driver=driver;
    }
    public void changeLanguage(){
        driver.findElement(languageField).click();
        driver.findElement(usLanguage).click();
    }
    public void filterRadioBtnPrivate(){
        waitUntilElementToBeClickable(driver, radioBtnPrivate);
        driver.findElement(radioBtnPrivate).click();
    }
    public void filterRadioBtnForSale(){
        driver.findElement(radioBtnForSale).click();
    }
    public void setLocation(String cityName){
        WebElement chooseLocation = driver.findElement(By.xpath("(//div[@class='l top'])[1]//div[@data-name='" + cityName +"']"));
        driver.findElement(locationSectionBtn).click();
        waitUntilElementIsVisible(driver,chooseLocation);
        chooseLocation.click();
    }
    public void setModel(String modelName){
        WebElement chooseModel = driver.findElement(By.xpath("(//div[@class='l top'])[2]//div[@data-name='" + modelName +"']"));
        driver.findElement(modelSectionBtn).click();
        waitUntilElementIsVisible(driver,chooseModel);
        chooseModel.click();
    }
    public void setPrice(String priceValue1,String priceValue2){
        driver.findElement(price1El).sendKeys(priceValue1);
        driver.findElement(price2El).sendKeys(priceValue2);
        waitUntilElementToBeClickable(driver,priceApplyBtn);
        driver.findElement(priceApplyBtn).click();
    }
    public  void setYear(String from,String to){
        driver.findElement(yearFromEl).sendKeys(from);
        driver.findElement(yearToEl).sendKeys(to);
    }
    public List<String> getPrice(){
        List<WebElement> selectedElements = driver.findElements(ordinaryAdList);
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }
    public List<String> getModel(){
        List<WebElement> searchResult = driver.findElements(adListPrice);
        return  searchResult.stream().map(e->e.getText()).collect(Collectors.toList());
    }
}
