package com.training.selenium.elements;


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

public class MultiSelectDropdown {
	
	static private WebDriver driver;
	
	@BeforeAll
	static public void setUp() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
       
	}

	@Test
	static public void multiSelectDropdown() {
		
		WebElement element = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(element);
		
		/*
		WebElement selectList = driver.findElement(By.xpath("//select[@name='cars']"));
        Select select = new Select(selectList);
        select.selectByVisibleText("Volvo");
        select.selectByVisibleText("Saab");
        */
        
		WebElement select1 = driver.findElement(By.xpath("//option[@value='Volvo']"));
        WebElement select2 = driver.findElement(By.xpath("//option[@value='Saab']"));

        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).click(select1).click(select2).build().perform();
		
	}
	
	@AfterAll
	static public void tearDown() {
		//driver.quit();
	}		

}
