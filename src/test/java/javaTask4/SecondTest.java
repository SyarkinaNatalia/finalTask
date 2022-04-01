package javaTask4;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class SecondTest extends BaceTest{

    @DataProvider(name = "SetEnvironment", parallel = true)
    public Object[][] getData(){
        Object[][] browserVersion = new Object[][]{
                {"Chrome","89"},
                {"Yandex","13"},
        };
        return browserVersion;
    }


    @Test
    public void startTest(){
        System.out.println("Стартуем тест");
    }

    @Test(dataProvider = "SetEnvironment")
    public void startTest(String browser, String version){
        System.out.println("Тест для " + browser + "=" + version);

        Assertion a = new Assertion();
        a.assertTrue(version.equalsIgnoreCase("80"));
    }


}
