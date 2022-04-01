package pageObject.google;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.Base;

public class SearchResultPageObject extends Base {
    public SearchResultPageObject(WebDriver driver){

        super(driver);
    }

    @FindBy(xpath = ".//div[@class='main']//a[contains(.,'картинки')]")
    private WebElement imagesTab;

    /**
     * Проверяем, что кнопка Картинки существует на странице
     * @return
     */
    @Step("Проверяем, что кнопка Картинки существует на странице")
    public boolean isImTabButIsExsist(){

        return waitVisibilityElement(imagesTab);
    }
}
