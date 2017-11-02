package com.craftvilla.testscrits;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.craftvilla.generic.BaseTest;

@Listeners(com.craftvilla.generic.ListenerTest.class)
public class Demo extends BaseTest
{	
	@Test
	public void demo()
	{
		Reporter.log("hi",true);
		
	}

}
