package Vasyl;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class Test1 {
    WebDriver driver;

    @BeforeClass
    public void main() {

    }

    @BeforeMethod
    public void setupMethod() {
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void example() {
        driver.get("https://practice.cydeo.com/");

    }

    @AfterMethod
    public void teardownMethod() {
        driver.close();
        // driver.quit();
    }
}