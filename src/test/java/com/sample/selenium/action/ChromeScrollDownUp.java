package com.sample.selenium.action;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChromeScrollDownUp {
	static private WebDriver driver;
	
	@BeforeAll
	static public void setUp() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}

	@Test
	public void testGooglePage() throws InterruptedException{
		Actions action = new Actions(driver);
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("selenium");
		searchbox.submit();
		
		Thread.sleep(3000);
        //SCROLL DOWN
		
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(3000);
        //SCROLL UP
		
		action.sendKeys(Keys.PAGE_UP).build().perform();
		
		assertEquals("selenium - Buscar con Google", driver.getTitle());
	}
	
	@AfterAll
	static public void tearDown() {
		driver.quit();
	}
}
