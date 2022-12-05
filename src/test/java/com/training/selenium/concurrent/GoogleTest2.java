package com.training.selenium.concurrent;



import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;



public class GoogleTest2 {
  private static WebDriver driver;  
  
  @Execution(ExecutionMode.CONCURRENT)
  @Test
  public void google() {
	driver = new ChromeDriver();
    driver.get("https://www.google.com/");
	driver.manage().window().setSize(new Dimension(1936, 1056));
    assertEquals(driver.getTitle(), "Google");
    //driver.close();
  }
  
  //@Execution(ExecutionMode.SAME_THREAD)
  @Execution(ExecutionMode.CONCURRENT)
  @Test
  public void yahoo() {
	driver = new ChromeDriver();
    driver.get("https://www.yahoo.com/");
	driver.manage().window().setSize(new Dimension(1936, 1056));
    assertEquals(driver.getTitle(), "Yahoo forma parte de la familia de marcas de Yahoo");
    //driver.close();
  }
  
}