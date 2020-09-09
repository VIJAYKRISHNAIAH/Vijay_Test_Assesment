package com.blazedemo.blazedemo.stepdefs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;


import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import com.blazedemo.FileOperations.LoadProperties;
import com.blazedemo.blazedemo.applicationconstants.ApplicationConstants;
import com.blazedemo.readxlsxfileutils.ReadXMLTestData;
import com.blazedemo.webdrivermethods.WebdriverMethods;


public class beforeAndAfterHooks {

	public static Map<String, String> dictionary = new HashMap<String, String>();
	public static NodeList nl = null;
	public static String testDataProviderTypeFlag = null;
	public static WebdriverMethods WebDriverMethodsobj;
	public static beforeAndAfterHooks befAfterobj;
	public static Logger Log;
	
	
	public beforeAndAfterHooks() {
		WebDriverMethodsobj = new WebdriverMethods();

	}

	
	@Before
	public void setupFramework(Scenario scn) throws FileNotFoundException, SAXException, IOException,
			XPathExpressionException, ParserConfigurationException {

		BasicConfigurator.configure();
		Log = Logger.getLogger(scn.getName());
		PropertyConfigurator.configure("log4j.properties");
		
		switch ((LoadProperties.DerivergetProperty(ApplicationConstants.TestData)).toUpperCase()) {

		case "SELF":
			testDataProviderTypeFlag = "SELF";
			Log.info("Test Data Flag - " + testDataProviderTypeFlag);
			break;

		case "XML":
			testDataProviderTypeFlag = "XML";
			Log.info("Test Data Flag - " + testDataProviderTypeFlag);
			ReadXMLTestData rdxml = new ReadXMLTestData();
			nl = rdxml.getNodes(scn.getName());
			for (int i = 0; null != nl && i < nl.getLength(); i++) {
				Node nod = nl.item(i);
				if (nod.getNodeType() == Node.ELEMENT_NODE) {
					if (dictionary.containsKey(nl.item(i).getNodeName())) {
					} else {

						// dictionary.put(nl.item(i).getNodeName(),
						// nod.getFirstChild().getNodeValue());
						dictionary.put(nl.item(i).getNodeName(), nod.getFirstChild().getNodeValue());
					}
				}

			}
			for (String key : dictionary.keySet())
				System.out.println(key + " : " + dictionary.get(key));

			break;

		case "DB":
			testDataProviderTypeFlag = "DB";
			Log.info("Test Data Flag - " + testDataProviderTypeFlag);

			break;
		}
	}

	@After
	public void embedScreenshot(Scenario scenario) {

		System.out.println(scenario.getName());

		
		if (scenario.isFailed()) {
			try {

				File screenshot = ((TakesScreenshot) WebDriverMethodsobj.getcurrentDriver())
						.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(screenshot,
						new File(System.getProperty("user.dir") + "\\Report\\ScreenShot\\" + "SYTEM_FAILURE" + ".jpg"));
				// scenario.embed(screenshot, "image");
				Log.info("Screen Shot Attached");
				scenario.write("URL at failure: " + WebDriverMethodsobj.getcurrentDriver().getCurrentUrl());
				System.out.println("before close");
				
				Log.info("Driver closed");
				System.out.println("After close");
			} catch (WebDriverException wde) {
				System.out.println("inside webdriver exception");
				System.err.println(wde.getMessage());
				Log.info("Scenario Failed - Coudn't attach screenshot", wde);
			} catch (ClassCastException cce) {
				System.out.println("inside class exception");
				cce.printStackTrace();
				Log.info("Scenario Failed - Coudn't attach screenshot", cce);
			} catch (Exception e) {
				System.out.println("inside general exception");
				e.printStackTrace();
			}finally {
				
				beforeAndAfterHooks.WebDriverMethodsobj.close();
				beforeAndAfterHooks.WebDriverMethodsobj.quit();
			}
		}
	}

}
