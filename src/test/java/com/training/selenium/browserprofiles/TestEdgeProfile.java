package com.training.selenium.browserprofiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class TestEdgeProfile {
	private static String baseURL = "https://www.google.com";
	
	public static void main(String[] args) {
		//System.setProperty("webdriver.edge.driver", "your\\path\\to\\edge\\webdriver\\msedgedriver.exe"); 
		EdgeOptions edgeOptions = new EdgeOptions();

		// Here you set the path of the profile ending with User Data not the profile folder
		edgeOptions.addArguments("user-data-dir=C:\\Users\\yensi\\AppData\\Local\\Microsoft\\Edge\\User Data");

		// Here you specify the actual profile folder
		edgeOptions.addArguments("profile-directory=Profile 2");

		//edgeOptions.addArguments("--start-maximized");
		WebDriver driver = new EdgeDriver(edgeOptions); 
	
		
		driver.manage().window().maximize();
		driver.get(baseURL);
	}

}
