package testNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public abstract class TestBaseTestNG {

    public static WebDriver driver;

    //this will run before all tests
    @BeforeSuite
    public void getEnvironmetVariables() {

    }

    {
        System.out.println("getEnvironmentVariables");
        System.out.println("Browser is Chrome");
        System.out.println("Environment is stage");
        System.out.println("url is XYZ");
    }
    @BeforeTest
    public WebDriver getWebDriver(){
        String Browser = "chrome";
        if (Browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--start-maximized");
            driver = new ChromeDriver(chromeOptions);
        }else if (Browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        return driver;
    }
    @AfterTest
    public void closeBrowser(){
        driver.close();
    }
}
