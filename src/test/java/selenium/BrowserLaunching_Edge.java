package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserLaunching_Edge {

    public static WebDriver driver;


    @Test
    public void launchEdgeBrowser_() throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        driver=new EdgeDriver();
        Thread.sleep(5000);
        driver.manage().window().fullscreen();
        driver.get("https://mvnrepository.com/");
        Thread.sleep(5000);
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.close(); 


    }
}
