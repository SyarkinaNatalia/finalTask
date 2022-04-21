package seleniumTests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pageObject.mangalib.InitPageObjectManga;
import pageObject.mangalib.SearchResultPageObjectManga;
import seleniumTests.BaseTest;

public class MyTestSel extends BaseTest {
    @Test
    @Epic("Селениум")
    @Feature("Тест на сайте mangalib")
    @Story("Проверка поиска манги с помощью поисковика")
    public void startTest() {
        getDriver().get("https://mangalib.me/");
        getDriver().manage().window().maximize();

        InitPageObjectManga in = new InitPageObjectManga(getDriver());
        SearchResultPageObjectManga sr = new SearchResultPageObjectManga(getDriver());
        Assertion as = new Assertion();

        as.assertTrue(sr.isImTabButIsExsistMang1());
        in.clickSubmitSearch();
        in.setSearchText("Берсерк");
        in.clickSubmitSearch2();
        as.assertTrue(sr.isImTabButIsExsistMang2());
        in.clickSubmitSearch3();
        as.assertTrue(sr.isImTabButIsExsistMang1());
        in.clickSubmitSearch();
        in.setSearchText("Ванпанчмен");
        in.clickSubmitSearch4();
        as.assertTrue(sr.isImTabButIsExsistMang3());

    }
}