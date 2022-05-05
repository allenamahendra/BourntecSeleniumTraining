package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsBrowser {

    private EdgeDriver driver;

    @Test
    public void launchEdgeBrowser()throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        driver=new EdgeDriver();
        driver.manage().window().maximize();
       // Thread.sleep(3000);
        driver.get("http://demowebshop.tricentis.com/");
        Thread.sleep(3000);

// click on register

        WebElement Register = driver.findElement(By.className("ico-register"));
        Register.click();

//select the radio button

        WebElement gender = driver.findElement(By.id("gender-male"));
        gender.click();

//enter first name

        WebElement FirstName = driver.findElement(By.id("FirstName"));
        FirstName.sendKeys("hello");

        System.out.println ("first name : "+FirstName.getAttribute("value"));

//enter last name

        WebElement LastName = driver.findElement(By.id("LastName"));
        LastName.sendKeys("hi");
        System.out.println ("last name : "+LastName.getAttribute("value"));

//enter mail id

        WebElement Email = driver.findElement(By.id("Email"));
        Email.sendKeys("hellohi30@gmail.com");
        System.out.println ("email id : "+Email.getAttribute("value"));

// enter password

        WebElement Password =driver.findElement(By.id("Password"));
        Password.sendKeys("hello2");
        System.out.println ("password : "+Password.getAttribute("value"));

// enter conform password

        WebElement ConfirmPassword = driver.findElement(By.id("ConfirmPassword"));
        ConfirmPassword.sendKeys("hello2");
        System.out.println ("conform password : "+ConfirmPassword.getAttribute("value"));

//click on register

        WebElement register = driver.findElement(By.id("register-button"));
        register.click();

        WebElement result = driver.findElement(By.xpath("//input[@class='button-1 register-continue-button']"));
        result.click();

        WebElement link1=driver.findElement(By.linkText("Books"));
        link1.click();

//using x-path identifying the element or object

        WebElement addCart = driver.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']"));
        addCart.click();

        WebElement link2 = driver.findElement(By.linkText("Gift Cards"));
        link2.click();

        WebElement link3 = driver.findElement(By.linkText("Log out"));
        link3.click();

        //System.out.println ("first name : "+FirstName.getAttribute("value"));
        //System.out.println ("last name : "+LastName.getAttribute("value"));
        //System.out.println ("email id : "+Email.getAttribute("value"));
       // System.out.println ("password : "+Password.getAttribute("value"));
       //* System.out.println ("conform password : "+ConfirmPassword.getAttribute("value"));

        driver.close();

    }

}
