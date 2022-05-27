package Vasyl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class Test7 {
    //Test Case 7: Verify Test Cases Page

    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){//1. Launch browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void test7(){
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("https://automationexercise.com");

        //3. Verify that home page is visible successfully
        String expectedTitle = "Automation Exercise";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Home page is NOT visible!!!");

        //4. Click on 'Test Cases' button
        WebElement testCasesButton = driver.findElement(By.linkText("Test Cases"));
        testCasesButton.click();

        //5. Verify user is navigated to test cases page successfully
        Assert.assertTrue(driver.getCurrentUrl().contains("test_cases"));



    }
@AfterMethod
public void tearDownMethod() {
    //driver.close();
}




}
