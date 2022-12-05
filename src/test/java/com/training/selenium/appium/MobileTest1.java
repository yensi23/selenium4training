package com.training.selenium.appium;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileTest1 {
	
	public static void main(String[] args) throws Exception {
	WebDriver driver;
	
	System.out.println("**** Android ****");
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
	//capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Android");
	capabilities.setCapability(MobileCapabilityType.VERSION, "8");
	capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
	capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	
	//capabilities.setCapability("appPackage", PACKAGE);
	capabilities.setCapability("appActivity", ".MainActivity");
	//capabilities.setCapability("appWaitPackage", PACKAGE); 
	//capabilities.setCapability("appWaitActivity", ".view.TestFields");
	 
	capabilities.setCapability(MobileCapabilityType.APP,"https://applitools.jfrog.io/artifactory/Examples/app-debug.apk");
	
	driver = new AndroidDriver<WebElement>(new URL("http://192.168.1.23:4723/wd/hub"),capabilities);
	
	if (driver != null) {
		driver.quit();
	}
	}

}
