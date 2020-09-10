package com.blazedemo.blazedemo.stepdefs;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import com.blazedemo.FileOperations.LoadProperties;
import com.blazedemo.blazedemo.applicationconstants.ApplicationConstants;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class destinationSelection {
	String arg1="";
	String arg2="";
	
	@Given("^Application url$")
	public void application_url() throws Throwable {
		beforeAndAfterHooks.WebDriverMethodsobj.get(LoadProperties.DerivergetProperty(ApplicationConstants.URL));
		Thread.sleep(5000);
	}
	
	@Then("^I Enter the departure city \"([^\"]*)\"$")
	public void i_Enter_the_departure_city(String arg1) throws Throwable {
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
	    
	}

	@Then("^Enter the destination city \"([^\"]*)\"$")
	public void enter_the_destination_city(String arg2) throws Throwable {
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
	    
	}

	@Then("^I click on Find Flight button and Verify flights displayed$")
	public void i_click_on_Find_Flight_button_and_Verify_flights_displayed() throws Throwable {
		try {
			
			WebElement findflight = beforeAndAfterHooks.WebDriverMethodsobj.findElement("com.blazedemo.destinationSelectionPage.submit_btn");
			findflight.click();
			WebElement departureSelect = beforeAndAfterHooks.WebDriverMethodsobj
					.findElement(By.xpath(".//*[@Class=\"container\"]/table/thead/tr/th[4]"));
			String depsel = departureSelect.getText();
			WebElement destinationSelect = beforeAndAfterHooks.WebDriverMethodsobj
					.findElement(By.xpath(".//*[@Class=\"container\"]/table/thead/tr/th[5]"));
			String destsel = destinationSelect.getText();
			assertTrue(depsel.contains(arg1));
			assertTrue(destsel.contains(arg2));
			} 
			catch(Exception e){
			   e.printStackTrace();
			   System.exit(1);
			}
		
	   
	}

	@Then("^I Select the Flight for from to To$")
	public void i_Select_the_Flight_for_from_to_To() throws Throwable {
		WebElement findflight = beforeAndAfterHooks.WebDriverMethodsobj.findElement(By.xpath(".//*[@Class='container']/table/tbody/tr[1]/td[1]/input"));
		findflight.click();
		Thread.sleep(2000);
	    
	}

	@Then("^I enter name \"([^\"]*)\"$")
	public void i_enter_name(String arg1) throws Throwable {
		try {
			  if(beforeAndAfterHooks.testDataProviderTypeFlag.equalsIgnoreCase("SELF")){
			  }else{ 
				  arg1=beforeAndAfterHooks.dictionary.get("name"); 
				  }
			  
			  beforeAndAfterHooks.WebDriverMethodsobj.sendkeys("com.blazedemo.flightBookingPage.name", arg1); 
			  Thread.sleep(2000);
		  }
		catch(Exception e){
		  e.printStackTrace(); System.exit(1); 
		  }
		beforeAndAfterHooks.WebDriverMethodsobj.implecitwait();
	}

	@Then("^enter address \"([^\"]*)\"$")
	public void enter_address(String arg1) throws Throwable {
		try {
			  if(beforeAndAfterHooks.testDataProviderTypeFlag.equalsIgnoreCase("SELF")){
			  }else{ 
				  arg1=beforeAndAfterHooks.dictionary.get("address"); 
				  }
			  
			  beforeAndAfterHooks.WebDriverMethodsobj.sendkeys("com.blazedemo.flightBookingPage.address", arg1); 
					  Thread.sleep(2000);
					  
		  }
		catch(Exception e){
		    e.printStackTrace(); System.exit(1); }
			beforeAndAfterHooks.WebDriverMethodsobj.implecitwait();
		}

	@Then("^I enter the city \"([^\"]*)\"$")
	public void i_enter_the_city(String arg1) throws Throwable {
		try {
			  if(beforeAndAfterHooks.testDataProviderTypeFlag.equalsIgnoreCase("SELF")){
			  }else{ 
				  arg1=beforeAndAfterHooks.dictionary.get("city"); 
				  }
			  beforeAndAfterHooks.WebDriverMethodsobj.sendkeys("com.blazedemo.flightBookingPage.city", arg1);
			  Thread.sleep(2000);	  
		  }
	  catch(Exception e){
		  e.printStackTrace(); System.exit(1); }
		  
	}

	@Then("^I enter the state \"([^\"]*)\"$")
	public void i_enter_the_state(String arg1) throws Throwable {
		  try {
			  if(beforeAndAfterHooks.testDataProviderTypeFlag.equalsIgnoreCase("SELF")){
			  }else{ 
				  arg1=beforeAndAfterHooks.dictionary.get("state"); 
				  }
			  
			  beforeAndAfterHooks.WebDriverMethodsobj.sendkeys(
					  "com.blazedemo.flightBookingPage.state", arg1); 
			  Thread.sleep(2000);
					  	  
		  }
	  catch(Exception e){
		  e.printStackTrace(); System.exit(1); }
	}

	@Then("^enter the zipcode \"([^\"]*)\"$")
	public void enter_the_zipcode(String arg1) throws Throwable {
		try {
			  if(beforeAndAfterHooks.testDataProviderTypeFlag.equalsIgnoreCase("SELF")){
			  }else{ 
				  arg1=beforeAndAfterHooks.dictionary.get("zipcode"); 
				  }
			  
			  beforeAndAfterHooks.WebDriverMethodsobj.sendkeys("com.blazedemo.flightBookingPage.zipcode", arg1); 
			  Thread.sleep(2000);
					  	  
		  }
	  catch(Exception e){
		  e.printStackTrace(); System.exit(1); }
	}

	@Then("^I enter the cardtype \"([^\"]*)\"$")
	public void i_enter_the_cardtype(String arg1) throws Throwable {
		try {
			  if(beforeAndAfterHooks.testDataProviderTypeFlag.equalsIgnoreCase("SELF")){
			  }else{ 
				  arg1=beforeAndAfterHooks.dictionary.get("CardType"); 
				  }
			  
			  beforeAndAfterHooks.WebDriverMethodsobj.selectbyvisibletext("com.blazedemo.flightBookingPage.CardType", arg1); 
			  } catch(Exception e){
			  e.printStackTrace(); System.exit(1); }
	}

	
	  @Then("^I enter the creditcardno \"([^\"]*)\"$") 
	  public void i_enter_the_creditcardno(String arg1) throws Throwable {
		  try {
			  if(beforeAndAfterHooks.testDataProviderTypeFlag.equalsIgnoreCase("SELF")){
			  }else{ 
				  arg1=beforeAndAfterHooks.dictionary.get("creditcardnumber"); 
				  }
			  
			  beforeAndAfterHooks.WebDriverMethodsobj.sendkeys("com.blazedemo.flightBookingPage.creditcardnumber", arg1);
			  Thread.sleep(2000); 
			  } catch(Exception e){
			  e.printStackTrace(); System.exit(1); }
	  }
	  
	  @Then("^I enter the month \"([^\"]*)\"$") 
	  public void i_enter_the_month(String arg1) throws Throwable {
		  try {
			  if(beforeAndAfterHooks.testDataProviderTypeFlag.equalsIgnoreCase("SELF")){
			  }else{ 
				  arg1=beforeAndAfterHooks.dictionary.get("month"); 
				  }
			  
			  beforeAndAfterHooks.WebDriverMethodsobj.sendkeys("com.blazedemo.flightBookingPage.month", arg1);
			  Thread.sleep(2000);
			  } catch(Exception e){
			  e.printStackTrace(); System.exit(1); }
	  }
	  
	  @Then("^I enter the year \"([^\"]*)\"$")
	  public void i_enter_the_year(String arg1) throws Throwable { 
		  try {
			  if(beforeAndAfterHooks.testDataProviderTypeFlag.equalsIgnoreCase("SELF")){
			  }else{ 
				  arg1=beforeAndAfterHooks.dictionary.get("year"); 
				  }
			  
			  beforeAndAfterHooks.WebDriverMethodsobj.sendkeys("com.blazedemo.flightBookingPage.year", arg1);
			  Thread.sleep(2000);
			  } catch(Exception e){
			  e.printStackTrace(); System.exit(1); }
		  }
	  
	  @Then("^I enter nameoncard \"([^\"]*)\"$") 
	  public void i_enter_nameoncard(String arg1) throws Throwable {
		  try {
			  if(beforeAndAfterHooks.testDataProviderTypeFlag.equalsIgnoreCase("SELF")){
			  }else{ 
				  arg1=beforeAndAfterHooks.dictionary.get("nameoncard"); 
				  }
			  
			  beforeAndAfterHooks.WebDriverMethodsobj.sendkeys("com.blazedemo.flightBookingPage.nameoncard", arg1); 
			  Thread.sleep(2000);
			  } catch(Exception e){
			  e.printStackTrace(); System.exit(1); }
		  }
	  
	  @Then("^I check rememberme\"([^\"]*)\"$") 
	  public void i_check_rememberme(String arg1) throws Throwable { 
		  try {
			  if(beforeAndAfterHooks.testDataProviderTypeFlag.equalsIgnoreCase("SELF")){
			  }else{ 
				  arg1=beforeAndAfterHooks.dictionary.get("RememberMe"); 
				  }
			  
			  //WebElement target =beforeAndAfterHooks.WebDriverMethodsobj.findElement(By.id("com.blazedemo.flightBookingPage.RememberMe")); 
			  beforeAndAfterHooks.WebDriverMethodsobj.click("com.blazedemo.flightBookingPage.RememberMe");
			  } catch(Exception e){
			  e.printStackTrace(); System.exit(1); }
		  
		  }
	  
	  @Then("^I Book Flight$") 
	  public void i_Book_Flight() throws Throwable {
		  WebElement bookflight =  beforeAndAfterHooks.WebDriverMethodsobj.findElement(By.xpath("//input[@value='Purchase Flight'][@type='submit']")); 
		  bookflight.click();
	  beforeAndAfterHooks.WebDriverMethodsobj.implecitwait(); 
	  String expectedUserClientPage = "Thank you for your purchase today!"; 
	  WebElement divElement = beforeAndAfterHooks.WebDriverMethodsobj.findElement(By.xpath(".//*[@Class='container hero-unit']/h1[1]")); 
	  Thread.sleep(2000); 
	  String str = divElement.getText();
	  Assert.assertEquals(str,expectedUserClientPage,"Booked successfully");
	  beforeAndAfterHooks.WebDriverMethodsobj.quit(); 
	  }
	  
	 

}
