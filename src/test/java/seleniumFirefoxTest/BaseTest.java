package seleniumFirefoxTest;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    WebDriver driver;

    @BeforeTest
    public void beforeT(){
        System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
        FirefoxOptions op = new FirefoxOptions();
//        op.setCapability("version", "selenoid/firefox");

        URL hub = null;
        try {
            hub = new URL("http://localhost:4445/wd/hub");
        }catch (MalformedURLException e){
            e.printStackTrace();
        }

        driver = new RemoteWebDriver(hub, op);

    }

    @AfterTest
    public void afterTest(){
        driver.quit();
        if (driver != null);
        driver.quit();
    }

    public WebDriver getDriver(){
        return driver;
    }

    public byte[] getScreenShot() { //получение скриншота
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
