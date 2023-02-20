package loginTest;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.StatmentPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test(priority = 1)
    public void LanguageSelectionTest(){
        homePage.SelectLanguage();
        assertTrue(homePage.ElementIsVisible(),"element is not visible");
    }

    @Test(priority = 2)
    public void testSuccessfulLogin() {
        LoginPage loginPage = homePage.clickLoginBtn();
        loginPage.SetEmail();
        loginPage.SetPass();
        StatmentPage statmentPage = loginPage.clickLoginBtn();
        assertEquals(statmentPage.getStatmentText(),"Տեղադրել հայտարարություն","invalid massage");
    }
}
