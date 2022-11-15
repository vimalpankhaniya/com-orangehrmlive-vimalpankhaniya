package comorangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrome {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // launch URL
        driver.get(baseUrl);
        // Maximise Window
        driver.manage().window().maximize();
        // We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        // Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is : " + title);

        // Get the current URL
        System.out.println("Current URL : "+ driver.getCurrentUrl());

        //; Get Page Source
        System.out.println("Page Source:" +driver.getPageSource());

        // Nevigate to Login Page by Clicking on login link
        // driver.findElement(By.linkText("Login"));
        //WebElement loginLink = driver.findElement(By.linkText("Login"));
        // loginLink.click();

        // Find the username  field element
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("admin");

        // Find the password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");

        driver.quit();
    }
}

