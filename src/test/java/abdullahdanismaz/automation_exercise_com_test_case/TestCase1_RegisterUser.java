package abdullahdanismaz.automation_exercise_com_test_case;

import cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCase1_RegisterUser {

     WebDriver driver;

    @BeforeMethod

    public void setupMethod(){
       driver= WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void register_user(){
        driver.get("https://automationexercise.com");
        String expectingUrl="https://automationexercise.com/";
        String verifyUrl=driver.getCurrentUrl();
       Assert.assertEquals(verifyUrl,expectingUrl);
       driver.findElement(By.xpath("//a[@href='/login']")).click();
       String expectingNewUserSignUp="New User Signup!";
       WebElement verifyNewUserSignUp=  driver.findElement(By.xpath(" //*[ text() ='New User Signup!' ]"));
       String actualNewUserSignUp= verifyNewUserSignUp.getText();
       Assert.assertEquals(expectingNewUserSignUp,actualNewUserSignUp);
       WebElement inputName=driver.findElement(By.xpath(" //input[@type='text']"));
       inputName.sendKeys("Abdullah"+ Keys.ENTER);
       WebElement inputEmail= driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
       inputEmail.sendKeys("abdullah@gmail.com"+Keys.ENTER);
       String expectingEnterAccountInformation="ENTER ACCOUNT INFORMATION";
       WebElement actualEnterAccountInformation= driver.findElement(By.xpath("//*[text()='Enter Account Information']"));
       Assert.assertEquals(expectingEnterAccountInformation,actualEnterAccountInformation.getText());

        WebElement genderButton= driver.findElement(By.xpath("//div[@id='uniform-id_gender1']"));
        genderButton.click();
        WebElement passwordInputBox=driver.findElement(By.xpath("//input[@type='password']"));
        passwordInputBox.sendKeys("1071"+Keys.ENTER);//option[@value="5"]
    }
}
/*
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