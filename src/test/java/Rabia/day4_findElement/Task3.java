package Rabia.day4_findElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

public class Task3 {
    public static void main(String[] args) {

        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2. Go to http://practice.cydeo.com/multiple_buttons
        driver.get("http://practice.cydeo.com/multiple_buttons");
        //3. Click on Button 1
        WebElement btn_1 = driver.findElement(By.xpath("//button[@onclick = 'button1()']"));
        btn_1.click();
        //4. Verify text displayed is as expected:
        //Expected: “Clicked on button one!”
        WebElement btnText = driver.findElement(By.xpath("//p[.='Clicked on button one!']"));

        String expectedBtnText = "Clicked on button one!";
        String actualBtnText = btnText.getText();
        if(actualBtnText.equals(expectedBtnText)){
            System.out.println("Text of Button 1 is PASSED");
        }else{
            System.err.println("Text of Button 1 is FAILED");
        }

//USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS

        driver.quit();
    }
}
