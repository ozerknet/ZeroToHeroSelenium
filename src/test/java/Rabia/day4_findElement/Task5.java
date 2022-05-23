package Rabia.day4_findElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebDriverFactory;

import java.util.concurrent.TimeUnit;

public class Task5 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    //1. Go to http://practice.cydeo.com/checkboxes
        driver.get("http://practice.cydeo.com/checkboxes");

    //2. Confirm checkbox #1 is NOT selected by default
        // locate checkbox 1  --> with id attribute //input[@id = 'box1']
        WebElement checkBox1 = driver.findElement(By.xpath("//input[@name = 'checkbox1']"));
        System.out.println("checkBox1.isSelected() = " + checkBox1.isSelected()); // it has to be false
    //3. Confirm checkbox #2 is SELECTED by default.
        // locate checkbox 2 --> //input[@id = 'box2']
        WebElement checkBox2 = driver.findElement(By.xpath("//input[@name = 'checkbox2']"));
        System.out.println("checkBox2.isSelected() = " + checkBox2.isSelected()); // it has to be true
    //4. Click checkbox #1 to select it.
        checkBox1.click();
    //5. Click checkbox #2 to deselect it.
        checkBox2.click();
    //6. Confirm checkbox #1 is SELECTED.
        System.out.println("checkBox1.isSelected() = " + checkBox1.isSelected()); // it has to be true
   //7. Confirm checkbox #2 is NOT selected.
        System.out.println("checkBox2.isSelected() = " + checkBox2.isSelected()); // it has to be false

        //        if(checkbox1.isSelected()){
//            System.out.println("verification passed");
//        }else{
//            System.out.println("verification fail");
//        }
//        //   7. Confirm checkbox #2 is NOT selected.
//
//        if(!checkbox2.isSelected()){
//            System.out.println("verification passed");
//        }else{
//            System.out.println("verification fail");
//        }

        driver.quit();
    }
}
