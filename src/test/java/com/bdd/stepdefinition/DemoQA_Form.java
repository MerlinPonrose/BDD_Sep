package com.bdd.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoQA_Form extends BaseClass{

	@Given("Launch chrome browser")
	public void launchbrowser() {
	  
	
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		
	}

	@Given("Open the url {string}")
	public void open_the_url(String url) {
		
		driver.get(url);
	   
	}

	@Then("User validate the application title")
	public void user_validate_the_application_title() {
		com.verifyPageTitle("Register");
		
	}

	@When("User clicks the fname and enter the value {string}")
	public void user_clicks_the_fname_and_enter_the_value(String fname) {
		
	reg.enterFrstname(fname);
	   
	}

	@When("User click the lastName and enter {string} in lastname field")
	public void user_click_the_lastName_and_enter_in_lastname_field(String lastnamee) {
	
		reg.enterLastName(lastnamee);
		
	}

	@When("User enter the email {string}")
	public void user_enter_the_email(String email) {
		reg.enterEmaill(email);
	   
	
	}

	@When("User Click the {string} radio button")
	public void user_Click_the_radio_button(String string) {
	 
	}

	@Then("User validate the Maleradio button is clicked")
	public void user_validate_the_Maleradio_button_is_clicked() {
	  
	}

	@When("User click {string} checkbox")
	public void user_click_checkbox(String string) {
	
	}

	@Then("User validate REading checkbox is checked")
	public void user_validate_REading_checkbox_is_checked() {
	   
	}
	
	@When("User close the browser {string}")
	public void closebrowser(String url)
	{
		driver.close();
	}


}
