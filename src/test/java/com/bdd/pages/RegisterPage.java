package com.bdd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bdd.stepdefinition.BaseClass;

public class RegisterPage extends BaseClass{
	
	public static By firstName = By.xpath("//input[@ng-model='FirstName']");
	
	public static By lastnameee = By.xpath("//input[@ng-model='LastName']");
	
	public static By emailll = By.xpath("//input[@ng-model='EmailAdress']");
	
	
	public static void enterFrstname(String fname)
	{
		com.enterValue(firstName, fname);
		
	
	}
	
	public static void enterLastName(String lastnamee)
	{
		 com.enterValue(lastnameee, lastnamee);
	
	}
	
	public static void enterEmaill(String email)
	{
		
		com.enterValue(emailll, email);
	
	}

}
