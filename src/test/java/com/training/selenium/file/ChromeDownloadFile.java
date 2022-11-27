package com.training.selenium.file;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeDownloadFile {
	static private WebDriver driver;
	
	@BeforeAll
	static public void setUp() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://kaboompics.com/photo/13441/the-man-with-the-halloween-balloon");
	}

	@Test
	public void testUpload() {
		
		//WebElement we = driver.findElements(By.className("quick-download"));
		WebElement downloadElement = driver.findElement(By.className("quick-download"));
		downloadElement.click();
		
		//((WebElement)driver.findElement((By.className("quick-download")))).click();
		
		
				
		//assertNotNull(uploadElement);
		
	}
	
	@AfterAll
	static public void tearDown() {
		//driver.quit();
	}
}
