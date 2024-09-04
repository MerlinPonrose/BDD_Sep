package com.bdd.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.bdd.pages.RegisterPage;
import com.bdd.utility.Common;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static Common com = new Common();
	
	public static RegisterPage reg = new RegisterPage();

}
