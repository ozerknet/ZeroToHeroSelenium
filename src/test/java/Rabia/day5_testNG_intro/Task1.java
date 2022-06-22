package Rabia.day5_testNG_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import cydeo.utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class Task1 {

    public static void main(String[] args) {

//TC #1: StaleElementReferenceException handling
//1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/");

        //3. Click to “Add Element” button
        WebElement addElementBtn = driver.findElement(By.xpath("//button[@onclick = 'addElement()']"));
        addElementBtn.click();

        //4. Verify “Delete” button is displayed after clicking.
        WebElement deleteBtn = driver.findElement(By.xpath("//button[@onclick = 'deleteElement()']"));
        System.out.println("deleteBtn.isDisplayed() = " + deleteBtn.isDisplayed());

        //5. Click to “Delete” button.
        deleteBtn.click();

        //6. Verify “Delete” button is NOT displayed after clicking.
        try{
            System.out.println("deleteBtn.isDisplayed() = " + deleteBtn.isDisplayed());
        }catch (StaleElementReferenceException e){
            System.out.println("StaleElementReferenceException exception is thrown so the web element is completely deleted");
            System.out.println("deleteBtn.isDisplayed() = false, as a expected");
        }
        driver.close();

        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
    }
}
