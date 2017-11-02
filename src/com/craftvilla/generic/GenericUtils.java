package com.craftvilla.generic;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils 
{
	//To select Listbox Element by index
	public static void selectByIndexList(WebElement element,int n)
	{
		Select sel = new Select(element);
		sel.selectByIndex(n);
	}
	
	//To select Listbox Element by value
		public static void selectByValueList(WebElement element,String n)
		{
			Select sel = new Select(element);
			sel.selectByValue(n);
		}
		
		
		//To select Listbox Element by visible text
		public static void selectByIndexList(WebElement element,String n)
		{
			Select sel = new Select(element);
			sel.selectByVisibleText(n);
		}
		
		//To deselect Listbox Element by index
		public static void deselectByIndexList(WebElement element,int n)
		{
			Select sel = new Select(element);
			sel.deselectByIndex(n);
		}
		
		//To deselect Listbox Element by value
		public static void deselectByValueList(WebElement element,String n)
		{
			Select sel = new Select(element);
			sel.deselectByValue(n);
		}
		
		//To deselect Listbox Element by index
		public static void deselectByVisibleTextList(WebElement element,String n)
		{
			Select sel = new Select(element);
			sel.deselectByVisibleText(n);
		}
		
		
		//Generic methods for mouse actions
		
		//to moveto element
		public static void moveTOElements(WebDriver driver,WebElement element)
		{
			
			Actions act = new Actions(driver);
			act.moveToElement(element);
			
		}
		
		//to drag and drop
		public static void dragAndDrop(WebDriver driver,WebElement source,WebElement target)
		{
			
			Actions act = new Actions(driver);
			act.dragAndDrop(source, target);
			
		}
		
		//To handle multiple windows
		public static void windowHandle(WebDriver driver,String eTitle)
		{
			Set<String> allWin = driver.getWindowHandles();
			
			for(String win : allWin)
			{
				driver.switchTo().window(win);
				if(driver.getTitle().equals(eTitle))
				{
					driver.close();
				}
			}
			
		}

}
