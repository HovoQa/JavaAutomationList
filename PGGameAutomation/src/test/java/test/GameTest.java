package test;

import base.BaseTest;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import socket.SocketContext;

import static com.codeborne.selenide.Selenide.$;

public class GameTest extends BaseTest {
    private SocketContext context;
    private WebDriver driver;
    Select select ;
    By email = By.cssSelector("#logged_user_id");
    By password = By.cssSelector("#logged_user_balance");
    By signInBtn= By.cssSelector("#loginBtnOut");
    By providers = By.xpath("(//button[@class='btn btn-primary dropdown-toggle'])[1]");


    @Test
    public void connectionAssert() {
        driver.findElement(email).sendKeys("PKVB45");
        driver.findElement(password).sendKeys("PKVB45");
        driver.findElement(signInBtn).click();


    }

}
