package com.guru99.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features = "C:\\panay\\PM\\Learning\\AmazonCucumber\\src\\main\\java\\com\\amazon\\feature",//Path of feature file
		features = "./src//main/java/com/guru99/feature",//Path of feature file
		glue = {"com\\guru99\\stepdef"},//path of step definition file
		format = {"pretty","html:test-outout","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},//log files 
		monochrome =true,// display console in readable format
		strict = false,// check if any step in feature file is not defined 
		dryRun = false//check mapping between step definition file and feature file is correct or not 
	
		)
public class TestRunner {

}
