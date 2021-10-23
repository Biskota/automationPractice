package utils;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;

public class BaseTest extends Base {

    @BeforeMethod(alwaysRun = true)
    public  void setupDriver() {
        WebDriverManager.chromedriver().driverVersion(testProperties.chromeDriverVersion()).setup();
        Configuration.browserSize = testProperties.browserSize();
        Configuration.headless = testProperties.headless();
        open(testProperties.baseURL());
        refresh();
    }

    @AfterMethod(alwaysRun = true)
    public void closeDriver(){
        clearBrowserCache();
        clearBrowserLocalStorage();
        clearBrowserCookies();
        closeWebDriver();

    }
}
