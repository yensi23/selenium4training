package com.training.selenium.elements;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeFacebookLocateWriteClickElement {
	static private WebDriver driver;
	
	@BeforeAll
	static public void setUp() {
		
		//System.setProperty("webdriver.chrome.driver","./src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
	}

	@Test
	public void testInstantiatingEmailFacebookPage() {
		
	
		driver.findElement(By.xpath("//html[@id='facebook']/body/div[3]/div[2]/div/div/div/div/div[3]/button[2]")).click();
		
		WebElement mailElement = driver.findElement(By.id("email"));
		mailElement.sendKeys("ss");
		
		//driver.findElement(By.id("loginbutton")).click();
		driver.findElement(By.xpath("//button[contains(.,'Iniciar sesión')]")).click();
		
		assertNotNull( driver.findElement(By.id("error_box")));
			
	}
	
	@AfterAll
	static public void tearDown() {
		driver.quit();
	}	

}
