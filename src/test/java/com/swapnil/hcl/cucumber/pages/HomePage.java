package com.swapnil.hcl.cucumber.pages;

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
	
	@FindBy(xpath="/html/body/knx-app/div/ng-component/div[3]/knx-wizard-rx/div/div[2]/div/knx-car-detail-form/knx-wizard-controls/div/div[1]")
	private WebElementFacade Error_locator;
	
	@FindBy(xpath="//*[<div _ngcontent-c18=\"\" class=\"col\">Merk</div>")
	private WebElementFacade CarInfo_locator;
	
	public void open_URL() {
		// TODO Auto-generated method stub
		
		
		open();
	}

	

	public void enterLicensePlate(HomePageData homePageDataProvider) {
		// TODO Auto-generated method stub
		licensePlate_locator.sendKeys(homePageDataProvider.getLicensePlateNumber());
		
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
	}



	public void livingSituation(HomePageData homePageDataProvider) {
		// TODO Auto-generated method stub
		
		if(homePageDataProvider.getLivingSituation().equals("Single")) {
		livingSituation_locator.selectByValue("CHM");
		}
		
	}
	
	public void insuranceCoverageWA() {
		
				
		if( WA_locator.isDisplayed()){
			System.out.println("WA Insurance coverage is offered, Testcase Passed");
			}else{
			System.out.println("WA Insurance coverage is not offered, Testcase Failed");
			}
		
	}



	public void insuranceCoverageAR() {
		// TODO Auto-generated method stub
		if( AR_Locator.isDisplayed()){
			System.out.println("All Risk Insurance coverage is offered, Testcase Passed");
			}else{
			System.out.println("All Risk Insurance coverage is not offered, Testcase Failed");
			}
	}



	public void requestWACoverage() throws InterruptedException {
		// TODO Auto-generated method stub
		if(WA_locator.isDisplayed()==true) {
			WA_locator.click();
			Thread.sleep(10000);
		}
	}



	public void validateAge() {
		// TODO Auto-generated method stub
		WA_locator.click();
		if(Error_locator.isDisplayed()==true) {
			System.out.println("Error is displayed, Negative Testcase is passed");
		}
		else {
			System.out.println("Error is not displayed, Negative Testcase is failed");
		}
		
	}



	public void validateCarNumber() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		if(CarInfo_locator.isDisplayed()==false) {
			System.out.println("Car details are not fetched, negative testcase is passed");
			
		}
		else {
			System.out.println("Negative testcase is failed");
		}
	}



	
	
	

}
