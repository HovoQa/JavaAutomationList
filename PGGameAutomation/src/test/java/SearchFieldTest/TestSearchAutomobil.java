package SearchFieldTest;

import base.BaseTest;
import io.qameta.allure.Features;
import io.qameta.allure.Step;
import net.bytebuddy.build.Plugin;
import org.testng.annotations.Test;
import pages.SearchResultPage;

import static org.testng.Assert.*;

public class TestSearchAutomobil extends BaseTest {

    @Test
    public void TestText1() {
        homePage.SelectLanguage();
        homePage.EnterSearchText();
        SearchResultPage searchResultPage = homePage.ClickSearchBtn();
        searchResultPage.SelectTransportSection();
        for (int i = 0; i < searchResultPage.getTextElements().size(); i++) {
            System.out.println(searchResultPage.getTextElements().get(i));
            assertTrue(searchResultPage.getTextElements().get(i).contains(homePage.searchText));
        }
    }
}
