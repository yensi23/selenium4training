package com.training.selenium.elements;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLinkTest {
	static private WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeAll
	static public void setUp() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}

	@Test
	public void testGooglePage() {
		
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("selenium");
		searchbox.submit();
		
		driver.findElement(By.linkText("Selenium - Wikipedia, la enciclopedia libre")).click();
		
		//assertEquals("selenium - Google Search", driver.getTitle());
		assertEquals("Selenium - Wikipedia, la enciclopedia libre", driver.getTitle());
	}
	
	@AfterAll
	static public void tearDown() {
		//driver.quit();
	}
}
