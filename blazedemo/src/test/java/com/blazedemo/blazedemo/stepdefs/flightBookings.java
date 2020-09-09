package com.blazedemo.blazedemo.stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

public class flightBookings {

	@Then("^I enter <\"([^\"]*)\">$")
	public void i_enter(String arg1) throws Throwable {
		beforeAndAfterHooks.WebDriverMethodsobj.sendkeys("com.blazedemo.flightBookingPage.name", arg1);
		Thread.sleep(5000);
		beforeAndAfterHooks.WebDriverMethodsobj.sendkeys("com.blazedemo.flightBookingPage.name", Keys.RETURN);
		beforeAndAfterHooks.WebDriverMethodsobj.implecitwait();
	    throw new PendingException();
	}

	@Then("^enter <\"([^\"]*)\">$")
	public void enter(String arg1) throws Throwable {
		beforeAndAfterHooks.WebDriverMethodsobj.sendkeys("com.blazedemo.flightBookingPage.address", arg1);
		Thread.sleep(5000);
		beforeAndAfterHooks.WebDriverMethodsobj.sendkeys("com.blazedemo.flightBookingPage.address", Keys.RETURN);
		beforeAndAfterHooks.WebDriverMethodsobj.implecitwait();
	    throw new PendingException();
	}

	@Then("^I enter the <\"([^\"]*)\">$")
	public void i_enter_the(String arg1) throws Throwable {
		beforeAndAfterHooks.WebDriverMethodsobj.sendkeys("com.blazedemo.flightBookingPage.city", arg1);
		Thread.sleep(5000);
		beforeAndAfterHooks.WebDriverMethodsobj.sendkeys("com.blazedemo.flightBookingPage.city", Keys.RETURN);
		beforeAndAfterHooks.WebDriverMethodsobj.implecitwait();
	    throw new PendingException();
	}

	@Then("^I enter th <\"([^\"]*)\">$")
	public void i_enter_th(String arg1) throws Throwable {
		beforeAndAfterHooks.WebDriverMethodsobj.sendkeys("com.blazedemo.flightBookingPage.state", arg1);
		Thread.sleep(5000);
		beforeAndAfterHooks.WebDriverMethodsobj.sendkeys("com.blazedemo.flightBookingPage.state", Keys.RETURN);
		beforeAndAfterHooks.WebDriverMethodsobj.implecitwait();
	    throw new PendingException();
	}

	@Then("^enter the field <\"([^\"]*)\">$")
	public void enter_the_field(String arg1) throws Throwable {
		beforeAndAfterHooks.WebDriverMethodsobj.sendkeys("com.blazedemo.flightBookingPage.zipcode", arg1);
		Thread.sleep(5000);
		beforeAndAfterHooks.WebDriverMethodsobj.sendkeys("com.blazedemo.flightBookingPage.zipcode", Keys.RETURN);
		beforeAndAfterHooks.WebDriverMethodsobj.implecitwait();
	    throw new PendingException();
	}

	@Then("^I enter the card <\"([^\"]*)\">$")
	public void i_enter_the_card(String arg1) throws Throwable {
		beforeAndAfterHooks.WebDriverMethodsobj.sendkeys("com.blazedemo.flightBookingPage.CardType", arg1);
		Thread.sleep(5000);
		beforeAndAfterHooks.WebDriverMethodsobj.sendkeys("com.blazedemo.flightBookingPage.CardType", Keys.RETURN);
		beforeAndAfterHooks.WebDriverMethodsobj.implecitwait();
	    throw new PendingException();
	}

	@Then("^I enter the credit<\"([^\"]*)\">$")
	public void i_enter_the_credit(String arg1) throws Throwable {
		beforeAndAfterHooks.WebDriverMethodsobj.sendkeys("com.blazedemo.flightBookingPage.creditcardnumber", arg1);
		Thread.sleep(5000);
		beforeAndAfterHooks.WebDriverMethodsobj.sendkeys("com.blazedemo.flightBookingPage.creditcardnumber", Keys.RETURN);
		beforeAndAfterHooks.WebDriverMethodsobj.implecitwait();
	    throw new PendingException();
	}

	@Then("^I enter the month<\"([^\"]*)\">$")
	public void i_enter_the_month(String arg1) throws Throwable {
		beforeAndAfterHooks.WebDriverMethodsobj.sendkeys("com.blazedemo.flightBookingPage.month", arg1);
		Thread.sleep(5000);
		beforeAndAfterHooks.WebDriverMethodsobj.sendkeys("com.blazedemo.flightBookingPage.month", Keys.RETURN);
		beforeAndAfterHooks.WebDriverMethodsobj.implecitwait();
	    throw new PendingException();
	}

	@Then("^I enter the year <\"([^\"]*)\">$")
	public void i_enter_the_year(String arg1) throws Throwable {
		beforeAndAfterHooks.WebDriverMethodsobj.sendkeys("com.blazedemo.flightBookingPage.year", arg1);
		Thread.sleep(5000);
		beforeAndAfterHooks.WebDriverMethodsobj.sendkeys("com.blazedemo.flightBookingPage.year", Keys.RETURN);
		beforeAndAfterHooks.WebDriverMethodsobj.implecitwait();
	    throw new PendingException();
	}

	@Then("^I enter nameoncard <\"([^\"]*)\">$")
	public void i_enter_nameoncard(String arg1) throws Throwable {
		beforeAndAfterHooks.WebDriverMethodsobj.sendkeys("com.blazedemo.flightBookingPage.nameoncard", arg1);
		Thread.sleep(5000);
		beforeAndAfterHooks.WebDriverMethodsobj.sendkeys("com.blazedemo.flightBookingPage.nameoncard", Keys.RETURN);
		beforeAndAfterHooks.WebDriverMethodsobj.implecitwait();
	    throw new PendingException();
	}

	@Then("^I select <\"([^\"]*)\">$")
	public void i_select(String arg1) throws Throwable {
		WebElement target = beforeAndAfterHooks.WebDriverMethodsobj.findElement(By.id("com.blazedemo.flightBookingPage.RememberMe"));
		target.click();
		throw new PendingException();
	}

	@Then("^I Book the Flight$")
	public void i_Book_the_Flight() throws Throwable {
		beforeAndAfterHooks.WebDriverMethodsobj.click("com.blazedemo.flightBookingPage.BookFlight");
		beforeAndAfterHooks.WebDriverMethodsobj.implecitwait();
		String expectedUserClientPage = "Thank you for your purchase today!"; 
		 WebElement divElement = beforeAndAfterHooks.WebDriverMethodsobj.findElement(By.xpath(".//*[@id=\"container hero-unit\"]/h1[1]"));
		 String str = divElement.getText();
		 Assert.assertEquals(str, expectedUserClientPage,"Booked successfully");
		 beforeAndAfterHooks.WebDriverMethodsobj.quit();
		 
	    throw new PendingException();
	}

}
