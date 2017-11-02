package com.craftvilla.generic;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage 
{
	public WebDriver driver;
	
	
	BasePage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	
	//To verify title of the page
	
	public void verifyTitle(String eTitle)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver,10);
			
			wait.until(ExpectedConditions.titleIs(eTitle));
			
			Reporter.log("Title is present"+eTitle,true);
			
		}
		catch(Exception e)
		{
			Reporter.log("Title is not present"+eTitle,true);
			Assert.fail();
		}
	}
	
	//To verify elements 
	public void verifyElementPresent(WebElement element)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOf(element));
			
			Reporter.log("Element is present"+element,true);
			
		}
		catch(Exception e)
		{
			Reporter.log("Element is not present"+element,true);
			Assert.fail();
		}
	}
		
	
}
