package automationexercise;

import com.google.common.base.Verify;
import cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test2 {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Test
    public void selenium_test() {
        // 3. Verify that home page is visible successfully
        driver.get("https://www.automationexercise.com/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Automation Exercise";
        Assert.assertEquals(actualTitle, expectedTitle, "Title is not matching here.");
        //4. Click on 'Signup / Login' button
        WebElement signupLoginButton = driver.findElement(By.xpath("//a[@href='/login']"));
        signupLoginButton.click();

        //5. Verify 'Login to your account' is visible
        WebElement loginToyourAccountText = driver.findElement(By.xpath("//h2[contains(text(),'Login to your account')]"));
        System.out.println("loginToyourAccountText.isDisplayed() = " + loginToyourAccountText.isDisplayed());

        //6. Enter correct email address and password
        WebElement emailArea = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
        emailArea.sendKeys("mike121@geldi.com");

        WebElement passwordArea = driver.findElement(By.xpath("//input[@data-qa='login-password']"));
        passwordArea.sendKeys("Daniel");
        //7. Click 'login' button
        WebElement loginButton = driver.findElement(By.xpath("//button[@data-qa='login-button']"));
        loginButton.click();
        //8. Verify that 'Logged in as username' is visible
        WebElement loggedInAUsername = driver.findElement(By.xpath("//b"));
        System.out.println("loggedInAUsername.isDisplayed() = " + loggedInAUsername.isDisplayed());
        //9. Click 'Delete Account' button
        WebElement deleteAccount = driver.findElement(By.xpath("//a[@href='/delete_account']"));
        deleteAccount.click();
        //10. Verify that 'ACCOUNT DELETED!' is visible
        WebElement deleteAccountVisible = driver.findElement(By.xpath("//h1"));
        System.out.println("deleteAccountVisible.isDisplayed() = " + deleteAccountVisible.isDisplayed());


    }

    public void test1() {

    }


    @AfterMethod
    public void tearDownMethod() {
        driver.close();
    }
}
/*
Steps:
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Signup / Login' button
5. Verify 'Login to your account' is visible
6. Enter correct email address and password
7. Click 'login' button
8. Verify that 'Logged in as username' is visible
9. Click 'Delete Account' button
10. Verify that 'ACCOUNT DELETED!' is visible
 */
