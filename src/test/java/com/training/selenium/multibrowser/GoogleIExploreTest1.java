package com.training.selenium.multibrowser;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;



public class GoogleIExploreTest1 {
  private static WebDriver driver;  
  
  @Test
  public void google() {
	driver = new InternetExplorerDriver();
    driver.get("https://www.google.com/");
    driver.manage().window().setSize(new Dimension(1936, 1056));
    assertEquals(driver.getTitle(), "Google");
    driver.close();
  }
  
  
  
}