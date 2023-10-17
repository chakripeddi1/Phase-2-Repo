package seleniumScripts;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestMobilePage {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Mobiles")).click();
		
WebElement mobile = driver.findElement(By.xpath("//*[@id='nav-subnav']/descendant::span[2]"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(mobile).build().perform();
		
		Thread.sleep(4000);
		
		
		
		driver.findElement(By.linkText("Apple")).click();
		
		driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[6]/descendant::span[9]")).click();
	
		
		
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	
		
		driver.switchTo().window(tabs.get(1));
		
		Thread.sleep(4500);
		
		driver.findElement(By.id("add-to-cart-button")).click();
		
		
	}

}
