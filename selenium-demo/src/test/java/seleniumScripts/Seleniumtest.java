package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Seleniumtest {
	public static  void main(String args[]) {
		
		WebDriver  driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.redbus.com/");
		
			
		WebElement e1 =	driver.findElement(By.id("email")); 
		e1.click();
		e1.sendKeys("");

		WebElement e2 = driver.findElement(By.name("pass"));
		e2.click();
		e2.sendKeys("");
		WebElement e3 = driver.findElement(By.name("login"));
		e3.click();
		
		System.out.println("completed");
		
	}

}
