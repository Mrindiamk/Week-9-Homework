import org.openqa.selenium.By;

public class OrangeHRMLiveTest extends BaseTest {

    public void performTest() {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";

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
        driver.findElement(By.name("username")).sendKeys("Admin");

        // Locate the password field and enter password
        driver.findElement(By.name("password")).sendKeys("admin123");

        // Print confirmation for actions
        System.out.println("Username and Password entered successfully.");

        // Close the browser
        closeBrowser();
    }

    public static void main(String[] args) {
        OrangeHRMLiveTest test = new OrangeHRMLiveTest();
        test.performTest();
    }
}
