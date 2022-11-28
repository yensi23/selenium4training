package com.training.selenium;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;



public class GoogleTest3 {
  private static WebDriver driver;
  
  
  @BeforeAll
  static public void setUp() {	
		driver = new ChromeDriver();
	
  }
  
  @AfterAll
  static public void tearDown() {
	  //if (driver != null)
		  //driver.quit();
  }
  
  
  @Test
  public void google() {
    driver.get("https://www.google.com/");
	driver.manage().window().setSize(new Dimension(1936, 1056));
	
	driver.manage().deleteCookieNamed ("CONSENT");
	driver.manage().addCookie(new Cookie("CONSENT","YES+shp.gws-"+LocalDate.now().toString().replace("-","")+"-0-RC2.en+FX+374"));
	driver.navigate().refresh();
	
    assertEquals(driver.getTitle(), "Google");
  }
  
}