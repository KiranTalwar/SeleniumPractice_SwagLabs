package Practice_Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation_Form12 {
   
        // Set up ChromeDriver path
    	public static void main(String[] args) throws InterruptedException {
            
            WebDriverManager.chromedriver().setup();
            
            WebDriver driver = (WebDriver) new ChromeDriver();

        
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();

            // Fill the Name field
            WebElement nameField = driver.findElement(By.xpath("//input[@id='user-name']"));
            nameField.sendKeys("standard_user");
            Thread.sleep(3000);
            
            

            // Fill the Password field
            WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
            passwordField.sendKeys("secret_sauce");
            Thread.sleep(3000);
           
            WebElement clickButton = driver.findElement(By.xpath("//input[@id='login-button']"));
            
            clickButton.click();
          
            Thread.sleep(3000);
            
            
            WebElement menuItems = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
            
            menuItems.click();
            
            
            
           

    
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement sideBar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav[@class='bm-item-list']//a")));
            
            Thread.sleep(3000);
            
            
            WebElement allAbout = driver.findElement(By.xpath("//a[@id='about_sidebar_link']"));
            
            allAbout.click();
            
           
            driver.navigate().back();
            
            Thread.sleep(3000);
 WebElement menuItems1 = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
            
            menuItems1.click();
            
            
            
            Thread.sleep(2000);
            
            WebElement logout = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
            
            logout.click();
            
            
            
            
        
            

    	}
}

