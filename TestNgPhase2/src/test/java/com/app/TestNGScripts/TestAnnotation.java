package com.app.TestNGScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class TestAnnotation {
	WebDriver driver;
	
	@Test(priority ='1')
	public void getTitle() {
		 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		}
	
	
	@Test (priority ='2')
	public void login() throws InterruptedException {
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("chakripeddi8@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@value='Login']"));
				
				Thread.sleep(5000);
	
	
		}
		
	@Test (priority ='3')
public void logout() throws InterruptedException {
		
		
	
		
		
		driver.findElement(By.linkText("My Account")).click();
	
				
		Thread.sleep(5000);
		driver.close();
	
			
				
		
	}
	
		
	}


