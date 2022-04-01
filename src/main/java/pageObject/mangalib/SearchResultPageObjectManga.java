package pageObject.mangalib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.Base;

public class SearchResultPageObjectManga extends Base {
    public SearchResultPageObjectManga(WebDriver driver){

        super(driver);
    }

    @FindBy(xpath = "//img[@alt='Mangalib']")
    private WebElement textTabMang1;

    @FindBy(xpath = "//div[@class='media-name__main'][text()='Берсерк']")
    private WebElement textTabMang2;

    @FindBy(xpath = "//div[@class='media-name__main'][text()='Ванпанчмен']")
    private WebElement textTabMang3;


    /**
     * Поиск картинки логотипа
     * @param
     */
    public boolean isImTabButIsExsistMang1(){

        return waitVisibilityElement(textTabMang1);
    }

    /**
     * Поиск названия манги
     * @param
     */
    public boolean isImTabButIsExsistMang2(){

        return waitVisibilityElement(textTabMang2);
    }

    /**
     * Поиск названия манги
     * @param
     */
    public boolean isImTabButIsExsistMang3(){

        return waitVisibilityElement(textTabMang3);
    }

}
