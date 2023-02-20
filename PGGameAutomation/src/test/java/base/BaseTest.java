package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class BaseTest {


        public WebDriver driver;
        protected HomePage homePage;
        private String url = "https://www.delivery-club.ru";

        @BeforeClass
        public void setup() throws InterruptedException{
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get(url);
                homePage = new HomePage(driver);
                Thread.sleep(10);
        }
        @AfterClass
        public void tearDown(){
//                driver.quit();
       }
}
