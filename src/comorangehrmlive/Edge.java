package comorangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Edge {
    public static void main(String[] args) {
        String baseurl="https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        // Launch the URL
        driver.get(baseurl);

        // Maximise the window
        driver.manage().window().maximize();

        // we give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Get the page of the title
        String title = driver.getTitle();
        System.out.println("Page tittel is:"+ title);

        // Get the current URL
        System.out.println("Current URL: "+ driver.getCurrentUrl());

        // Get page Saurce
        System.out.println("Page Source :"+ driver.getPageSource());

        //Find the username field element
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("Admin");

        // Find the password filed element
        WebElement passwordField=driver.findElement(By.name("password"));
        passwordField.sendKeys("Cha123");

        driver.quit();
    }
}

