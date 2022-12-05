package com.training.selenium.map;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class GeoLocationTest {
    protected static ChromeDriver driver;
    String URL = "https://locations.dennys.com/search.html/";
 
    @BeforeAll
    public void testSetUp() {
        /* System.setProperty("webdriver.chrome.driver", "C:\\EdgeDriver\\chromedriver.exe"); */
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    
    @Test
    public void test_Selenium4_Geolocation() throws InterruptedException {
        Map< String,Object> coordinates =  
                new HashMap< String,Object>();
        
        /* Create a hashmap for latitude, longitude, and accuracy as needed by Google Maps */
        coordinates.put("latitude", 42.1408845); 
        coordinates.put("longitude", -72.5033907);
        coordinates.put("accuracy", 100);
        
        /* Command to emulate Geolocation */
        driver.executeCdpCommand("Emulation.setGeolocationOverride", coordinates);
        driver.navigate().to(URL);
        driver.manage().window().maximize();
        
        /* driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); */
        /* Not a good programming practice, added for demonstration */
        Thread.sleep(5000);
        
        WebElement location_icon = driver.findElement(By.cssSelector(".icon-geolocate"));
        Thread.sleep(2000);
        location_icon.click();
 
        Thread.sleep(6000);
        System.out.println("Geolocation testing with Selenium is complete");
    }
    
    @AfterAll
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}