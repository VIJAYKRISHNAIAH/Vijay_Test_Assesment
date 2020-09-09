package com.blazedemo.blazedemo.stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.blazedemo.FileOperations.LoadProperties;
import com.blazedemo.blazedemo.applicationconstants.ApplicationConstants;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class destinationSelection {
	String arg1;
	String arg2;
	
	@Given("^Application url$")
	public void application_url() throws Throwable {
		beforeAndAfterHooks.WebDriverMethodsobj.get(LoadProperties.DerivergetProperty(ApplicationConstants.URL));
		Thread.sleep(5000);
	}

	
	@Then("^I Enter the \"([^\"]*)\"$")
	public void i_Enter_the(String arg1) throws Throwable {
		try {
			if(beforeAndAfterHooks.testDataProviderTypeFlag.equalsIgnoreCase("SELF")){			
			}else{
				arg1=beforeAndAfterHooks.dictionary.get("departure_city");
			}
			
			beforeAndAfterHooks.WebDriverMethodsobj.selectbyvisibletext("com.blazedemo.destinationSelectionPage.dddeparture", arg1);
			} 
			catch(Exception e){
			   e.printStackTrace();
			   System.exit(1);
			}
		
	    throw new PendingException();
	}

	@Then("^Enter the \"([^\"]*)\"$")
	public void enter_the(String arg2) throws Throwable {
		
		try {
			if(beforeAndAfterHooks.testDataProviderTypeFlag.equalsIgnoreCase("SELF")){			
			}else{
				arg2=beforeAndAfterHooks.dictionary.get("destination_city");
			}
			beforeAndAfterHooks.WebDriverMethodsobj.selectbyvisibletext("com.blazedemo.destinationSelectionPage.dddestination", arg2);
			} 
			catch(Exception e){
			   e.printStackTrace();
			   System.exit(1);
			}
		
	    throw new PendingException();
	}

	@Then("^I click on Find Flights and Verify flights displayed$")
	public void i_click_on_Find_Flights() throws Throwable {
		try {
			beforeAndAfterHooks.WebDriverMethodsobj.click("com.blazedemo.destinationSelectionPage.submit_btn");
			WebElement departureSelect = beforeAndAfterHooks.WebDriverMethodsobj
					.findElement(By.xpath(".//*[@id=\"container\"]/table/thead/tr/th [4]"));
			WebElement destinationSelect = beforeAndAfterHooks.WebDriverMethodsobj
					.findElement(By.xpath(".//*[@id=\"container\"]/table/thead/tr/th [5]"));
			Assert.assertEquals(arg1, departureSelect);
			Assert.assertEquals(arg1, destinationSelect);
			} 
			catch(Exception e){
			   e.printStackTrace();
			   System.exit(1);
			}
		
		
	    throw new PendingException();
	}

}
