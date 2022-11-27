package com.training.selenium.elements;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeFacebookLocateElement {
	static private WebDriver driver;
	
	@BeforeAll
	static public void setUp() {
		
		//System.setProperty("webdriver.chrome.driver","./src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
	}

	@Test
	public void testLocateEmailFacebookPage() {
		
		String tagName = driver.findElement(By.id("email")).getTagName();
		
		System.out.println("tagName: "+tagName);
		
		assertEquals("input", tagName);
		
	}
	
	@AfterAll
	static public void tearDown() {
		driver.quit();
	}	

}
