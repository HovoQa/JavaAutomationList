package SearchFieldTest;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.SearchResultPage;

import static org.testng.Assert.*;

public class TestSearchAutomobil extends BaseTest {

    @Test
    public void TestText1() {
        homePage.selectLanguage();
        homePage.EnterSearchText();
        SearchResultPage searchResultPage = homePage.ClickSearchBtn();
        searchResultPage.SelectTransportSection();
        for (int i = 0; i < searchResultPage.getTextElements().size(); i++) {
            System.out.println(searchResultPage.getTextElements().get(i));
            assertTrue(searchResultPage.getTextElements().get(i).contains(homePage.searchText));
        }
    }
}
