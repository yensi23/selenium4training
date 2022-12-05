package com.training.selenium;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;



public class FacebookTest4CookiesConsent2 {
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
    driver.get("https://www.facebook.com/");
	driver.manage().window().setSize(new Dimension(1936, 1056));
	
	//driver.findElement(By.xpath("//button[contains(string(), 'Allow essential and optional cookies')]")).click();
	driver.findElement(By.xpath("//button[contains(string(), 'Permitir cookies necesarias y opcionales')]")).click();	
	//driver.findElement(By.xpath("//html[@id='facebook']/body/div[3]/div[2]/div/div/div/div/div[3]/button[2]")).click();

	
    assertEquals(driver.getTitle(), "Facebook - Entrar o registrarse");
  }
  
}