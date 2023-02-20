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
//                driver.quit();
       }
}
