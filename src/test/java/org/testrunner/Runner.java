
package org.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features",glue="org.step",dryRun = false ,monochrome = true,
tags= "@oodu")
public class Runner {

	
	
	 
}
