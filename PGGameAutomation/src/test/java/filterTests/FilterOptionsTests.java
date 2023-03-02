package filterTests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomobilesPage;

import static org.testng.Assert.assertTrue;

public class FilterOptionsTests extends BaseTest {
    @Test
    public void priceTest(){
        homePage.selectLanguage();
        AutomobilesPage automobilesPage = homePage.passengerCars();
        automobilesPage.changeLanguage();
        automobilesPage.filterRadioBtnPrivate();
        automobilesPage.filterRadioBtnForSale();
        automobilesPage.setPrice("6000","6000");
        for (int i = 0; i < automobilesPage.getPrice().size(); i++) {
            System.out.println(automobilesPage.getPrice().get(i));
            Assert.assertEquals(automobilesPage.getPrice().get(i).replaceAll("[^0-9]",""),"6000","price incorrect");
        }
    }
    @Test
    public void cityTest(){

    }

}
