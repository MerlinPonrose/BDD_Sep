package com.bdd.stepdefinition;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import cucumber.api.java.en.When;

public class DataTable_BDD extends BaseClass
{

	
	@When("User clicks the fname and enter the value in FirstName")
	public void user_clicks_the_fname_and_enter_the_value_in_FirstName(io.cucumber.datatable.DataTable dataTable) {
	
		//asList
	/*	List<String> asList = dataTable.asList();
		reg.enterFrstname(asList.get(0));*/
		
		Map<String, String> asMap = dataTable.asMap(String.class, String.class);
		System.out.println(asMap.get("FirsttName"));
		reg.enterFrstname(asMap.get("FirsttName"));
	
	}

	@When("User enter value in lastname and email")
	public void user_enter_value_in_lastname_and_email(io.cucumber.datatable.DataTable dataTable) {
		
		//asLists
	/*	List<List<String>> asLists = dataTable.asLists();
		reg.enterLastName(asLists.get(0).get(0));
		reg.enterEmaill(asLists.get(0).get(1));*/
		
		List<Map<String, String>> asMaps = dataTable.asMaps(String.class,String.class);
		
		reg.enterLastName(asMaps.get(0).get("LastName"));
		reg.enterEmaill(asMaps.get(0).get("Email"));
	}


	
}
