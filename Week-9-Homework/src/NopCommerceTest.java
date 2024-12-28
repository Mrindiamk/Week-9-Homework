import org.openqa.selenium.By;

public class NopCommerceTest extends BaseTest {

    public void performTest() {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";

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
        driver.findElement(By.id("Email")).sendKeys("test@example.com");

        // Locate the password field and enter password
        driver.findElement(By.id("Password")).sendKeys("password123");

        // Print confirmation for actions
        System.out.println("Email and Password entered successfully.");

        // Close the browser
        closeBrowser();
    }

    public static void main(String[] args) {
        NopCommerceTest test = new NopCommerceTest();
        test.performTest();
    }
}
