import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        //Launch the Chrome browser
        WebDriver driver = new ChromeDriver();
        //open URL
        driver.get(baseUrl);
        //implicit wait to load
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //print the title of the page
       String title = driver.getTitle();
        System.out.println(title);
        //Print the current URL
        System.out.println("Current URL:" + driver.getCurrentUrl());
        // Print the page source
        System.out.println("Page source "+ driver.getPageSource());
        //Enter the email id in the email field
        WebElement emailField = driver.findElement(By.name("username"));
        emailField.sendKeys("tomsmith");
        //Enter the password in the password field
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        //close the browser
        driver.close();

    }
}