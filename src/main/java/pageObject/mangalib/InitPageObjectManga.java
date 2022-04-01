package pageObject.mangalib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.Base;

public class InitPageObjectManga extends Base {
    public InitPageObjectManga(WebDriver driver){

        super(driver);
    }

    @FindBy(xpath = "//span[@id='search-link']")
    private WebElement submitSearch;

    @FindBy(xpath = "//input[@placeholder='Поиск Манги']")
    private WebElement searchText;


    @FindBy(xpath = "//a[@href='/berserk']//div[@class='manga-list-item__body']//div[@class='manga-list-item__name'][contains(text(),'Берсерк')]")
    private WebElement submitSearch2;

    @FindBy(xpath = "//li[@class='tabs__item tabs__item_active']")
    private WebElement submitSearch3;

    @FindBy(xpath = "(//div[@class='manga-list-item__name'][contains(text(),'Ванпанчмен')])[1]")
    private WebElement submitSearch4;

    /**
     * Кликаем по кнопке поиска, для открытия поля ввода
     */
    public void clickSubmitSearch(){

        click(submitSearch);
    }

    /**
     * Вводим текст в строку поиска
     * @param text
     */

    public void setSearchText(String text){

        setText(searchText, text);
    }

    /**
     * Кликаем по нужной нам манге Берсерк
     */

    public void clickSubmitSearch2(){

        click(submitSearch2);
    }

    /**
     * Кликаем по вкладке Главы
     */

    public void clickSubmitSearch3(){

        click(submitSearch3);
    }

    /**
     * Кликаем по нужной нам манге Ванпанчмен
     */

    public void clickSubmitSearch4(){

        click(submitSearch4);
    }

}
