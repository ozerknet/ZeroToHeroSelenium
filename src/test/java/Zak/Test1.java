package Zak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;



    public class Test1 {

        WebDriver driver;

        @BeforeMethod
        public void setupMethod(){

            // open chrome
            // go to https://practice.cydeo.com
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            driver.get("https://practice.cydeo.com/dropdown");

        }

        @Test
        public void simpleDropdownTest(){

            // 3 verify "simple dropdown" default selected value is correct

            Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']"))  );

            WebElement currentlySelectedOption = simpleDropdown.getFirstSelectedOption();

            String actualSimpleDropdownText = currentlySelectedOption.getText();
            String expectedSimpleDropdownText = "Please select an option";


            //Expected: "Please select an option"
            Assert.assertEquals(actualSimpleDropdownText,expectedSimpleDropdownText);

            // 4 Verify "State selection" default se;ected value is correct
            Select stateDropdown = new Select(driver.findElement(By.xpath("//state[@id='state']")));

            String expectedStateDropdownText = "Select a State";
            String actualStateDropdownText = stateDropdown.getFirstSelectedOption().getText();

            Assert.assertEquals(actualStateDropdownText,expectedStateDropdownText);
            // Assert.assertEquals(stateDropdown.getFirstSelectedOption().getText(),"Select a State");




            //Expected: "Select a State"








        }



    }




