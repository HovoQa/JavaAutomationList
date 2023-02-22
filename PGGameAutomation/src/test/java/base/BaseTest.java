package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.io.File;
import java.io.FileInputStream;

public class BaseTest {


        public WebDriver driver;
        protected HomePage homePage;
        private String url = "https://www.list.am";

        @BeforeClass
        public void setup() throws InterruptedException{
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get(url);
                homePage = new HomePage(driver);
        }
        @AfterClass
        public void tearDown(){
                //driver.quit();
       }
}
