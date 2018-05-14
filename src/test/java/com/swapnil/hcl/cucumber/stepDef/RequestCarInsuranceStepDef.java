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
	    // Opening KNAB insurance URL
		requestCarInsuranceSteps.openPortal();
		
	}

	@When("^Customer enters the car details on portal$")
	public void Customer_enters_the_car_details_on_portal(Map<String , String> tableData) throws Exception {
	    // Entering required details on portal
		
		//Setting values to elements from data table
		
		homePageDataProvider.setLicensePlateNumber(tableData.get("Car Number"));
		homePageDataProvider.setDamageFreeYears(tableData.get("Damage Free Year"));
		homePageDataProvider.setDateOfBirth(tableData.get("DOB"));
		homePageDataProvider.setGender(tableData.get("Gender"));
		homePageDataProvider.setPostCode(tableData.get("Postcode"));
		homePageDataProvider.setHouseNumber(tableData.get("House Number"));
		homePageDataProvider.setLivingSituation(tableData.get("Living Situation"));
		
		// Calling main method to enter details.
		
		requestCarInsuranceSteps.enterDetails(homePageDataProvider);
		//Thread.sleep(10000);
	}

	@Then("^Application should advice for WA coverage$")
	public void Application_should_advice_for_WA_coverage() throws Exception {
	    //Verifying if WA Coverage is offered.	
		
		requestCarInsuranceSteps.verifyCoverage(homePageDataProvider);
	}
	
	
	
	//Testcase  2 :
	
	@Given("^Customer has new car$")
	public void Customer_has_new_car() throws Exception {
		// Opening KNAB insurance URL
		
		requestCarInsuranceSteps.openPortal();
		
	}

	@When("^Customer enters the car details of new car on portal$")
	public void Customer_enters_the_car_details_of_new_car_on_portal(Map<String , String> tableData) throws Exception {
		// Entering required details on portal
		
		//Setting values to elements from data table
		
		homePageDataProvider.setLicensePlateNumber(tableData.get("Car Number"));
		homePageDataProvider.setDamageFreeYears(tableData.get("Damage Free Year"));
		homePageDataProvider.setDateOfBirth(tableData.get("DOB"));
		homePageDataProvider.setGender(tableData.get("Gender"));
		homePageDataProvider.setPostCode(tableData.get("Postcode"));
		homePageDataProvider.setHouseNumber(tableData.get("House Number"));
		homePageDataProvider.setLivingSituation(tableData.get("Living Situation"));
		
		// Calling main method to enter details.
		requestCarInsuranceSteps.enterDetails(homePageDataProvider);
		
	}

	@Then("^Application should advice for All risk coverage$")
	public void Application_should_advice_for_All_risk_coverage() throws Exception {
	    //Verifying id All risk insurance is offered.
		
		requestCarInsuranceSteps.verifyCoverageAllRisk(homePageDataProvider);
	}
	
	
	//Testcase 3 :
	
	@Given("^Customer has older car$")
	public void Customer_has_older_car() throws Exception {
		// Opening KNAB insurance URL
		
		requestCarInsuranceSteps.openPortal();
		
	}

	@When("^Customer chooses for WA coverage$")
	public void Customer_chooses_for_WA_coverage(Map<String , String> tableData) throws Exception {
		// Entering required details on portal
		
		//Setting values to elements from data table
		
		homePageDataProvider.setLicensePlateNumber(tableData.get("Car Number"));
		homePageDataProvider.setDamageFreeYears(tableData.get("Damage Free Year"));
		homePageDataProvider.setDateOfBirth(tableData.get("DOB"));
		homePageDataProvider.setGender(tableData.get("Gender"));
		homePageDataProvider.setPostCode(tableData.get("Postcode"));
		homePageDataProvider.setHouseNumber(tableData.get("House Number"));
		homePageDataProvider.setLivingSituation(tableData.get("Living Situation"));
		
		// Calling main method to enter details.
		
		requestCarInsuranceSteps.enterDetails(homePageDataProvider);
		
	}

	@Then("^Premium should be calculated and displayed$")
	public void Premium_should_be_calculated_and_displayed() throws Exception {
	    
		//Verify if customer able to request WA coverange and premium is calculated.
	
		
		requestCarInsuranceSteps.requestWACoverage(homePageDataProvider);
	}
	
	
	
	

	//Testcase 4 :
	
	@Given("^Customer having new car$")
	public void Customer_having_new_car() throws Exception {
		// Opening KNAB insurance URL
		
		requestCarInsuranceSteps.openPortal();
		
	}

	@When("^Customer chooses for All Risk coverage$")
	public void Customer_chooses_for_All_Risk_coverage(Map<String , String> tableData) throws Exception {
		// Entering required details on portal
		
		//Setting values to elements from data table
		
		homePageDataProvider.setLicensePlateNumber(tableData.get("Car Number"));
		homePageDataProvider.setDamageFreeYears(tableData.get("Damage Free Year"));
		homePageDataProvider.setDateOfBirth(tableData.get("DOB"));
		homePageDataProvider.setGender(tableData.get("Gender"));
		homePageDataProvider.setPostCode(tableData.get("Postcode"));
		homePageDataProvider.setHouseNumber(tableData.get("House Number"));
		homePageDataProvider.setLivingSituation(tableData.get("Living Situation"));
		
		// Calling main method to enter details.
		
		requestCarInsuranceSteps.enterDetails(homePageDataProvider);
		//Thread.sleep(10000);
	}

	@Then("^Premium should be calculated and displayed for All Risk$")
	public void Premium_should_be_calculated_and_displayed_for_All_Risk() throws Exception {
	    
		//Verify that customer is able to request for All risk coverage 
		requestCarInsuranceSteps.requestARCoverage(homePageDataProvider);
	}
	
	// Testcase 5:
	
	@Given("^Customer is younger than 16 years$")
	public void Customer_is_younger_than_16_years() throws Exception {
		// Opening KNAB insurance URL
		
		requestCarInsuranceSteps.openPortal();
		
	}

	@When("^Customer enters car details$")
	public void Customer_enters_car_details(Map<String , String> tableData) throws Exception {
		// Entering required details on portal
		
		//Setting values to elements from data table
		
		homePageDataProvider.setLicensePlateNumber(tableData.get("Car Number"));
		homePageDataProvider.setDamageFreeYears(tableData.get("Damage Free Year"));
		homePageDataProvider.setDateOfBirth(tableData.get("DOB"));
		
		// Calling main method to enter details.		
		requestCarInsuranceSteps.enterDetailsErr(homePageDataProvider);
		
	}

	@Then("^Proper error message should be displayed for age$")
	public void Proper_error_message_should_be_displayed_for_age() throws Exception {

		// Verify that error message is displayed when age is not valid
		
		requestCarInsuranceSteps.validateAge(homePageDataProvider);
	}
	
	
	//Testcase 6
	
	// Testcase 5:
	
		@Given("^Customer is having invalid car number$")
		public void Customer_is_having_invalid_car_number() throws Exception {
			// Opening KNAB insurance URL
			
			requestCarInsuranceSteps.openPortal();
			
		}

		@When("^Customer enters invalid car number$")
		public void Customer_enters_invalid_car_number(Map<String , String> tableData) throws Exception {
			// Entering required details on portal
			
			//Setting values to elements from data table
			
			homePageDataProvider.setLicensePlateNumber(tableData.get("Car Number"));
			
			
			// Calling main method to enter details.		
			requestCarInsuranceSteps.enterDetailsErr2(homePageDataProvider);
			
		}

		@Then("^Proper error message should be displayed for invalid car number$")
		public void Proper_error_message_should_be_displayed_for_invalid_car_number() throws Exception {

			// Verify that error message is displayed when age is not valid
			
			requestCarInsuranceSteps.validateCarNumber(homePageDataProvider);
		}
	
	

}
