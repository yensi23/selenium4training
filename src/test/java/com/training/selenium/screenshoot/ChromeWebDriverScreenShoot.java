package com.training.selenium.screenshoot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeWebDriverScreenShoot {
	private static WebDriver driver;
	
	@BeforeAll
	static public void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://www.yahoo.com");
	}

	@Test
	public void testGooglePage() throws Exception{
		
		ChromeWebDriverScreenShoot.takeSnapShot(driver, "c://borrame//seleniumscreenshoot//chrome_screenshoot_"+System.currentTimeMillis()+".png") ; 
		
		WebElement searchbox = driver.findElement(By.name("q"));
				
		searchbox.sendKeys("selenium");
		
		ChromeWebDriverScreenShoot.takeSnapShot(driver, "c://borrame//seleniumscreenshoot//chrome_screenshoot_"+System.currentTimeMillis()+".png") ; 
		
		searchbox.submit();
		
		assertEquals("selenium - Buscar con Google", driver.getTitle());
	}
	
	@AfterAll
	static public void tearDown() {
		driver.quit();
	}	

    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
        //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot =((TakesScreenshot)webdriver);
        //Call getScreenshotAs method to create image file
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        //Move image file to new destination
        File DestFile=new File(fileWithPath);
        //Copy file at destination
        FileUtils.copyFile(SrcFile, DestFile);
    }	
	
 	
}
