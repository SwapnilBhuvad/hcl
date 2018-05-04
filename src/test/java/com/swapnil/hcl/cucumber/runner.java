package com.swapnil.hcl.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= {"src/test/resources/features"},
glue= {"com.swapnil.hcl.cucumber.stepDef"})
public class runner {

}
