package com.bdd.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bdd.stepdefinition.BaseClass;

public class Common extends BaseClass{
	
	
	public static void enterValue(By locator, String value)
	{
		WebElement ele = driver.findElement(locator);
		ele.click();
		ele.clear();
		ele.sendKeys(value);
	}

	public static void verifyPageTitle(String expectedTitle)
	{
String actualtitle = driver.getTitle();
		
		if(actualtitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("Landed in expected page");
		}
	   
	}
	
}
