package com.craftvilla.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements AutoConstant
{
	public static WebDriver driver= null;
	
	@BeforeMethod
	public void preConditions()
	{
		System.setProperty(chrome_Key, chrome_Value);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.craftsvilla.com");
		
		
	}
	
	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}
		
}
