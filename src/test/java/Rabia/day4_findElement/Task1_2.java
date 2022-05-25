package Rabia.day4_findElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import cydeo.utilities.WebDriverFactory;

public class Task1_2 {

    public static void main(String[] args) {
    // TC #1: XPATH and cssSelector Practices
    //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");
    //3. Locate all the WebElements on the page using XPATH and/or CSS
    //locator only (total of 6)
    //a. “Home” link
        WebElement homeLink_1 = driver.findElement(By.cssSelector("a[class='nav-link']"));
        WebElement homeLink_2 = driver.findElement(By.cssSelector("a[href='/']"));
        WebElement homeLink_3 = driver.findElement(By.cssSelector("a.nav-link"));
//b. “Forgot password” header
        //Locate header using cssSelector: locate parent element and move down to h2
        WebElement header_1 = driver.findElement(By.cssSelector("div[class='example'] > h2")); // div.example > h2
        //Locate header using xpath, and using web elements text "Forgot Password"
        WebElement header_2 = driver.findElement(By.xpath("//h2"));
        WebElement header_3 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        WebElement header_4 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
//c. “E-mail” text
        WebElement email_1 = driver.findElement(By.xpath("//label[@for='email']"));
        WebElement email_2 = driver.findElement(By.xpath("//label[text()='E-mail']"));
//d. E-mail input box
        WebElement inputBox_1 = driver.findElement(By.xpath("//input[@type = 'text']"));
        WebElement inputBox_2 = driver.findElement(By.xpath("//input[@name = 'email']"));
        WebElement inputBox_3 = driver.findElement(By.xpath("//input[contains(@pattern, 'a-z')]"));
        WebElement inputBox_4 = driver.findElement(By.cssSelector("input[type = 'text']"));
//e. “Retrieve password” button
        WebElement retrievePassword_1 = driver.findElement(By.xpath("//i[@class = 'icon-2x icon-signin']"));
        WebElement retrievePassword_2 = driver.findElement(By.cssSelector("i[class = 'icon-2x icon-signin']"));
        WebElement retrievePassword_3 = driver.findElement(By.xpath("//i[text()='Retrieve password']"));
        WebElement retrievePassword_4 = driver.findElement(By.xpath("//i[.='Retrieve password']"));

        WebElement retrievePasswordBtn = driver.findElement(By.xpath("//button[@id='form_submit']"));
//f. “Powered by Cydeo text
        WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));
//4. Verify all web elements are displayed.
        System.out.println("homeLink_1.isDisplayed() = " + homeLink_1.isDisplayed());
        System.out.println("homeLink_2.isDisplayed() = " + homeLink_2.isDisplayed());
        System.out.println("homeLink_3.isDisplayed() = " + homeLink_3.isDisplayed());
        System.out.println("header_1.isDisplayed() = " + header_1.isDisplayed());
        System.out.println("header_2.isDisplayed() = " + header_2.isDisplayed());
        System.out.println("header_3.isDisplayed() = " + header_3.isDisplayed());
        System.out.println("header_4.isDisplayed() = " + header_4.isDisplayed());
        System.out.println("email_1.isDisplayed() = " + email_1.isDisplayed());
        System.out.println("email_2.isDisplayed() = " + email_2.isDisplayed());
        System.out.println("inputBox_1.isDisplayed() = " + inputBox_1.isDisplayed());
        System.out.println("inputBox_2.isDisplayed() = " + inputBox_2.isDisplayed());
        System.out.println("inputBox_3.isDisplayed() = " + inputBox_3.isDisplayed());
        System.out.println("inputBox_4.isDisplayed() = " + inputBox_4.isDisplayed());
        System.out.println("retrievePassword_1.isDisplayed() = " + retrievePassword_1.isDisplayed());
        System.out.println("retrievePassword_2.isDisplayed() = " + retrievePassword_2.isDisplayed());
        System.out.println("retrievePassword_3.isDisplayed() = " + retrievePassword_3.isDisplayed());
        System.out.println("retrievePassword_4.isDisplayed() = " + retrievePassword_4.isDisplayed());
        System.out.println("retrievePasswordBtn.isDisplayed() = " + retrievePasswordBtn.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());

//First solve the task with using cssSelector only. Try to create 2 different
//cssSelector if possible
//Then solve the task using XPATH only. Try to create 2 different
//XPATH locator if possible

        driver.quit();
    }

}
