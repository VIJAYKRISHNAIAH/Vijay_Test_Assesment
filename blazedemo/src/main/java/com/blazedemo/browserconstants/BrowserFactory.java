package com.blazedemo.browserconstants;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserFactory {
	
	public static WebDriver driver;

	/**
	 * This method will open browser according to user argument passed
	 * 
	 * @param browser
	 * @return it will return the driver
	 * @throws IOException
	 */
	public static WebDriver getbrowser(String browser) throws IOException {
		switch (browser.toUpperCase()) {
		
		case "CHROME":
			driver = chromebrowser();
			break;
		

		}
		return driver;

	}

	/**
	 * This will open chrome browser
	 * 
	 * @return it will return the driver
	 */
	public static WebDriver chromebrowser() {
		try {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\main\\resources\\browserservers\\chromedriver.exe");
			
		       //String downloadFilepath = System.getProperty("user.dir")+"\\src\\test\\resources\\TestDataxlsxfiles";

		       HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		       chromePrefs.put("profile.default_content_settings.popups", 0);
		      // chromePrefs.put("download.default_directory", downloadFilepath);
		       ChromeOptions options = new ChromeOptions();
		       HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
		       options.setExperimentalOption("prefs", chromePrefs);
		       options.addArguments("--test-type");
		       options.addArguments("--disable-extensions"); //to disable browser extension popup
		       options.addArguments("-incognito --start-maximized");
		       options.addArguments("disable-infobars");
		       
		       DesiredCapabilities cap = DesiredCapabilities.chrome();
		       cap.setCapability(ChromeOptions.CAPABILITY, chromeOptionsMap);
		       cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		       cap.setCapability(ChromeOptions.CAPABILITY, options);
		       cap.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
			   cap.setCapability(ChromeOptions.CAPABILITY, options);
			
			
			   driver = new ChromeDriver(cap);
			   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			   driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			   driver.manage().window().maximize();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return driver;
	}



}
