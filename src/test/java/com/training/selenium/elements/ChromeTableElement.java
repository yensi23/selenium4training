package com.training.selenium.elements;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTableElement {
	static private WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeAll
	static public void setUp() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_table_test");
	}

	@Test
	public void testGooglePage() {
		
		String innerText = driver.findElement(By.xpath("=//td[2]")).getText(); 
		
		System.out.println(innerText); 
		assertEquals("$100", innerText);
	}
	
	@AfterAll
	static public void tearDown() {
		//driver.quit();
	}
}
