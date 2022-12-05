package com.training.selenium.grid;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class EdgeGridTest {

    WebDriver driver;
    String baseUrl, nodeURL;

    @BeforeAll
    public void setUp() throws MalformedURLException {
    	//Define desired capabilities
    			DesiredCapabilities cap=new DesiredCapabilities();
    			cap.setBrowserName("edge");
    			cap.setPlatform(Platform.WINDOWS);
    			
    			//Chrome option  
    			EdgeOptions options = new EdgeOptions();
    			options.merge(cap);
    			options.setHeadless(true);
    			
    			//Hub URL
    			//String huburl ="http://192.168.1.139:4444/wd/hub";
    			//String huburl ="http://192.168.1.27:4444/wd/hub";
    			String huburl ="http://localhost:4444/wd/hub";
    			 
    			// Create driver with hub address and capability
    			WebDriver driver=new RemoteWebDriver(new URL(huburl), options);

    	/*
        baseUrl= "http://google.com";
        nodeURL="http://testlab.rto.be:4444/wd/hub";
        
        DesiredCapabilities capability = DesiredCapabilities.Edge();
        capability.setBrowserName("MicrosoftEdge");
       // capability.setBrowserName(BrowserType.EDGE);
        capability.setPlatform(Platform.WIN10);
        driver = new RemoteWebDriver(new URL(nodeURL),capability);
        */
    }

    @Test
    public void simpleTest(){

        //driver.navigate().to("http://google.com");
        driver.get(baseUrl);
        assertEquals("Google", driver.getTitle());
    }

    @AfterAll
   public void afterTest(){
       driver.quit();
    }
}
