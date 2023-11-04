package com.tutorialsninja.Testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	
public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		
	}
	
	@Test(priority = 1)
	public void verifyLoginWithValidCredentials() {
		
		driver.findElement(By.id("input-email")).sendKeys("Sofianabassi24@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Sosomayo24");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}
	
	@Test(priority = 2)
	public void verifyLoginWithInvalidCredentials() {
		
		driver.findElement(By.id("input-email")).sendKeys("1234@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("1234");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}

	@Test(priority = 3)
	public void verifyLoginWithValidEmailInvalidPassword() {
		
		driver.findElement(By.id("input-email")).sendKeys("Sofianabassi24@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("1234");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}
	
	@Test(priority = 4)
	public void verifyLoginWithInvalidEmailValidPassword() {
		
		driver.findElement(By.id("input-email")).sendKeys("1234@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Sosomayo24");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}
	
	@Test(priority = 5)
	public void verifyLoginWithoutCredentials() {
		
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
		
	}

	
}