package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static selenium.BrowserLaunching_Edge.driver;

public class FlipkartAC {
    //click on ac link & capture the (names,ratings,prices)& click on low to high & sort the prices list that displayed.

    @BeforeAll
    public static void browserLaunch()throws InterruptedException{
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(5000);
        WebElement closeLoginWindow = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
        closeLoginWindow.click();
        WebElement air = driver.findElement(By.xpath("(//img[starts-with(@class,'kJjFO0')])[4]"));
        air.click();
        Thread.sleep(3000);
    }
    @Test
    public void launchEdgeBrowser()throws InterruptedException {

        List<WebElement> acPrices = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
        int i;
        for (i = 0; i < acPrices.size(); i++) {
            System.out.println(acPrices.get(i).getText());
        }
        List<WebElement> acNames = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
        int j;
        for (j = 0; j < acNames.size(); j++) {
            System.out.println(acNames.get(j).getText());
        }
        List<WebElement> ratings = driver.findElements(By.xpath("//div[@class='_3LWZlK']"));
        int k;
        for (k = 0; k < ratings.size(); k++) {
            System.out.println(ratings.get(k).getText());
        }

        List<WebElement> unsortedprice = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
        List<Double> unsortedList = new ArrayList<>();
        for (WebElement WE1 : unsortedprice) {
            unsortedList.add(Double.valueOf(WE1.getText().replace("₹", "").replace(",", "")));
        }
        System.out.println("prise list before sorting" + unsortedList);
        Thread.sleep(2000);
        WebElement prices_low_to_high=driver.findElement(By.xpath("//div[text()='Price -- Low to High']"));
        prices_low_to_high.click();

        Thread.sleep(2000);
        List<WebElement> sortedprice = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
        List<Double> sortedlist = new ArrayList<>();
        for (WebElement WE2 : sortedprice) {
            sortedlist.add(Double.valueOf(WE2.getText().replace("₹", "").replace(",", "")));
        }
        System.out.println("prise list After sorting" + sortedlist);
        Collections.sort(unsortedList);
        Assertions.assertEquals(sortedlist, sortedlist);
    }




}



