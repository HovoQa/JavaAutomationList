package SearchFieldTest;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearchResultPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestText extends BaseTest {

    @Test
    public void TestText1(){
        homePage.SelectLanguage();
        homePage.EnterSearchText();
        SearchResultPage searchResultPage = homePage.ClickSearchBtn();
        assertTrue(searchResultPage.getTextElements().get(0).contains(homePage.searchText));

    }
}
