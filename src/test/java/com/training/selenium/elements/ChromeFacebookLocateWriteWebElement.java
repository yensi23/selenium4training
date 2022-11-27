package com.training.selenium.elements;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeFacebookLocateWriteWebElement {
	static private WebDriver driver;
	
	@BeforeAll
	static public void setUp() {
		
		System.setProperty("webdriver.chrome.driver","./src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
	}

	@Test
	public void testInstantiatingEmailFacebookPage() {
		
		WebElement mailElement = driver.findElement(By.id("email"));
		mailElement.sendKeys("loloselenium@yahoo.com");
		
			
	}
	
	@AfterAll
	static public void tearDown() {
		driver.quit();
	}		

}
