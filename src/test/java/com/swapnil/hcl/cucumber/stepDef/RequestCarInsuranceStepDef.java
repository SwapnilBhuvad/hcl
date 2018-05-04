package com.swapnil.hcl.cucumber.stepDef;

import java.util.Map;

import com.swapnil.hcl.cucumber.model.HomePageData;
import com.swapnil.hcl.cucumber.steps.RequestCarInsuranceSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RequestCarInsuranceStepDef extends GenericDeclarationClass{
	
	HomePageData homePageDataProvider = new HomePageData();
	@Steps
	RequestCarInsuranceSteps requestCarInsuranceSteps;
	
	
	@Given("^Customer has car older than 10 years$")
	public void Customer_has_car_older_than_10_years() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		requestCarInsuranceSteps.openPortal();
		
	}

	@When("^Customer enters the car details on portal$")
	public void Customer_enters_the_car_details_on_portal(Map<String , String> tableData) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    //throw new PendingException();
		
		homePageDataProvider.setLicensePlateNumber(tableData.get("Car Number"));
		Thread.sleep(5000);
		homePageDataProvider.setDamageFreeYears(tableData.get("Damage Free Year"));
		homePageDataProvider.setDateOfBirth(tableData.get("DOB"));
		homePageDataProvider.setGender(tableData.get("Gender"));
		homePageDataProvider.setPostCode(tableData.get("Postcode"));
		homePageDataProvider.setHouseNumber(tableData.get("House Number"));
		Thread.sleep(5000);
		homePageDataProvider.setLivingSituation(tableData.get("Living Situation"));
		
		requestCarInsuranceSteps.enterDetails(homePageDataProvider);
		//Thread.sleep(10000);
	}

	@Then("^Application should advice for WA coverage$")
	public void Application_should_advice_for_WA_coverage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		Thread.sleep(5000);	
		requestCarInsuranceSteps.verifyCoverage(homePageDataProvider);
	}
	
	
	
	//Testcase  2 :
	
	@Given("^Customer has new car$")
	public void Customer_has_new_car() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		requestCarInsuranceSteps.openPortal();
		
	}

	@When("^Customer enters the car details of new car on portal$")
	public void Customer_enters_the_car_details_of_new_car_on_portal(Map<String , String> tableData) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    //throw new PendingException();
		
		homePageDataProvider.setLicensePlateNumber(tableData.get("Car Number"));
		//Thread.sleep(5000);
		homePageDataProvider.setDamageFreeYears(tableData.get("Damage Free Year"));
		homePageDataProvider.setDateOfBirth(tableData.get("DOB"));
		homePageDataProvider.setGender(tableData.get("Gender"));
		homePageDataProvider.setPostCode(tableData.get("Postcode"));
		homePageDataProvider.setHouseNumber(tableData.get("House Number"));
		Thread.sleep(5000);
		homePageDataProvider.setLivingSituation(tableData.get("Living Situation"));
		
		requestCarInsuranceSteps.enterDetails(homePageDataProvider);
		//Thread.sleep(10000);
	}

	@Then("^Application should advice for All risk coverage$")
	public void Application_should_advice_for_All_risk_coverage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		Thread.sleep(5000);	
		requestCarInsuranceSteps.verifyCoverageAllRisk(homePageDataProvider);
	}
	
	
	//Testcase 3 :
	
	@Given("^Customer has older car$")
	public void Customer_has_older_car() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		requestCarInsuranceSteps.openPortal();
		
	}

	@When("^Customer chooses for WA coverage$")
	public void Customer_chooses_for_WA_coverage(Map<String , String> tableData) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    //throw new PendingException();
		
		homePageDataProvider.setLicensePlateNumber(tableData.get("Car Number"));
		//Thread.sleep(5000);
		homePageDataProvider.setDamageFreeYears(tableData.get("Damage Free Year"));
		homePageDataProvider.setDateOfBirth(tableData.get("DOB"));
		homePageDataProvider.setGender(tableData.get("Gender"));
		homePageDataProvider.setPostCode(tableData.get("Postcode"));
		homePageDataProvider.setHouseNumber(tableData.get("House Number"));
		Thread.sleep(5000);
		homePageDataProvider.setLivingSituation(tableData.get("Living Situation"));
		
		requestCarInsuranceSteps.enterDetails(homePageDataProvider);
		//Thread.sleep(10000);
	}

	@Then("^Premium should be calculated and displayed$")
	public void Premium_should_be_calculated_and_displayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		Thread.sleep(5000);	
		requestCarInsuranceSteps.requestWACoverage(homePageDataProvider);
	}
	
	
	
	// Testcase 4:
	
	@Given("^Customer is younger than 16 years$")
	public void Customer_is_younger_than_16_years() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		requestCarInsuranceSteps.openPortal();
		
	}

	@When("^Customer enters car details$")
	public void Customer_enters_car_details(Map<String , String> tableData) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    //throw new PendingException();
		
		homePageDataProvider.setLicensePlateNumber(tableData.get("Car Number"));
		//Thread.sleep(5000);
		homePageDataProvider.setDamageFreeYears(tableData.get("Damage Free Year"));
		homePageDataProvider.setDateOfBirth(tableData.get("DOB"));
		homePageDataProvider.setGender(tableData.get("Gender"));
		homePageDataProvider.setPostCode(tableData.get("Postcode"));
		homePageDataProvider.setHouseNumber(tableData.get("House Number"));
		Thread.sleep(5000);
		homePageDataProvider.setLivingSituation(tableData.get("Living Situation"));
		
		requestCarInsuranceSteps.enterDetails(homePageDataProvider);
				
		
		requestCarInsuranceSteps.enterDetails(homePageDataProvider);
		//Thread.sleep(10000);
	}

	@Then("^Proper error message should be displayed for age$")
	public void Proper_error_message_should_be_displayed_for_age() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		Thread.sleep(5000);	
		requestCarInsuranceSteps.validateAge(homePageDataProvider);
	}
	
	//Testcase 5:
	
	@Given("^Customer opens portal$")
	public void Customer_opens_portal() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		requestCarInsuranceSteps.openPortal();
		
	}

	@When("^Enters invalid car number$")
	public void Enters_invalid_car_number(Map<String , String> tableData) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    //throw new PendingException();
		
		homePageDataProvider.setLicensePlateNumber(tableData.get("Car Number"));
		Thread.sleep(5000);
		
				
		
		requestCarInsuranceSteps.enterDetails(homePageDataProvider);
		//Thread.sleep(10000);
	}

	@Then("^Proper error message should be displayed for invalid car number$")
	public void Proper_error_message_should_be_displayed_for_invalid_car_number() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		Thread.sleep(5000);	
		requestCarInsuranceSteps.validateCarNumber(homePageDataProvider);
	}
	

}
