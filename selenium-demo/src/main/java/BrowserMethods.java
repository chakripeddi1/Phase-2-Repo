

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

    public static void main(String[] args) {
        // Set up ChromeDriver executable path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chakr\\eclipse-workspace\\selenium-demo\\drivers\\chromedriver.exe");
        
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver(); // open the browser

        // In the browser ==> enter a URL
        driver.get("https://www.selenium.dev/");

        // Print the title of the webpage
        String title = driver.getTitle();
        System.out.println("The title of the page is : " + title);

        String url = driver.getCurrentUrl();
        System.out.println("The URL of the page is : " + url);

        // Close the browser window
        driver.quit();
    }
}
