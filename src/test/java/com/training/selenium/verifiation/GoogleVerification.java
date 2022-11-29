package com.training.selenium.verifiation;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;



public class GoogleVerification {
  private static WebDriver driver;  
  
  @Test
  public void google() {
	driver = new ChromeDriver();
    driver.get("https://www.google.com/");
	driver.manage().window().setSize(new Dimension(1936, 1056));
    assertEquals(driver.getTitle(), "Google");
    driver.close();
  }
  
}