package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserLaunching {

    public static WebDriver driver;


    @Test
    public void launchChromeBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        driver = new ChromeDriver(chromeOptions);
        Thread.sleep(5000);
        driver.get("https://mvnrepository.com/");
        Thread.sleep(5000);
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.close();


    }
}
