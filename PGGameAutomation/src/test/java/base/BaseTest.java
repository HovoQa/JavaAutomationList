package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.net.CookieManager;
import java.nio.file.Files;

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
        @BeforeMethod
        public void goHome(){
                driver.get("https://www.list.am");
                homePage = new HomePage(driver);
        }
        @AfterClass
        public void tearDown(){
                //driver.quit();
       }

        @AfterMethod
        public void recordFailure(ITestResult result){
            if(ITestResult.FAILURE == result.getStatus())
            {
                TakesScreenshot camera = (TakesScreenshot)driver;
                File screenshot = camera.getScreenshotAs(OutputType.FILE);
                try{
                    Files.move(screenshot.toPath(), new File("resources/screenshots/" + result.getName() + ".png").toPath());
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }

        public WindowManager getWindowManager(){
                return new WindowManager(driver);
        }

        private ChromeOptions getChromeOptions(){
                ChromeOptions options = new ChromeOptions();
                options.addArguments("disable-infobars");
                //options.setHeadless(true);
                return options;
        }

        public CookieManager getCookieManager(){
                return new CookieManager();
        }
}
