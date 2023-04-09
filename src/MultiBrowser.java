import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser {
    static String browser= "Edge";
    static WebDriver driver;
    static String baseURL = "http://the-internet.herokuapp.com/login";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        } else {
            System.out.println("Invalid browser");
        }
        //open URL
        driver.get(baseURL);
        // Print the title of the page
        driver.getTitle();
        //implicit wait to load
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Print the current URL
        System.out.println("Current url "+ driver.getCurrentUrl());
        //print the page source
        System.out.println("Page source " + driver.getPageSource());
        //Enter the email in the email field
        WebElement emailField = driver.findElement(By.name("username"));
        emailField.sendKeys("tomsmith");
        // Enter password in the password field
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        //close the browser
        driver.close();
    }
}
