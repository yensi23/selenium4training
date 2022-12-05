package com.training.selenium.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;


public class GridChromeDownloadFile {
	private WebDriver driver;
	private String nodeURL;
	
	@BeforeAll
	public void setUp() throws MalformedURLException {
		
		//System.setProperty("webdriver.chrome.driver","./src/test/resources/drivers/chromedriver.exe");

//		driver = new ChromeDriver();
//        DesiredCapabilities dc = DesiredCapabilities.chrome();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        
//       dc.setBrowserName("chrome");
//        //dc.setCapability("version","80");
//        
//        driver = new RemoteWebDriver(new URL("http://192.168.1.11:4444/wd/hub"),dc);
//		driver.manage().window().maximize();
		
		//nodeURL = "http://192.168.1.11:4444/wd/hub";
		nodeURL  ="http://192.168.1.27:4444/wd/hub";
		ChromeOptions options = new ChromeOptions();
		driver = new RemoteWebDriver(new URL(nodeURL), options);
		
		
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
	public void tearDown() {
		driver.quit();
	}
}
