package Practice_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation_Form12 {

    public static void main(String[] args) throws InterruptedException {
        // Set up WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        
            driver.get("https://www.saucedemo.com/");

            // Find and interact with the username field
            WebElement nameField = driver.findElement(By.id("user-name"));
            nameField.sendKeys("standard_user");

            // Find and interact with the password field
            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.sendKeys("secret_sauce");

            // Find and click the login button
            WebElement loginButton = driver.findElement(By.id("login-button"));
            loginButton.click();

            // Simulate a wait to observe the action (replace with WebDriverWait if necessary)
            Thread.sleep(2000); // Wait for 2 seconds
            WebElement optionMenu = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
            
             optionMenu.click();
            
            Thread.sleep(2000); 
            
            WebElement aboutInfo = driver.findElement(By.xpath("//a[@id='about_sidebar_link']"));
            aboutInfo.click();
            Thread.sleep(2000);
            
            driver.navigate().back();
            
            WebElement optionMenu1 = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
            
            optionMenu1.click();
            
            Thread.sleep(2000);
             WebElement logout = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
            
              logout.click();
            
         

        
            // Close the browser after execution
            driver.quit();
        }
    }

