package automationexercise;

import cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test1 {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void selenium_test() {//Verify that home page is visible successfully
        driver.get("https://www.automationexercise.com/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Automation Exercise";
        Assert.assertEquals(actualTitle, expectedTitle, "Title is not matching here.");

        //4.Click on 'Signup / Login' button
        WebElement signUpButton = driver.findElement(By.xpath("//a[@href='/login']"));
        signUpButton.click();

        //5.Verify 'New User Signup!' is visible
        WebElement newUsersSignUp = driver.findElement(By.xpath("//h2[contains(text(),'New User Signup!')]"));
        System.out.println("newUsersSignUp.isDisplayed() = " + newUsersSignUp.isDisplayed());

        //6.Enter name and email address
        WebElement nameArea = driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
        nameArea.sendKeys("ozer" + Keys.ENTER);

        WebElement emailArea = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
        emailArea.sendKeys("mike12251@geldi.com");

        // Click 'Signup' button
        WebElement signupButton = driver.findElement(By.xpath("//button[contains(text(),'Signup')]"));
        signupButton.click();

        //8.Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement enterAccountInformation = driver.findElement(By.xpath("//b[contains(text(),'Enter Account Information')]"));
        System.out.println("enterAccountInformation.isDisplayed() = " + enterAccountInformation.isDisplayed());

        //9. Fill details: Title, Name, Email, Password, Date of birth

        WebElement titleRadioButton = driver.findElement(By.xpath("//input[@id='id_gender1']"));
        titleRadioButton.click();

        WebElement passwordArea = driver.findElement(By.xpath("//input[@id='password']"));
        passwordArea.sendKeys("Daniel");

        Select dropdownDOBDay = new Select(driver.findElement(By.xpath("//select[@id='days']")));
        dropdownDOBDay.selectByVisibleText("5");

        Select dropdownDOBMonth = new Select(driver.findElement(By.xpath("//select[@id='months']")));
        dropdownDOBMonth.selectByVisibleText("February");

        Select dropdownDOBYear = new Select(driver.findElement(By.xpath("//select[@id='years']")));
        dropdownDOBYear.selectByVisibleText("1980");


        //10. Select checkbox 'Sign up for our newsletter!'
        WebElement signUpNewsLetter = driver.findElement(By.xpath(" //input[@name='newsletter']"));
        signUpNewsLetter.click();

        //11. Select checkbox 'Receive special offers from our partners!'
        WebElement receiveSpecialOfferButton = driver.findElement(By.xpath("//input[@id='optin']"));
        receiveSpecialOfferButton.click();

        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        WebElement firstName = driver.findElement(By.xpath("//input[@id='first_name']"));
        firstName.sendKeys("Ozer");
        WebElement lastName = driver.findElement(By.xpath("//input[@id='last_name']"));
        lastName.sendKeys("Kutuk");
        WebElement company = driver.findElement(By.xpath("//input[@id='company']"));
        lastName.sendKeys("UK");
        WebElement address = driver.findElement(By.xpath("//input[@id='address1'] "));
        address.sendKeys("66");
        WebElement address2 = driver.findElement(By.xpath("//input[@id='address2']"));
        address2.sendKeys("Stoneleigh Avenue");
        Select country = new Select(driver.findElement(By.xpath("//select[@id='country']")));
        country.selectByVisibleText("Canada");
        WebElement state = driver.findElement(By.xpath("//input[@id='state']"));
        state.sendKeys("Enfield");
        WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
        city.sendKeys("London");
        WebElement zipcode = driver.findElement(By.xpath("//input[@id='zipcode']"));
        zipcode.sendKeys("N14 6HH");
        WebElement mobileNumber = driver.findElement(By.xpath("//input[@id='mobile_number']"));
        mobileNumber.sendKeys("07452 600 523");

        //13. Click 'Create Account button'
        WebElement creatAccountButton = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        creatAccountButton.click();

        //14. Verify that 'ACCOUNT CREATED!' is visible
        WebElement accountCreated = driver.findElement(By.xpath("//b[contains(text(),'Account Created!')]"));
        System.out.println("accountCreated.isDisplayed() = " + accountCreated.isDisplayed());

        //15.Click 'Continue' button
        WebElement continueButton = driver.findElement(By.xpath("//a[@data-qa='continue-button']"));
        continueButton.click();

        //16. Verify that 'Logged in as username' is visible
        WebElement loggedInAUsername = driver.findElement(By.xpath("//b"));
        System.out.println("loggedInAUsername.isDisplayed() = " + loggedInAUsername.isDisplayed());

        //17. Click 'Delete Account' button
        WebElement deleteAccount = driver.findElement(By.xpath("//a[@href='/delete_account']"));
        deleteAccount.click();

        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        WebElement deleteAccountVisible = driver.findElement(By.xpath("//h1"));
        System.out.println("deleteAccountVisible.isDisplayed() = " + deleteAccountVisible.isDisplayed());

        WebElement deleteAccountButtonLastPage = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
        deleteAccountButtonLastPage.click();


    }

    @AfterMethod
    public void tearDownMethod() {
        //driver.close();
    }
}

/*
Steps :
Test Case 1: Register User
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Signup / Login' button
5. Verify 'New User Signup!' is visible
6. Enter name and email address
7. Click 'Signup' button
8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
9. Fill details: Title, Name, Email, Password, Date of birth
10. Select checkbox 'Sign up for our newsletter!'
11. Select checkbox 'Receive special offers from our partners!'
12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
13. Click 'Create Account button'
14. Verify that 'ACCOUNT CREATED!' is visible
15. Click 'Continue' button
16. Verify that 'Logged in as username' is visible
17. Click 'Delete Account' button
18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
 */

