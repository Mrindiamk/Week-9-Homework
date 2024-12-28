import org.openqa.selenium.By;

public class HerokuAppTest extends BaseTest {

    public void performTest() {
        String baseUrl = "http://the-internet.herokuapp.com/login";

        // Open browser and navigate to the base URL
        openBrowser(baseUrl);

        // Perform test actions
        // Print the title of the page
        System.out.println("Page Title: " + driver.getTitle());

        // Print the current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // Print the page source
        System.out.println("Page Source: " + driver.getPageSource());

        // Locate the username field and enter username
        driver.findElement(By.id("username")).sendKeys("tomsmith");

        // Locate the password field and enter password
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

        // Print confirmation for actions
        System.out.println("Username and Password entered successfully.");

        // Close the browser
        closeBrowser();
    }

    public static void main(String[] args) {
        HerokuAppTest test = new HerokuAppTest();
        test.performTest();
    }
}
