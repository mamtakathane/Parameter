package com.parameter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTests {

@Test
public void getFirfox(){
	
	System.out.println("get firefox method in running thread:"+Thread.currentThread().getId());
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com/");
	driver.close();
}
	
	

@Test
public void getChrome(){
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	System.out.println("get chrome method in running thread:"+Thread.currentThread().getId());
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.close();
}
	
	
	
	
}
