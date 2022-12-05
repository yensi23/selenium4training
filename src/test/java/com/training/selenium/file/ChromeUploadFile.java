package com.training.selenium.file;


import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeUploadFile {
	static private WebDriver driver;
	
	@BeforeAll
	static public void setUp() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://gofile.io/?t=uploadFiles");
	}

	@Test
	public void testUpload() {
		
		WebElement uploadElement = driver.findElement(By.id("uploadFile-Input"));
		
		uploadElement.sendKeys("C:\\borrame\\seleniumscreenshoot\\chrome_screenshoot_1669592062234.png");
		
		driver.findElement(By.id("btnUpload")).click();
				
		assertNotNull(uploadElement);
		
	}
	
	@AfterAll
	static public void tearDown() {
		//driver.quit();
	}
}
