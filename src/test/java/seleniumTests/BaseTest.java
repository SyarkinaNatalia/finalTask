package seleniumTests;

import io.qameta.allure.Attachment;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObject.Common;
import utils.PropertyLoader;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    WebDriver driver;

    protected Common c = new Common();

    public String setStendKey = System.setProperty("StendKey", "stend1");
    public String stendKey = System.getProperty("StendKey");
    public String stendUrl = PropertyLoader.loadProperty(stendKey);
    public static String browserNameKey = System.getProperty("BrowserName", "browserName1"); //взято из примера выше setStendKey
    public static String browserName = PropertyLoader.loadProperty(browserNameKey);

    @BeforeTest
    public void beforeT(){
        Capabilities op = null;
        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
            op = new ChromeOptions();
        }

        if (browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
            op = new FirefoxOptions();
        }

//        DesiredCapabilities dc = DesiredCapabilities.chrome();
//        dc.setCapability(ChromeOptions.CAPABILITY, op);
//        driver = new ChromeDriver();
//        op.setCapability("version", "selenoid/chrome");

        URL hub = null;
        try {
            hub = new URL("http://localhost:4445/wd/hub");
        }catch (MalformedURLException e){
            e.printStackTrace();
        }

        driver = new RemoteWebDriver(hub,op);

    }

    @AfterTest
    public void afterTest(){
        getScreenShot();
        driver.quit();
        if (driver != null);
        driver.quit();
    }

    public WebDriver getDriver(){
        return driver;
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] getScreenShot(){
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }
}
