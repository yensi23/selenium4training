package com.training.selenium.concurrent;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class GoogleTest1 {
  private static WebDriver driver;  
  
  @Execution(ExecutionMode.CONCURRENT)
  @Test
  public void google() {
	driver = new ChromeDriver();
    driver.get("https://www.google.com/");
    driver.manage().window().setSize(new Dimension(1936, 1056));
    assertEquals(driver.getTitle(), "Google");
    driver.close();
  }
  
  
  
}