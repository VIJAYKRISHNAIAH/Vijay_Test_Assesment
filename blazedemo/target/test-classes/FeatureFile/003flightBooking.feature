Feature: To verify flight booking

#Test case 5-6
Scenario Outline: verifying flight booked
	 
	
	Then I enter <"name">
	Then  enter <"address">
	Then I enter the <"city">
	Then I enter th <"state">
	Then  enter the field <"zipcode">
	Then I enter the card <"CardType">
	Then I enter the credit<"creditcardnumber">
	Then I enter the month<"month">
	Then I enter the year <"year">
	Then I enter nameoncard <"nameoncard">
	Then I select <"RememberMe">
	Then I Book the Flight
	Examples: 
		|name|address		 |city    |state   |zipcode|CardType|creditcardnumber|month|yearnameoncard|RememberMe|
		|43  |new york street|new york|new york|12345  |Visa    |54321           |09   |2021          |Yes |