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
  "name": "I Enter the departure city \"\u003cdeparture_city\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Enter the destination city \"\u003cdestination_city\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I click on Find Flight button and Verify flights displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I Select the Flight for from to To",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I enter name \"\u003cname\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "enter address \"\u003caddress\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I enter the city \"\u003ccity\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I enter the state \"\u003cstate\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "enter the zipcode \"\u003czipcode\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I enter the cardtype \"\u003cCardType\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I enter the creditcardno \"\u003ccreditcardnumber\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I enter the month \"\u003cmonth\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I enter the year \"\u003cyear\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I enter nameoncard \"\u003cnameoncard\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I check rememberme\"\u003cRememberMe\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "I Book Flight",
  "keyword": "Then "
});
formatter.examples({
  "line": 24,
  "name": "",
  "description": "",
  "id": "to-verify-finding-flights-based-on-departure-and-destination-selection;verifying-flights-details-display;",
  "rows": [
    {
      "cells": [
        "departure_city",
        "destination_city",
        "name",
        "address",
        "city",
        "state",
        "zipcode",
        "CardType",
        "creditcardnumber",
        "month",
        "year",
        "nameoncard",
        "RememberMe"
      ],
      "line": 25,
      "id": "to-verify-finding-flights-based-on-departure-and-destination-selection;verifying-flights-details-display;;1"
    },
    {
      "cells": [
        "Paris",
        "New York",
        "sherlock",
        "new york street",
        "new york",
        "new york",
        "12345",
        "Visa",
        "54321",
        "09",
        "2021",
        "Sherlockhome",
        "Yes"
      ],
      "line": 26,
      "id": "to-verify-finding-flights-based-on-departure-and-destination-selection;verifying-flights-details-display;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 155688200,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
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
  "name": "I Enter the departure city \"Paris\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Enter the destination city \"New York\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I click on Find Flight button and Verify flights displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I Select the Flight for from to To",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I enter name \"sherlock\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "enter address \"new york street\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I enter the city \"new york\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I enter the state \"new york\"",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "enter the zipcode \"12345\"",
  "matchedColumns": [
    6
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I enter the cardtype \"Visa\"",
  "matchedColumns": [
    7
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I enter the creditcardno \"54321\"",
  "matchedColumns": [
    8
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I enter the month \"09\"",
  "matchedColumns": [
    9
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I enter the year \"2021\"",
  "matchedColumns": [
    10
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I enter nameoncard \"Sherlockhome\"",
  "matchedColumns": [
    11
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "I check rememberme\"Yes\"",
  "matchedColumns": [
    12
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "I Book Flight",
  "keyword": "Then "
});
formatter.match({
  "location": "destinationSelection.application_url()"
});
formatter.result({
  "duration": 28551643300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Paris",
      "offset": 28
    }
  ],
  "location": "destinationSelection.i_Enter_the_departure_city(String)"
});
formatter.result({
  "duration": 148290700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New York",
      "offset": 28
    }
  ],
  "location": "destinationSelection.enter_the_destination_city(String)"
});
formatter.result({
  "duration": 120237800,
  "status": "passed"
});
formatter.match({
  "location": "destinationSelection.i_click_on_Find_Flight_button_and_Verify_flights_displayed()"
});
formatter.result({
  "duration": 1030071900,
  "status": "passed"
});
formatter.match({
  "location": "destinationSelection.i_Select_the_Flight_for_from_to_To()"
});
formatter.result({
  "duration": 2724605900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sherlock",
      "offset": 14
    }
  ],
  "location": "destinationSelection.i_enter_name(String)"
});
formatter.result({
  "duration": 5152321400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "new york street",
      "offset": 15
    }
  ],
  "location": "destinationSelection.enter_address(String)"
});
formatter.result({
  "duration": 5154720800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "new york",
      "offset": 18
    }
  ],
  "location": "destinationSelection.i_enter_the_city(String)"
});
formatter.result({
  "duration": 2133166300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "new york",
      "offset": 19
    }
  ],
  "location": "destinationSelection.i_enter_the_state(String)"
});
formatter.result({
  "duration": 2120446100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345",
      "offset": 19
    }
  ],
  "location": "destinationSelection.enter_the_zipcode(String)"
});
formatter.result({
  "duration": 2096043000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Visa",
      "offset": 22
    }
  ],
  "location": "destinationSelection.i_enter_the_cardtype(String)"
});
formatter.result({
  "duration": 173999000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "54321",
      "offset": 26
    }
  ],
  "location": "destinationSelection.i_enter_the_creditcardno(String)"
});
formatter.result({
  "duration": 2080903500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "09",
      "offset": 19
    }
  ],
  "location": "destinationSelection.i_enter_the_month(String)"
});
formatter.result({
  "duration": 2078011700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2021",
      "offset": 18
    }
  ],
  "location": "destinationSelection.i_enter_the_year(String)"
});
formatter.result({
  "duration": 2097226700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sherlockhome",
      "offset": 20
    }
  ],
  "location": "destinationSelection.i_enter_nameoncard(String)"
});
formatter.result({
  "duration": 2130966000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Yes",
      "offset": 19
    }
  ],
  "location": "destinationSelection.i_check_rememberme(String)"
});
formatter.result({
  "duration": 6023560100,
  "status": "passed"
});
formatter.match({
  "location": "destinationSelection.i_Book_Flight()"
});
formatter.result({
  "duration": 30081979600,
  "error_message": "org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document\n  (Session info: chrome\u003d85.0.4183.83)\n  (Driver info: chromedriver\u003d2.35.528161 (5b82f2d2aae0ca24b877009200ced9065a772e73),platform\u003dWindows NT 10.0.18363 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 12 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/stale_element_reference.html\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027DESKTOP-0I2DGSC\u0027, ip: \u0027192.168.31.189\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_261\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.35.528161 (5b82f2d2aae0ca24b877009200ced9065a772e73), userDataDir\u003dC:\\Users\\ADVANT~1\\AppData\\Local\\Temp\\scoped_dir22548_25721}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d85.0.4183.83, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003dignore}]\nSession ID: 042ffc2678be8861bad0930725ad7c81\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:671)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:272)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:82)\r\n\tat com.blazedemo.blazedemo.stepdefs.destinationSelection.i_Book_Flight(destinationSelection.java:261)\r\n\tat ✽.Then I Book Flight(001destinationSelection.feature:22)\r\n",
  "status": "failed"
});
formatter.write("URL at failure: https://blazedemo.com/purchase.php");
formatter.after({
  "duration": 2031057300,
  "status": "passed"
});
});