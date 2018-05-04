package com.swapnil.hcl.cucumber.steps;

import com.swapnil.hcl.cucumber.model.HomePageData;
import com.swapnil.hcl.cucumber.pages.HomePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class RequestCarInsuranceSteps extends ScenarioSteps{
	
	HomePage homePage;
	
	@Step

	public void openPortal() {
		// TODO Auto-generated method stub
		
		homePage.open_URL();
		
	}

	

	public void enterDetails(HomePageData homePageDataProvider) {
		// TODO Auto-generated method stub
		homePage.enterLicensePlate(homePageDataProvider);
		homePage.enterDamageFreeYears(homePageDataProvider);
		homePage.enterBirthDate(homePageDataProvider);
		homePage.enterGender(homePageDataProvider);
		homePage.enterPostcode(homePageDataProvider);
		homePage.houseNumber(homePageDataProvider);
		homePage.livingSituation(homePageDataProvider);
		
	}



	public void verifyCoverage(HomePageData homePageDataProvider) {
		// TODO Auto-generated method stub
		homePage.insuranceCoverageWA();
	}



	public void verifyCoverageAllRisk(HomePageData homePageDataProvider) {
		// TODO Auto-generated method stub
		homePage.insuranceCoverageAR();
	}



	public void requestWACoverage(HomePageData homePageDataProvider) throws InterruptedException {
		// TODO Auto-generated method stub
		homePage.requestWACoverage();
	}



	public void validateAge(HomePageData homePageDataProvider) {
		// TODO Auto-generated method stub
		homePage.validateAge();
	}



	public void validateCarNumber(HomePageData homePageDataProvider) throws InterruptedException {
		// TODO Auto-generated method stub
		homePage.validateCarNumber();
	}



	
	
	
}
