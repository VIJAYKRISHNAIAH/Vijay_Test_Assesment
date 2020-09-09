$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("001destinationSelection.feature");
formatter.feature({
  "line": 1,
  "name": "To verify Finding flights based on departure and destination selection",
  "description": "",
  "id": "to-verify-finding-flights-based-on-departure-and-destination-selection",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 3,
      "value": "#Test case 1-2"
    }
  ],
  "line": 4,
  "name": "verifying flights details display",
  "description": "",
  "id": "to-verify-finding-flights-based-on-departure-and-destination-selection;verifying-flights-details-display",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "Application url",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I Enter the \"\u003cdeparture_city\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Enter the \"\u003cdestination_city\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I click on Find Flights and Verify flights displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "to-verify-finding-flights-based-on-departure-and-destination-selection;verifying-flights-details-display;",
  "rows": [
    {
      "cells": [
        "departure_city",
        "destination_city"
      ],
      "line": 12,
      "id": "to-verify-finding-flights-based-on-departure-and-destination-selection;verifying-flights-details-display;;1"
    },
    {
      "cells": [
        "Paris",
        "New York"
      ],
      "line": 13,
      "id": "to-verify-finding-flights-based-on-departure-and-destination-selection;verifying-flights-details-display;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 352251600,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "verifying flights details display",
  "description": "",
  "id": "to-verify-finding-flights-based-on-departure-and-destination-selection;verifying-flights-details-display;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "Application url",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I Enter the \"Paris\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Enter the \"New York\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I click on Find Flights and Verify flights displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "destinationSelection.application_url()"
});
formatter.result({
  "duration": 23577861000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Paris",
      "offset": 13
    }
  ],
  "location": "destinationSelection.i_Enter_the(String)"
});
formatter.result({
  "duration": 76960219000,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat com.blazedemo.blazedemo.stepdefs.destinationSelection.i_Enter_the(destinationSelection.java:40)\r\n\tat ✽.Then I Enter the \"Paris\"(001destinationSelection.feature:7)\r\n",
  "status": "pending"
});
formatter.match({
  "arguments": [
    {
      "val": "New York",
      "offset": 11
    }
  ],
  "location": "destinationSelection.enter_the(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "destinationSelection.i_click_on_Find_Flights()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 459700,
  "status": "passed"
});
formatter.uri("002flightSelection.feature");
formatter.feature({
  "line": 1,
  "name": "To verify Selection of flight based on available flights",
  "description": "",
  "id": "to-verify-selection-of-flight-based-on-available-flights",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 3,
      "value": "#Test case 3-4"
    }
  ],
  "line": 4,
  "name": "verifying selected flight",
  "description": "",
  "id": "to-verify-selection-of-flight-based-on-available-flights;verifying-selected-flight",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I Select the Flight",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "to-verify-selection-of-flight-based-on-available-flights;verifying-selected-flight;",
  "rows": [
    {
      "cells": [
        "FlightNO"
      ],
      "line": 11,
      "id": "to-verify-selection-of-flight-based-on-available-flights;verifying-selected-flight;;1"
    },
    {
      "cells": [
        "43"
      ],
      "line": 12,
      "id": "to-verify-selection-of-flight-based-on-available-flights;verifying-selected-flight;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 10164300,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "verifying selected flight",
  "description": "",
  "id": "to-verify-selection-of-flight-based-on-available-flights;verifying-selected-flight;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I Select the Flight",
  "keyword": "Then "
});
formatter.match({
  "location": "flightSelection.i_Select_the_Flight()"
});
formatter.result({
  "duration": 5462160500,
  "error_message": "java.lang.NullPointerException\r\n\tat com.blazedemo.blazedemo.stepdefs.flightSelection.i_Select_the_Flight(flightSelection.java:11)\r\n\tat ✽.Then I Select the Flight(002flightSelection.feature:7)\r\n",
  "status": "failed"
});
formatter.write("URL at failure: data:,");
formatter.after({
  "duration": 2050865600,
  "status": "passed"
});
formatter.uri("003flightBooking.feature");
formatter.feature({
  "line": 1,
  "name": "To verify flight booking",
  "description": "",
  "id": "to-verify-flight-booking",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 3,
      "value": "#Test case 5-6"
    }
  ],
  "line": 4,
  "name": "verifying flight booked",
  "description": "",
  "id": "to-verify-flight-booking;verifying-flight-booked",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I enter \u003c\"name\"\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "enter \u003c\"address\"\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I enter the \u003c\"city\"\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I enter th \u003c\"state\"\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "enter the field \u003c\"zipcode\"\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I enter the card \u003c\"CardType\"\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I enter the credit\u003c\"creditcardnumber\"\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I enter the month\u003c\"month\"\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I enter the year \u003c\"year\"\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I enter nameoncard \u003c\"nameoncard\"\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I select \u003c\"RememberMe\"\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I Book the Flight",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "to-verify-flight-booking;verifying-flight-booked;",
  "rows": [
    {
      "cells": [
        "name",
        "address",
        "city",
        "state",
        "zipcode",
        "CardType",
        "creditcardnumber",
        "month",
        "yearnameoncard",
        "RememberMe"
      ],
      "line": 20,
      "id": "to-verify-flight-booking;verifying-flight-booked;;1"
    },
    {
      "cells": [
        "43",
        "new york street",
        "new york",
        "new york",
        "12345",
        "Visa",
        "54321",
        "09",
        "2021",
        "Yes"
      ],
      "line": 21,
      "id": "to-verify-flight-booking;verifying-flight-booked;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 17220700,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "verifying flight booked",
  "description": "",
  "id": "to-verify-flight-booking;verifying-flight-booked;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "I enter \u003c\"name\"\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "enter \u003c\"address\"\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I enter the \u003c\"city\"\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I enter th \u003c\"state\"\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "enter the field \u003c\"zipcode\"\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I enter the card \u003c\"CardType\"\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I enter the credit\u003c\"creditcardnumber\"\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I enter the month\u003c\"month\"\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I enter the year \u003c\"year\"\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I enter nameoncard \u003c\"nameoncard\"\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I select \u003c\"RememberMe\"\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I Book the Flight",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "name",
      "offset": 10
    }
  ],
  "location": "flightBookings.i_enter(String)"
});
formatter.result({
  "duration": 133401482300,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat com.blazedemo.blazedemo.stepdefs.flightBookings.i_enter(flightBookings.java:19)\r\n\tat ✽.Then I enter \u003c\"name\"\u003e(003flightBooking.feature:7)\r\n",
  "status": "pending"
});
formatter.match({
  "arguments": [
    {
      "val": "address",
      "offset": 8
    }
  ],
  "location": "flightBookings.enter(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "city",
      "offset": 14
    }
  ],
  "location": "flightBookings.i_enter_the(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "state",
      "offset": 13
    }
  ],
  "location": "flightBookings.i_enter_th(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "zipcode",
      "offset": 18
    }
  ],
  "location": "flightBookings.enter_the_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "CardType",
      "offset": 19
    }
  ],
  "location": "flightBookings.i_enter_the_card(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "creditcardnumber",
      "offset": 20
    }
  ],
  "location": "flightBookings.i_enter_the_credit(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "month",
      "offset": 19
    }
  ],
  "location": "flightBookings.i_enter_the_month(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "year",
      "offset": 19
    }
  ],
  "location": "flightBookings.i_enter_the_year(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "nameoncard",
      "offset": 21
    }
  ],
  "location": "flightBookings.i_enter_nameoncard(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "RememberMe",
      "offset": 11
    }
  ],
  "location": "flightBookings.i_select(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "flightBookings.i_Book_the_Flight()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 217400,
  "status": "passed"
});
});