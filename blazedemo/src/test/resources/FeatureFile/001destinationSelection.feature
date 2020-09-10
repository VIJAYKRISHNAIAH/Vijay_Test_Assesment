Feature: To verify Finding flights based on departure and destination selection

#Test case 1-2
Scenario Outline: verifying flights details display 
	 
	Given Application url
	Then I Enter the departure city "<departure_city>"
	Then Enter the destination city "<destination_city>"
	Then I click on Find Flight button and Verify flights displayed
	Then I Select the Flight for from to To
	Then I enter name "<name>"
	Then  enter address "<address>"
	Then I enter the city "<city>"
	Then I enter the state "<state>"
	Then  enter the zipcode "<zipcode>"
	Then I enter the cardtype "<CardType>"
	Then I enter the creditcardno "<creditcardnumber>"
	Then I enter the month "<month>"
	Then I enter the year "<year>"
	Then I enter nameoncard "<nameoncard>"
	Then I check rememberme"<RememberMe>"
	Then I Book Flight
	
	Examples: 
	|departure_city|destination_city|name      |address		   |city    |state   |zipcode|CardType|creditcardnumber|month|year|nameoncard  |RememberMe|
	|Paris         |New York        |sherlock  |new york street|new york|new york|12345  |Visa    |54321           |09   |2021|Sherlockhome|Yes       |
		
		
