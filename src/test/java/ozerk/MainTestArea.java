package ozerk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class MainTestArea {

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
    public void test12() {
        driver.get("http://automationexercise.com");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Automation Exercise";
        Assert.assertEquals(actualTitle,expectedTitle);
        //---------------------------------------------
        WebElement productButton =driver.findElement(By.xpath("//a[@href='/products']"));
        productButton.click();
                //submit(); and click() diffent
        //---------------------------------------------
        WebElement clickToviewProduct =driver.findElement(By.xpath("//a[@href='/product_details/1']"));
        clickToviewProduct.click();
        //--------------------------------------------
        WebElement inputQuantity =driver.findElement(By.xpath("//input[@name='quantity']"));
        inputQuantity.sendKeys("1");
        //--------------------------------------------
        WebElement addToChart =driver.findElement(By.xpath("//button[@class='btn btn-default cart']"));
        addToChart.click();
        //--------------------------------------------
        WebElement viewChart =driver.findElement(By.xpath("//u"));
        viewChart.click();
        //--------------------------------------------
        WebElement proceedCart =driver.findElement(By.xpath("//a[contains(text(),'Proc')]"));
        proceedCart.click();
        //--------------------------------------------
        WebElement continueOnChart =driver.findElement(By.xpath("//button[contains(text(),'Cart')]"));
        continueOnChart.click();










    }

    /*

        2. Navigate to url 'http://automationexercise.com'
        3. Verify that home page is visible successfully
        4. Click 'Products' button
    5. click to view product
    6. Click 'Continue Shopping' button
    7. Hover over second product and click 'Add to cart'
    8. Click 'View Cart' button
    9. Verify both products are added to Cart
    10. Verify their prices, quantity and total price
     */

    @Test
    public void test2() {
        driver.get("https://practice.cydeo.com/");

    }

    @AfterMethod
    public void teardownMethod() {
        //driver.close();
        // driver.quit();
    }
}
