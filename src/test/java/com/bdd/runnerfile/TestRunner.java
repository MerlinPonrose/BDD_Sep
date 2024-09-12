package com.bdd.runnerfile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\neworkspace\\BDDFramework_Aug\\src\\test\\java\\com\\bdd\\feature",
glue="com.bdd.stepdefinition")
public class TestRunner {

}
