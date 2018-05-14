package com.swapnil.hcl.cucumber.pages;


import static org.junit.Assert.assertTrue;

import java.sql.Driver;


import org.junit.Assert;
import org.openqa.selenium.Keys;

import com.fasterxml.classmate.util.ResolvedTypeCache.Key;
import com.swapnil.hcl.cucumber.model.HomePageData;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends GenericPageObject {
	
	
	
	@FindBy(id="licensePlate")
	private WebElementFacade licensePlate_locator;
	
	@FindBy(id="claimFreeYears")
	private WebElementFacade claimFreeYears_locator;
	
	@FindBy(id="birthDate")
	private WebElementFacade birthDate_locator;
	
	@FindBy(xpath="//div/label[@class='knx-radio'][1]/span[1]")
	private WebElementFacade Man_locator;
	
	@FindBy(xpath="//div/label[@class='knx-radio'][2]/span[1]")
	private WebElementFacade Woman_locator;
	
	@FindBy(id="postalCode")
	private WebElementFacade postcode_locator;
	
	@FindBy(id="houseNumber")
	private WebElementFacade houseNumber_locator;
	
	@FindBy(id="houseHold")
	private WebElementFacade livingSituation_locator;
	
	@FindBy(css="#CL > div.knx-recommended.hidden-xs")
	private WebElementFacade WA_locator;
	
	@FindBy(css="#CAR > div.knx-recommended.hidden-xs")
	private WebElementFacade AR_Locator;
	
	@FindBy(css="#carDetailForm > div:nth-child(1) > div > knx-card:nth-child(2) > div > div:nth-child(2) > div > knx-form-group.knx-form-group--error::after > div")
	private WebElementFacade dateError_locator;
	
	@FindBy(css="#carDetailForm > div:nth-child(1) > div > knx-card:nth-child(1) > div > div:nth-child(2) > div > knx-form-group.knx-form-group--error::after > div")
	private WebElementFacade carError_locator;
	
	@FindBy(xpath="//*[<div _ngcontent-c18=\"\" class=\"col\">Merk</div>")
	private WebElementFacade carInfo_locator;
	
	@FindBy(xpath="//div[@class='row knx-address-lookup__result']/div/knx-async-preview/div/span")
	private WebElementFacade address_locator;
	
	
	@FindBy(css="body > knx-app > div > ng-component > div.container.knx-car-advice.knx-car-advice--step-1 > knx-wizard-rx > div > div.col-sm-4.push-sm-8 > div > knx-chat-stream > div > div:nth-child(3) > knx-chat-message > div > div")
	private WebElementFacade insuranceOverview_locator;
	
	public void open_URL() {
		// TODO Auto-generated method stub
		
		
		open();
	}

	

	public void enterLicensePlate(HomePageData homePageDataProvider) {
		// TODO Auto-generated method stub
		licensePlate_locator.sendKeys(homePageDataProvider.getLicensePlateNumber());
		licensePlate_locator.sendKeys(Keys.TAB);
		
	}



	public void enterDamageFreeYears(HomePageData homePageDataProvider) {
		// TODO Auto-generated method stub
		claimFreeYears_locator.sendKeys(homePageDataProvider.getDamageFreeYears());
	}



	public void enterBirthDate(HomePageData homePageDataProvider) {
		// TODO Auto-generated method stub
		birthDate_locator.sendKeys(homePageDataProvider.getDateOfBirth());
	}



	public void enterGender(HomePageData homePageDataProvider) {
		// TODO Auto-generated method stub
		
		if(homePageDataProvider.getGender().equals("Man")) {
			Man_locator.click();
		}
		else {
			Woman_locator.click();
		}
		
	}



	public void enterPostcode(HomePageData homePageDataProvider) {
		// TODO Auto-generated method stub
		
		postcode_locator.sendKeys(homePageDataProvider.getPostCode());
	}



	public void houseNumber(HomePageData homePageDataProvider) {
		// TODO Auto-generated method stub
		houseNumber_locator.sendKeys(homePageDataProvider.getHouseNumber());
		address_locator.waitUntilPresent();
	}



	public void livingSituation(HomePageData homePageDataProvider) {
		// TODO Auto-generated method stub
		
		if(homePageDataProvider.getLivingSituation().equals("Single")) {
		livingSituation_locator.selectByValue("CHM");
		}
		
	}
	
	public void insuranceCoverageWA() {
		
		try {		
		if( WA_locator.isDisplayed()){
			String ActualMessageWA = insuranceOverview_locator.getText();
			String ExpectedMessageWA = "Met een WA dekking is alleen de schade die jij toebrengt aan anderen gedekt. Schade aan je eigen auto moet je dus zelf betalen. Deze dekking is verstandig voor auto's ouder dan 10 jaar.";
			Assert.assertEquals(ExpectedMessageWA,ActualMessageWA);
		}
		}
		catch(Exception e) {
			System.out.println("Exception Occurred");
		}
	}



	public void insuranceCoverageAR() {
		// TODO Auto-generated method stub
		try {
		if( AR_Locator.isDisplayed()){
			
			String ActualMessageAR= insuranceOverview_locator.getText();
			String ExpectedMessageAR = "Heb je een nieuwe auto van maximaal 6 jaar oud, of heb je een lening afgesloten voor je auto? Dan raad ik je Allrisk aan. Als je auto onherstelbaar beschadigd raakt, krijg je een vergoeding om een nieuwe te kopen. Bij een andere dekking krijg je deze vergoeding niet.";
			
			Assert.assertEquals(ExpectedMessageAR,ActualMessageAR);
		}
		}
		catch(Exception e) {
			System.out.println("Exception Occurred");
		}
	}



	public void requestWACoverage() throws InterruptedException {
		// TODO Auto-generated method stub
		
		if(WA_locator.isDisplayed()==true) {
			Thread.sleep(5000);
			WA_locator.click();
			Thread.sleep(10000);
		}
		
		
	}



	public void validateAge() {
		// TODO Auto-generated method stub
		
		if(dateError_locator.isVisible()==true) {
			
			String ActualError = dateError_locator.getText();
			String ExpectedError = "De ingevulde geboortedatum is niet geldig";
			
			Assert.assertEquals(ExpectedError,ActualError);
		}
		
		
	}



	

	public void requestARCoverage() throws InterruptedException {
		// TODO Auto-generated method stub
		AR_Locator.waitUntilVisible();
		AR_Locator.click();
		
		/*if(AR_Locator.isDisplayed()==true) {
			Thread.sleep(5000);
			AR_Locator.click();
			Thread.sleep(10000);
		}*/
	}



	public void validateCarNumber() {
		// TODO Auto-generated method stub
		
			if(carError_locator.isVisible()==true) {
			
			String ActualError = carError_locator.getText();
			String ExpectedError = "Het ingevulde kenteken is niet geregistreerd";
			
			Assert.assertEquals(ExpectedError,ActualError);
		}
	}



	



	



	
	
	

}
