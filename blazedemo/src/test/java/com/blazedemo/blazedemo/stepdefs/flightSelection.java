package com.blazedemo.blazedemo.stepdefs;

import org.openqa.selenium.By;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

public class flightSelection {

	@Then("^I Select the Flight$")
	public void i_Select_the_Flight() throws Throwable {
		beforeAndAfterHooks.WebDriverMethodsobj.findElement(By.xpath(".//*[@id=\"container\"]/table/tbody/tr[1]/td[1]/")).click();
		
	    throw new PendingException();
	}



}
