package Rabia.day5_testNG_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import cydeo.utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class Task2 {

    public static void main(String[] args) {

//TC #2: Radiobutton handling
//1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");
//3. Click to “Hockey” radio button
        WebElement hockeyRadioBtn = driver.findElement(By.xpath("//input[@id = 'hockey']"));
        hockeyRadioBtn.click();

//4. Verify “Hockey” radio button is selected after clicking.
        if(hockeyRadioBtn.isSelected()){
            System.out.println("Verification PASSED");
        }else{
            System.out.println("Verification FAILED!!");
        }
        driver.quit();
    }
}
