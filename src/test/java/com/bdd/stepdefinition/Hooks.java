package com.bdd.stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{
	
	@Before(order=2)
	public void precondition1()
	{
		System.out.println("Precondition");
	}
	
	@After(order=2)
	public void closebrowser()
	{
		driver.close();
	}

	
	@Before("@test")
	public void precondition2()
	{
		System.out.println("Precondition2");
	}
	
	@After("@test")
	public void postcondition()
	{
		System.out.println("postcondition");
	}
}
