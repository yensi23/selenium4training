package com.training.selenium.grid;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SimpleFirefoxGridJavaTest2 {
	
	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver;
		String baseUrl, nodeURL;		
	
		//System.setProperty("webdriver.gecko.driver","./src/test/resources/drivers/geckodriver.exe");
		baseUrl = "http://www.google.com";
		//nodeURL = "http://localhost:4444/wd/hub";
		//nodeURL = "http://localhost:5566/wd/hub";
		//nodeURL = "http://192.168.1.35:5567/wd/hub";
		nodeURL = "http://192.168.1.27:4444/wd/hub";
		
		
		FirefoxOptions options = new FirefoxOptions();
		//options.setLegacy(true);
		options.setCapability("marionette", true);
		
		driver = new RemoteWebDriver(new URL(nodeURL), options);
		
		driver.get(baseUrl);
		assertEquals("Google", driver.getTitle());
		
		driver.quit();
	}

	


}
