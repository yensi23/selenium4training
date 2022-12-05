package com.training.selenium.action;


import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChromeDragAndDrop {
	static private WebDriver driver;
	
	@BeforeAll
	static public void setUp() {
		
		//System.setProperty("webdriver.chrome.driver","./src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/droppable/");
	}

	@Test
	public void droppable() throws InterruptedException{
		Actions action = new Actions(driver);
        
        //WebdriverWait is used to wait for a frame to be available. Once it is availble we switch to the frame to achieve our task 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));
        //To get source locator
		WebElement sourceLocator = driver.findElement(By.cssSelector("#draggable"));
        //To get target locator
		WebElement targetLocator = driver.findElement(By.cssSelector("#droppable"));
        //dragAndDrop(source, target) method accepts two parameters source and locator. 
        //used dragAndDrop method to drag and drop the source locator to target locator
		action.dragAndDrop(sourceLocator, targetLocator).build().perform();

	}
	
	@AfterAll
	static public void tearDown() {
		//driver.quit();
	}
}
