import org.openqa.selenium.By;

public class UltimateQATest extends BaseTest {

    public void performTest() {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";

        // Open browser and navigate to the base URL
        openBrowser(baseUrl);

        // Perform test actions
        // Print the title of the page
        System.out.println("Page Title: " + driver.getTitle());

        // Print the current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // Print the page source
        System.out.println("Page Source: " + driver.getPageSource());

        // Locate the email field and enter email
        driver.findElement(By.id("user[email]")).sendKeys("test@example.com");

        // Locate the password field and enter password
        driver.findElement(By.id("user[password]")).sendKeys("password123");

        // Print confirmation for actions
        System.out.println("Email and Password entered successfully.");

        // Close the browser
        closeBrowser();
    }

    public static void main(String[] args) {
        UltimateQATest test = new UltimateQATest();
        test.performTest();
    }
}
