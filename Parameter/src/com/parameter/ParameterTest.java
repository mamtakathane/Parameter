package com.parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

	WebDriver driver;
	
	@Parameters({"browser","url","email","password"})
	@Test
	public void ParameterTest1(String browser,String url,String email,String password)
	{
		
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
	//driver.findElement(By.xpath("//input[@type='submit']")).sendKeys(button);
	
	}



		
	
	@Test
	@Parameters({"browser","url"})
	public void ParameterTest2(String browser,String url)
	{
		

	driver = new FirefoxDriver();
	driver.get(url);
	driver.manage().window().maximize();
	//driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
//	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
	
		
		
	
	}
	}
	
	
	
	
	

