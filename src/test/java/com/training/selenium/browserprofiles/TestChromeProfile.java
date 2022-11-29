package com.training.selenium.browserprofiles;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class TestChromeProfile {
	static private WebDriver driver;
	private String baseURL = "http://www.facebook.com";
	
	@BeforeAll
	static public void setUp() {		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void testLocateEmailFacebookPage() {

		
		ChromeOptions options = new ChromeOptions();		
		options.addArguments("user-data-dir=C://Users//username//AppData//Local//Google//Chrome//User Data");
		options.addArguments("profile-directory=Profile 2");
		
		//options.addArguments("user-data-dir=C://Users//ynavarro//AppData//Local//Google//Chrome//User Data//Profile 2");
		//options.addArguments("user-data-dir=C:\\Users\\ynavarro\\AppData\\Local\\Temp\\scoped_dir9916_1817971511\\Default");
		
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		
		//driver.manage().window().maximize();
		driver.get(baseURL);
		
	}
	
	@AfterAll
	static public void tearDown() {
		driver.quit();
	}

}
