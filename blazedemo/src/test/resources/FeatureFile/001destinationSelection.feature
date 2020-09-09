Feature: To verify Finding flights based on departure and destination selection

#Test case 1-2
Scenario Outline: verifying flights details display 
	 
	Given Application url
	Then I Enter the "<departure_city>"
	Then Enter the "<destination_city>"
	Then I click on Find Flights and Verify flights displayed
	
	Examples: 
		|departure_city|destination_city| 
		|Paris     |New York      | 
		
		
